#!/usr/bin/env bash

#curl -v -X POST -d '{"input":"2017-10-03"}' -H "Content-Type: application/json" http://localhost:9080/resources/demo
curl -v -X POST -d '{"input":"2017-10-03"}' -H "Content-Type: application/json" http://localhost:9080/openliberty-lombok-jackson-issue-1.0-SNAPSHOT/resources/demo
