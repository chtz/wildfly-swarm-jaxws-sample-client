#!/bin/bash

#pre-cond: service running

wsimport -d $(dirname "$0")/../target/classes -s $(dirname "$0")/../src/main/java -p "ch.furthermore.poc.client" http://localhost:8080/StringUtils?wsdl
