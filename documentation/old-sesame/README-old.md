# SESAME Simulation-Based Testing Platform Installation Guide

This repository presents the installation guide and source code for
the SESAME simulation-based testing platform developed for the system.
The software, its design principles and rationale are described in the
SESAME deliverable documents

- D6.2: D6.2 Simulation-Based Testing Methodology for EDDIs
- D6.3: Tools for Automated Quality Assurance of EDDI-Supported MRS (Initial Version)

This online guide complements D6.3 in reference to providing
installation instructions for the platform.

# Installation Video

An installation instructions video for the platform is presented below:
This uses the "development-release-aug2022" branch:

[Installation video](https://drive.google.com/file/d/1O_F2LPpgkkYIkHfmnHXhXkFeUero5v6l/view?usp=sharing)

Please use the video instructions rather than the previous install
instructions, since several steps e.g. setting paths, have been
altered.

# TurtleSim Case Study

The TurtleSim case study provides a simple ROS-based test for the
Simulation-based Testing platform.

## Dependencies

Please install the following packages (tested on Ubuntu 18.04 for ROS
Melodic):

```
apt-get install ros-melodic-turtlebot3-*
apt-get install ros-melodic-turtlesim-*
apt-get install ros-melodic-rosbridge-server
```

## Patching for jrosbridge

This applies when using the ROS interface for the testing platform.

Because of a problem with jrosbridge (that is used for connecting the
ROS interface to the testing platform), it is necessary to patch a
certain system package for jrosbridge to work on recent Ubuntu versions.
For more information on why this is necessary, please see
[here](https://github.com/RobotWebTools/rosbridge_suite/issues/488)

Please go to the directory **REPO_BASE_PATH/patches** and run the
commands below. (Note this assumes the Python version used for the
rosbridge python components is Python 2.7, it may be a later version
in ROS versions beyond ROS Melodic).

```

export PATCH_DIR=/usr/lib/python2.7/dist-packages/autobahn/websocket
sudo cp ./python_protocol_patch.py $PATCH_DIR
cd $PATCH_DIR
sudo cp protocol.py protocol.py.orig
sudo patch < python_protocol_patch.py
```

To restore everything  its previous state, please use the following
commands:

```
PATCH_DIR=/usr/lib/python2.7/dist-packages/autobahn/websocket
cd $PATCH_DIR
sudo cp protocol.py.orig protocol.py
```

## Running the TurtleSim Case Study

- Ensure the Turtlesim example itself runs properly as described
  [here](http://wiki.ros.org/turtlesim):

- Pull the latest from the "development-release-aug2022" branch

- In the parent Eclipse:

- Ensure the variable **REPO_BASE_PATH** in the project
uk.ac.york.testing.evolutionary.utilities file, PathDefinitions.java
is set to the absolute path of the root directory in which you checked
out this repository

- The same for **REPO_BASE_PATH** in the project
uk.ac.york.testing.generator, file ModelPathDefinitions.java (again,
this should be set to the absolute path of the root directory in which
you checked out this repository)

- Then for all the listed SESAME projects (except for
uk.ac.york.sesame.testing.generator), right-click on each of them,
select "Run As"... "Maven Install". This makes sure updated JARs are
built for all of them.

- Enter the child Eclipse by right-clicking on selecting the
uk.ac.york.sesame.testing.generator project, and selecting

- Create a new "testTurtle" Java project and copy the models and code
files for the development branch from:
[runtime-EclipseApplication/testTurtle](https://github.com/sesame-project/simulationBasedTesting/tree/development-release-aug2022/runtime-EclipseApplication/testTurtle)
into this project, including "src", "models" and "pom.xml". If you
checked out the development-release-aug2022 branch, this can be found
under your local system on
$REPO_BASE_PATH/runtime-EclipseApplication/testTurtle.

- Copy the ROS launch file
[test.launch](https://github.com/sesame-project/simulationBasedTesting/blob/development-release-aug2022/temp-launch-scripts/launch-scripts/test.launch)
into: $HOME/catkin_ws/src/turtle_custom_launch/launch/test.launch

- Change the MRS launch file path path to your filesystem in
testTurtle.model (in "TestingSpace", "MRS", "Launch File Location") to
the correct path on your system.

- Try generating the code based upon the model testTurtle.model

- Execute the new test runner for ExptRunner_firstExperiment.  This
should start the simulator.

- When it starts, select the "Reading from keyboard" xterm and
use the arrow keys to drive it; when fuzzing is active the
velocities will be replaced by random values.

Try cleaning and rebuilding the project in case of any problems.

If you reload the child Eclipse, you may find that you get "Problems
encountered..." on loading the model. In this case, right-click on the
project, select "Generate SESAME Code" and then when the wizard
pops up, choose "Cancel". This will re-register the metamodels.
