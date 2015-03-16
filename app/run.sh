#!/bin/bash


gradle clean asD
adb uninstall com.x.xdagger2
adb install build/outputs/apk/app-debug.apk
