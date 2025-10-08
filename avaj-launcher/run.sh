#!/bin/sh

echo "Compilation has just started"

find * -name "*.java" > sources.txt

javac -d bin @sources.txt

echo "Compilation ended successfully!"


echo "type \"run\" to run the program"

read value

if [ "$value" = "run" ];
then
	echo "Great! Program will run in 2 seconds"
	sleep 2
	echo "\n\n\n"
	java -cp bin me.rcortesb.avajlauncher.Main
else
	echo "Bye!"
fi