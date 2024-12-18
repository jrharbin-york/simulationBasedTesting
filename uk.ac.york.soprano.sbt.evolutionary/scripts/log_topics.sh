#!/bin/bash

echo "ROS topic logging terminal"
echo $PATH
echo "Sourcing"
. /opt/ros/melodic/setup.bash
. ~/catkin_ws/devel/setup.bash
echo $PATH

sleep 20
echo "Starting ROS topic logging"
rostopic echo -p /tb3_0/cmd_vel > $1_cmd_vel_0 &
rostopic echo -p /tb3_0/cmd_velIN > $1_cmd_velIN_0 &
rostopic echo -p /tb3_0/amcl_pose > $1_amcl_pose_0 &

rostopic echo -p /tb3_1/cmd_vel > $1_cmd_vel_1 &
rostopic echo -p /tb3_1/cmd_velIN > $1_cmd_velIN_1 &
rostopic echo -p /tb3_1/amcl_pose > $1_amcl_pose_1 &

rostopic echo -p /tb3_2/cmd_vel > $1_cmd_vel_2 &
rostopic echo -p /tb3_2/cmd_velIN > $1_cmd_velIN_2 &
rostopic echo -p /tb3_2/amcl_pose > $1_amcl_pose_2
sleep 300
