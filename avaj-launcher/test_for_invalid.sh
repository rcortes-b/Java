#!/bin/sh

echo "Welcome to the avajlauncher tester!"
echo "Press 1 to proceed"

read value

if [ "$value" = "1" ];
then

	javac -d bin @sources/sourcesInvalid.txt
	echo "Test 1 - Invalid input\n"
	#Test 1
	echo  "Expected output: Something went wrong with the file!"
	echo -n "Your output: "
	java -cp bin me.rcortesb.avajlauncher.Invalid randomfile.txt
	echo ""
	#Test 2
	chmod 000 scenario/invalid/scenario0.txt
	echo  "Expected output: Something went wrong with the file!"
	echo -n "Your output: "
	java -cp bin me.rcortesb.avajlauncher.Invalid scenario/invalid/scenario0.txt
	echo ""
	chmod 644 scenario/invalid/scenario0.txt
	#Test 3
	echo  "Expected output: Wrong input in the scenario file: Number of simulations is wrong defined."
	echo -n "Your output: "
	java -cp bin me.rcortesb.avajlauncher.Invalid scenario/invalid/scenario1.txt
	echo ""
	#Test 4
	echo  "Expected output: Wrong input in the scenario file: Number of simulations is wrong defined."
	echo -n "Your output: "
	java -cp bin me.rcortesb.avajlauncher.Invalid scenario/invalid/scenario2.txt
	echo ""
	#Test 5
	echo  "Expected output: Error in the data of an Aircraft."
	echo -n "Your output: "
	java -cp bin me.rcortesb.avajlauncher.Invalid scenario/invalid/scenario3.txt
	echo ""
	#Test 6
	echo  "Expected output: Error in the data of an Aircraft."
	echo -n "Your output: "
	java -cp bin me.rcortesb.avajlauncher.Invalid scenario/invalid/scenario4.txt
	echo ""
	#Test 7
	echo  "Expected output: Height value is not between 0 and 100: Coordinates are wrong defined."
	echo -n "Your output: "
	java -cp bin me.rcortesb.avajlauncher.Invalid scenario/invalid/scenario5.txt
	echo ""
	#Test 8
	echo  "Expected output: Height value is not between 0 and 100: Coordinates are wrong defined."
	echo -n "Your output: "
	java -cp bin me.rcortesb.avajlauncher.Invalid scenario/invalid/scenario6.txt
	echo ""






else
	echo "Bye!"
fi