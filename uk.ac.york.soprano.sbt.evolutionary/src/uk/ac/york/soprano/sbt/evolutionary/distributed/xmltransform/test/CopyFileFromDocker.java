package uk.ac.york.soprano.sbt.evolutionary.distributed.xmltransform.test;

// Example from: https://github.com/docker-java/docker-java/issues/991

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.io.IOUtils;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.CreateContainerCmd;
import com.github.dockerjava.core.DockerClientBuilder;

public class CopyFileFromDocker {
    public static void main(String[] args) throws IOException {
        // Data
        String imageId = "cuda_v6_fixedscript";
        String containerName = "cuda-v6-remapped-scanout-sourceContainer";
        String containerFile = "/home/user/sesame_ws/install/share/pal_gazebo_worlds/worlds/pal_kitchen.world";
        String hostFile = "/tmp/target.txt";

        // Docker client
        DockerClient dockerClient = DockerClientBuilder.getInstance().build();

        // Create container
        try (CreateContainerCmd createContainer = dockerClient
                .createContainerCmd(imageId).withName(containerName)) {
            createContainer.withTty(true);
            createContainer.exec();
        }

        // Start container
        dockerClient.startContainerCmd(containerName).exec();

        // Copy file from container
        try (TarArchiveInputStream tarStream = new TarArchiveInputStream(
                dockerClient.copyArchiveFromContainerCmd(containerName,
                        containerFile).exec())) {
            unTar(tarStream, new File(hostFile));
        }

        // Stop container
        dockerClient.killContainerCmd(containerName).exec();

        // Remove container
        dockerClient.removeContainerCmd(containerName).exec();
    }

    public static void unTar(TarArchiveInputStream tis, File destFile)
            throws IOException {
        TarArchiveEntry tarEntry = null;
        while ((tarEntry = tis.getNextTarEntry()) != null) {
            if (tarEntry.isDirectory()) {
                if (!destFile.exists()) {
                    destFile.mkdirs();
                }
            } else {
                FileOutputStream fos = new FileOutputStream(destFile);
                IOUtils.copy(tis, fos);
                fos.close();
            }
        }
        tis.close();
    }

}
