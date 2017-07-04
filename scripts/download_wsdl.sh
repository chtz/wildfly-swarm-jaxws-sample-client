#!/bin/bash

#pre-cond: service running

curl -s http://localhost:8080/StringUtils?wsdl > $(dirname "$0")/../src/main/resources/ch/furthermore/poc/upper.wsdl
