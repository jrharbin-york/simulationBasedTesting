
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
