#!/bin/sh

cd ~/source/kafka/kafka_2.12-3.1.0/bin

./kafka-topics.sh --bootstrap-server localhost:9092 --delete --topic OUT &
./kafka-topics.sh --bootstrap-server localhost:9092 --delete --topic IN &
./kafka-topics.sh --bootstrap-server localhost:9092 --delete --topic metricMessages &
./kafka-topics.sh --bootstrap-server localhost:9092 --delete --topic controlMessages &
echo "All cleared"
