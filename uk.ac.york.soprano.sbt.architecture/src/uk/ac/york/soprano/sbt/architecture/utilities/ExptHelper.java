package uk.ac.york.soprano.sbt.architecture.utilities;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.buildobjects.process.ProcBuilder;
import org.buildobjects.process.ProcResult;

public class ExptHelper {
	public static Process startNewJavaProcess(final String optionsAsString, final String mainClass,
			final String[] arguments, String path) throws IOException {

		ProcessBuilder processBuilder = ExptHelper.createJVMProcess(optionsAsString, mainClass, arguments);
		processBuilder.directory(new File(path));

		Process process = processBuilder.start();
		InputStream stdout = process.getInputStream();
		InputStream stderr = process.getErrorStream();
		Thread threadOut = new Thread(new MyInputStreamSink(stdout, "out"));
		Thread threadErr = new Thread(new MyInputStreamSink(stderr, "err"));

		threadOut.setDaemon(true);
		threadErr.setDaemon(true);
		threadOut.setName(String.format("stdout reader"));
		threadErr.setName(String.format("stderr reader"));
		threadOut.start();
		threadErr.start();
		return process;
	}

	public static ProcessBuilder createJVMProcess(final String optionsAsString, final String mainClass,
			final String[] arguments) {
		String jvm = System.getProperty("java.home") + File.separator + "bin" + File.separator + "java";
		String classpath = System.getProperty("java.class.path");

		String[] options = optionsAsString.split(" ");
		List<String> command = new ArrayList<String>();
		command.add(jvm);
		command.addAll(Arrays.asList(options));
		command.add(mainClass);
		command.addAll(Arrays.asList(arguments));

		System.out.println("command: " + String.join(" ", command));
		ProcessBuilder processBuilder = new ProcessBuilder(command);
		Map<String, String> environment = processBuilder.environment();
		environment.put("CLASSPATH", classpath);
		return processBuilder;
	}

	public static Process startScript(String path, String scriptFile) throws IOException {
		System.out.println("Starting script " + scriptFile);
		ProcessBuilder pb = new ProcessBuilder("/bin/bash", "-c", path + "/" + scriptFile);
		pb.directory(new File(path));
		Process proc = pb.start();
		return proc;
	}

	public static Process startScriptWithArg(String path, String scriptFile, String arg) throws IOException {
		System.out.println("Starting script " + scriptFile);
		ProcessBuilder pb = new ProcessBuilder("/bin/bash", "-c", path + "/" + scriptFile + " " + arg);
		pb.directory(new File(path));
		Process proc = pb.start();
		return proc;
	}

	public static Process startCmd(String path, String cmd) throws IOException {
		System.out.println("Starting command " + cmd);
		ProcessBuilder pb = new ProcessBuilder("/bin/bash", "-c", path + "/" + cmd);
		pb.directory(new File(path));
		Process proc = pb.start();
		return proc;
	}

	public static Process startCmdByFullPath(String fullPathCmd, String dir) throws IOException {
		System.out.println("Starting command " + fullPathCmd);
		ProcessBuilder pb = new ProcessBuilder("/bin/bash", "-i -c", fullPathCmd);
		pb.directory(new File(dir));
		Process proc = pb.start();
		return proc;
	}

	public static void runCommandQuitTimeout(String dir, String command, String arg, long timeoutMillis) {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		File dirFile = new File(dir);
		ProcBuilder pb = new ProcBuilder(command).withArg(arg).withOutputStream(output).withWorkingDirectory(dirFile)
				.withTimeoutMillis(timeoutMillis);
		try {
			ProcResult res = pb.run();
		} catch (org.buildobjects.process.TimeoutException e) {
			System.out.println("5 seconds after start reached");
		}
	}

	public static void runScriptNew(String dir, String command, String arg) {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		File dirFile = new File(dir);
		ProcBuilder pb = new ProcBuilder(command).withArg(arg).withOutputStream(output).withWorkingDirectory(dirFile);
		try {
			ProcResult res = pb.run();
		} catch (org.buildobjects.process.TimeoutException e) {
			System.out.println("Ignoring timeout exception when launching");
		}
	}

	public static void runScriptNew(String dir, String command) {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		File dirFile = new File(dir);
		System.out.println("dir = " + dir);
		System.out.println("command = " + command);

		ProcBuilder pb = new ProcBuilder(command).withOutputStream(output).withWorkingDirectory(dirFile)
				.withNoTimeout();
		try {
			ProcResult res = pb.run();
		} catch (org.buildobjects.process.TimeoutException e) {
			System.out.println("Ignoring timeout exception when launching");
		}
	}

	/* This runs the command in-process, without a timeout and stores it is output into the returned ProcResult.
	 * If there is a failure, empty is returned */
	public static Optional<ProcResult> runScriptWithArgs(String dir, String command, String [] args) {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		File dirFile = new File(dir);
		System.out.println("dir = " + dir);
		System.out.println("command = " + command);

		ProcBuilder pb = new ProcBuilder(command).withWorkingDirectory(dirFile).withNoTimeout().withArgs(args);
		try {
			ProcResult res = pb.run();
			return Optional.of(res);
		} catch (org.buildobjects.process.TimeoutException e) {
			System.out.println("Ignoring timeout exception when launching");
			return Optional.empty();
		}
	}
	
	/* This runs the command in-process, without a timeout and stores it is output into the returned ProcResult.
	 * If there is a failure, empty is returned */
	public static Optional<ProcResult> runScriptWithArgs(String dir, String command, String arg1) {
		String [] cmdArgs = {arg1};
		return runScriptWithArgs(dir, command, cmdArgs);
	}

	public static void runScriptNewWithBash(String dir, String command) {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		File dirFile = new File(dir);
		long timeOutMs = 15000;
		System.out.println("dir = " + dir);
		System.out.println("command = " + command);

		ProcBuilder pb = new ProcBuilder("xterm").withArgs("-hold", "-e", "/bin/bash", "-l", "-c", command)
				.withWorkingDirectory(dirFile).withTimeoutMillis(timeOutMs).withOutputStream(output);
		try {
			ProcResult res = pb.run();
			System.out.println(output.toString());
		} catch (org.buildobjects.process.TimeoutException e) {
			System.out.println("Timeout of started process");
		}
	}

	public static void runScriptNewThread(String dir, String command) {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		File dirFile = new File(dir);
		// long timeOutMs = 15000;
		System.out.println("dir = " + dir);
		System.out.println("command = " + command);

		Thread tNew = new Thread() {
			public void run() {
				ProcBuilder pb = new ProcBuilder("xterm").withArgs("-hold", "-e", "/bin/bash", "-l", "-c", command)
						.withWorkingDirectory(dirFile).withOutputStream(output).withNoTimeout();
				try {
					ProcResult res = pb.run();
					System.out.println(res.toString());
					System.out.println(output.toString());
				} catch (org.buildobjects.process.TimeoutException e) {
					System.out.println("Timeout of started process");
				}
			}
		};

		tNew.start();
	}

	public static void runScriptNewWithBashTimeout(String dir, String command, long timeOutSeconds) {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		File dirFile = new File(dir);
		long timeOutMs = timeOutSeconds * 1000;
		System.out.println("dir = " + dir);
		System.out.println("command = " + command);

		ProcBuilder pb = new ProcBuilder("xterm").withArgs("-hold", "-e", "/bin/bash", "-l", "-c", command)
				.withWorkingDirectory(dirFile).withTimeoutMillis(timeOutMs).withOutputStream(output);
		try {
			ProcResult res = pb.run();
			System.out.println(output.toString());
		} catch (org.buildobjects.process.TimeoutException e) {
			System.out.println("Timeout of started process");
		}
	}

	public static void runScriptNew(String dir, String command, String[] args) {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		File dirFile = new File(dir);
		ProcBuilder pb = new ProcBuilder(command).withArgs(args).withOutputStream(output).withWorkingDirectory(dirFile);
		try {
			ProcResult res = pb.run();
		} catch (org.buildobjects.process.TimeoutException e) {
			System.out.println("Ignoring timeout exception when launching");
		}
	}
}