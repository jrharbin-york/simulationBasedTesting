#!/bin/bash

if [[ $# -eq 0 ]] ; then
        echo "Please supply the current IP for this node"
        exit 1
fi

watch pyro5-nsc list -n ${IP} -p 9523
