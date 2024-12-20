# Additional instructions for ROS use cases
Ensure the following additional packages are installed (substitute
VERSION for your ROS version):

```
apt-get install ros-VERSION-rosbridge-server
```

## Patching for jrosbridge

(This should no longer be necessary now there is an included
"jrosbridge" branch)

But if it is needed, [follow the patching process here ROS use cases](./INSTALL-linux-ros-jrosbridge.md)

## Testing the PAL Case Study

- Ensure a PAL Simulation docker is ready, based on cuda-v5 or
later. The Docker has to have the changed launch script order
mentioned in [this Gitlab
issue](https://gitlab.com/pal-robotics/sesame/dockers/-/issues/6).
This is needed in the order for the project to have the changed
timings and allow ROSBridge to connect

- You can load a pre-made example project from Git (including metrics
  and custom fuzzing operations) to test the simulation testing
  platform, without using the first-stage code generation.

- Select to Import Maven Project, Import the "PALTesting" project from
```
GITHUB_ROOT/runtime-EclipseApplication
```

- The project may come up named "testAutoGen", rename it to "PALTesting" using
  right-click "Refactor"..."Rename"

- Check the project builds correctly... you may have to use
  "Project"..."Clean" to clear out the projects and rebuild.
  
- Load the testing model from
  "models/TestingPAL-passivemonitor.model". This model is just to
  passively monitor the case study (no fuzzing).

- Go to the MRS node and select "Launch File Location". Set it to:
```
GITHUB_ROOT/runtime-EclipseApplication/PALTesting/pal-docker/scripts/run_pal_cuda_v5_passive.sh
```
(not GITHUB_ROOT literally, sustitute its contents there)

- Open the selected launch file script and check the path to
  *pal_docker.sh*, and the Docker image name.

- Create a symlink for "eclipse-workspace/PALTesting".
```
ln -s $GITHUB_ROOT/runtime-EclipseApplication/PALTesting ~/eclipse-workspace/PALTesting
```

- Open "src/main/EvolutionaryRunnerPALTestingNullFuzzing.java", check
  the paths within it are correct (some, e.g. *spaceModelFileName* and
  *grammarPath* may need updating to use correct USERNAME)
  
## Setting the classpath

The first time running the platform on a new PC, the classpath will
need to be set to launch the test runners, or they will not launch
properly. To find the suitable classpath, go to "src/(default
package)" and right-click one of the generated test runners, e.g
*Test_xxx.java*. Select "Run As"..."Run Configurations", and select
"Show Command Line"

- Select the classpath (the contents of -*classpath* variable,
  everything before main.EvolutionaryRunnerPALTesting...), press
  Ctrl-C to copy it.

- Using a text editor, paste the selected classpath into the file
  **GITHUB_ROOT/uk.ac.york.sesame.testing.evolutionary/scripts/classpath**.
  It should list all classes on one line. 
  
## Running null fuzzing test

After setting the classpath, running
*EvolutionaryRunnerPALTestingNullFuzzing.java* should execute a null
fuzzing test repeatedly, logging the metrics under Test Campaign
**nullFuzzing-passive**.

## To clear Kafka and stop simulations

If a stray simulation is left running, terminate it with the script:
```
GITHUB_ROOT/uk.ac.york.sesame.testing.evolutionary/scripts/terminate_sim.sh
```
  
To clear the Kafka queues:
```
GITHUB_ROOT/uk.ac.york.sesame.testing.evolutionary/scripts/clear_kafka.sh
```
