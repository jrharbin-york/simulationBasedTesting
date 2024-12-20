# Base OS
FROM ros:noetic-ros-core-focal

# TODO
# https://askubuntu.com/questions/1173337/how-to-prevent-system-from-being-minimized

# Install utilites
RUN date

RUN apt-get -y update
RUN apt-get -y install apt-utils
RUN apt-get -y install emacs vim maven procps wget openjdk-17-jdk openjdk-11-jdk openjdk-17-jdk openjdk-11-jre openjdk-17-jre openjdk-8-jdk openjdk-8-jre ros-noetic-rosbridge-server nano git xterm docker.io docker-compose docker-compose-v2 sudo socat python3-venv python3-pip ssh net-tools rsync tree ack
RUN apt-get clean

# Create user, set options
RUN useradd -ms /bin/bash simtesting
RUN echo "simtesting:simtesting" | chpasswd
RUN usermod -aG sudo simtesting
RUN usermod -aG docker simtesting
ARG DEBIAN_FRONTEND=noninteractive
USER simtesting
WORKDIR /home/simtesting

# Install eclipse installer

# Specifications for download of the director application

ARG ECLIPSE_OPERATING_SYSTEM="linux64"
ARG ECLIPSE_INSTALLER_ARCHIVE_FILE="eclipse-inst-${ECLIPSE_OPERATING_SYSTEM}.tar.gz"
ARG ECLIPSE_INSTALLER_DOWNLOAD_URL="https://www.eclipse.org/downloads/download.php?file=/oomph/products/${ECLIPSE_INSTALLER_ARCHIVE_FILE}&r=1"

RUN echo "Downloading from '${ECLIPSE_INSTALLER_DOWNLOAD_URL}'"
RUN wget --quiet --max-redirect=1 --output-document="${ECLIPSE_INSTALLER_ARCHIVE_FILE}" "${ECLIPSE_INSTALLER_DOWNLOAD_URL}"
RUN tar --extract --warning=no-unknown-keyword --file=${ECLIPSE_INSTALLER_ARCHIVE_FILE}
RUN rm ${ECLIPSE_INSTALLER_ARCHIVE_FILE}

# Install "base" eclipse

# Run the following commands in the eclipse installation directory
WORKDIR /home/simtesting/eclipse-installer

# Specifications for the installation to be performed
# Repositories that the P2 director should use as sources to obtain the Installable Units (IUs)

ARG P2_REPOSITORIES=\
https://mirror.aarnet.edu.au/pub/eclipse/releases/latest,\
https://mirror.aarnet.edu.au/pub/eclipse/eclipse/updates/latest,\
https://mirror.aarnet.edu.au/pub/eclipse/epsilon/interim,\
https://mirror.aarnet.edu.au/pub/eclipse/emfatic/update,\
https://mirror.aarnet.edu.au/pub/eclipse/modeling/gmp/gmf-tooling/updates/releases,\
https://mirror.aarnet.edu.au/pub/eclipse/birt/update-site/latest

ARG INSTALLABLE_UNITS=\
org.eclipse.sdk.ide,\
org.eclipse.epsilon.core.dt.feature.feature.group,\
org.eclipse.epsilon.core.feature.feature.group,\
org.eclipse.epsilon.emf.dt.feature.feature.group,\
org.eclipse.epsilon.emf.feature.feature.group,\
org.eclipse.epsilon.eunit.dt.emf.feature.feature.group,\
org.eclipse.epsilon.evl.emf.validation.feature.feature.group,\
org.eclipse.epsilon.hutn.dt.feature.feature.group,\
org.eclipse.emf,\
org.eclipse.emf.cdo.sdk.feature.group,\
org.eclipse.emf.emfatic.core,\
org.eclipse.wst.wsdl,\
 org.eclipse.xsd.sdk.feature.group,\
org.eclipse.emf.emfatic.feature.group,\
org.eclipse.m2e.feature.feature.group,\
org.eclipse.m2e.pde.feature.feature.group,\
org.eclipse.m2e.logback.feature.feature.group

ARG INSTALL_DIR=/home/simtesting/eclipse/

RUN ./eclipse-inst \
-nosplash \
-consoleLog \
-application org.eclipse.equinox.p2.director \
-repository ${P2_REPOSITORIES} \
-installIU ${INSTALLABLE_UNITS} \
-profile SDKProfile \
-profileProperties org.eclipse.update.install.features=true \
-destination ${INSTALL_DIR}

# Sim-testing platform args
ARG SIM_TEST_ROOT=/home/simtesting/simtesting
ARG SBT_REPO_ROOT=${SIM_TEST_ROOT}/simulationBasedTesting
ARG SIM_TEST_REPO=https://www.github.com/sesame-project/simulationBasedTesting.git
ARG SIM_TEST_BRANCH=distributed-expt

# Sim-testing platform args
RUN mkdir -p ${SIM_TEST_ROOT}  && cd ${SIM_TEST_ROOT} && git clone ${SIM_TEST_REPO} -b ${SIM_TEST_BRANCH}

# Plugin for project import
COPY extra-files/*.jar ${INSTALL_DIR}/plugins

# Setup Kafka and Flink
# These are not needed for distributed system!

#ARG KAFKA_DIR=/home/simtesting/source/kafka
#ARG KAFKA_ARCHIVE=kafka_2.13-3.1.0.tgz
#ARG KAFKA_URL=https://archive.apache.org/dist/kafka/3.1.0/${KAFKA_ARCHIVE}
#RUN mkdir -p ${KAFKA_DIR} && cd ${KAFKA_DIR} && wget ${KAFKA_URL} && tar -xvzf ${KAFKA_ARCHIVE}

ARG WORKER_DAEMON_DIR=/home/simtesting/soprano/
RUN mkdir -p ${WORKER_DAEMON_DIR}
RUN cd ${WORKER_DAEMON_DIR} && git clone https://github.com/jrharbin-york/SPworkerTemp
RUN python3 -m venv ${HOME}/venvs/pyro

# Import projects into Eclipse
RUN ${INSTALL_DIR}/eclipse -nosplash -application com.seeq.eclipse.importprojects.headlessimport \
    -data ~/workspace \
    -import ${SBT_REPO_ROOT}/uk.ac.york.sesame.testing.generator/ \
    -import ${SBT_REPO_ROOT}/uk.ac.york.sesame.testing.architecture/ \
    -import ${SBT_REPO_ROOT}/jrosbridge/ \
    -import ${SBT_REPO_ROOT}/uk.ac.york.sesame.testing.architecture.ros/ \
    -import ${SBT_REPO_ROOT}/uk.ac.york.sesame.testing.dsl/ \
    -import ${SBT_REPO_ROOT}/jgea/ \
    -import ${SBT_REPO_ROOT}/uk.ac.york.sesame.testing.evolutionary/ \
    -import ${SBT_REPO_ROOT}/uk.ac.york.sesame.testing.setup/

# Run DiscoverPaths automatically to set the paths!
RUN cd ${SBT_REPO_ROOT}/uk.ac.york.sesame.testing.setup && mvn compile exec:java -Dexec.mainClass="uk.ac.york.sesame.testing.setup.DiscoverPaths"

# This is an example source directory
RUN mkdir ${HOME}/shared-code

# Set script to run the Pyro nameserver automatically

# Copy the example project TestingPAL into ~/runtime-EclipseApplication/
RUN cp -rv ${SBT_REPO_ROOT}/example-projects/ ${HOME}/runtime-EclipseApplication/
RUN cp -rv ${SBT_REPO_ROOT}/example-projects/PALTesting ${HOME}/shared-code/
# Remaining steps

# SSHd needs to be set to active and running on a custom port
RUN sed -i 's/#Port 22/Port 39222/' sshd_config

# Need to mvn install the projects before they will work in the child Eclipse
# jrosbridge needs to skip the tests
RUN cd ${SBT_REPO_ROOT}/jrosbridge/ && mvn install -Dmaven.test.skip=true
RUN cd ${SBT_REPO_ROOT}/jgea/ && mvn install
RUN cd ${SBT_REPO_ROOT}/uk.ac.york.sesame.testing.architecture/ && mvn install
RUN cd ${SBT_REPO_ROOT}/uk.ac.york.sesame.testing.architecture.ros/ && mvn install
RUN cd ${SBT_REPO_ROOT}/uk.ac.york.sesame.testing.dsl/ && mvn install
RUN cd ${SBT_REPO_ROOT}/uk.ac.york.sesame.testing.evolutionary/ && mvn install

# Fixes in the generator with TestingPAL.model
# CHECK: pom.xml in the generated project needs to be set to use JDK 11
# CHECK: project pom files in the host Eclipse need to be set to use JDK11

# Copy the example project to the code generation directory too!
