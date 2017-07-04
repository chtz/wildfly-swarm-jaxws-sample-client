#!/bin/bash

cd $(dirname "$0")

curl -H "Content-Type: text/xml" -d @sample_ws_response.xml https://httpecho-167219.appspot.com/register/post/200/soap/upper

cd ../src/main/resources/ch/furthermore/poc

curl -H "Content-Type: text/xml" -d @upper.wsdl https://httpecho-167219.appspot.com/register/get/200/soap/upper.wsdl
