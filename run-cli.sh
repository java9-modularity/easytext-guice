#!/usr/bin/env bash

java --add-opens java.base/java.lang=guice --module-path out/production:lib -m easytext.cli/javamodularity.easytext.cli.Main testinput.txt