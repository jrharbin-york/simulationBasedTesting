# Troubleshooting

## "Problems encountered" on loading the model
If you exit and then reload the child Eclipse, you may find that you
get "Problems encountered..." on loading the model. In this case,
right-click on the project, select "Generate SESAME Code" and then
when the wizard pops up, choose "Cancel". This will re-register the
metamodels.

## Windows installation - KUKA machines with Windows installation

If, on attempting to import projects, you get errors such as the
following: "artifact download failed" and "PKIX path building failed":

https://stackoverflow.com/questions/21076179/pkix-path-building-failed-and-unable-to-find-valid-certification-path-to-requ

This is caused by the KUKA firewall replacing the certificates
silently, making the certification verification for Java dependencies
fail.

To workaround, go in each the project directories under Cygwin
```~/academic/sesame/WP6/simulationBasedTesting```, add a directory
*.mvn* under them, and in it, a text file *maven.config*: this file
should contain

```
-Djavax.net.ssl.trustStoreType=WINDOWS-ROOT
```

In this case, whenever you generate a custom projects under the child
Eclipse, you will also need to add an equivalent file
*.mvn/maven.config* with this WINDOWS_ROOT fix

## Kafka message bus problems
If Kafka is giving errors on the terminal at the end of the launch
process, try Ctrl-C to restarting both Kafka and Zookeeper. For some
reason, especially on Windows, it sometimes fails to start properly.

## Debugging problems with tests
If the test runner is not launching tests properly, it is recommended to
go to the low-level tests (under "src" / "(default package") and
create Eclipse Run Configurations to launch them directly. This way,
console messages can be seen.

## gRPC failures to connect
If gRPC fails to connect when launching tests (either constantly or intermittently), try
increasing the timeout *launchDelaySeconds* under

# Additional instructions for ROS use case
[Additional instructions for ROS use cases](./INSTALL-linux-ros.md)
