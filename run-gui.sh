#!/usr/bin/env bash

java --add-opens java.base/java.lang=guice --module-path out/production:lib --module-path out/production:lib -m easytext.gui/javamodularity.easytext.gui.Main testinput.txt