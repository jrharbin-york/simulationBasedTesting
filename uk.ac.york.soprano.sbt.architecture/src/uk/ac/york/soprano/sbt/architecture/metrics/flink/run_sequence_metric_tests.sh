#!/bin/bash

END=1000
for ((i=1;i<=END;i++)); do
    echo "Running metric send test $i";
    ./run_metric_test.sh $i;
    # sleep 30
done
