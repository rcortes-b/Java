#!/bin/sh

echo "Welcome to the avajlauncher tester!"
echo "Press 1 to proceed"

read value

if [ "$value" = "1" ];
then
	cd sources
	javac -d bin @sourcesInvalid.txt
	cd ..
	#Test 1
	echo "Test 1 - Invalid input\n"
	echo  "Expected output: Wrong input in the scenario file: Number of simulations is wrong defined."
	echo -n "Your output: "
	java -cp bin me.rcortesb.avajlauncher.Invalid scenerario/scenario1.txt
	echo ""
	#Test 2
	echo  "Expected output: Wrong input in the scenario file: Number of simulations is wrong defined."
	echo -n "Your output: "
	java -cp bin me.rcortesb.avajlauncher.Invalid scenerario/scenario2.txt
	echo ""
	#Test 3
	echo  "Expected output: Error in the data of an Aircraft."
	echo -n "Your output: "
	java -cp bin me.rcortesb.avajlauncher.Invalid scenerario/scenario3.txt
	echo ""
	#Test 4
	echo  "Expected output: Error in the data of an Aircraft."
	echo -n "Your output: "
	java -cp bin me.rcortesb.avajlauncher.Invalid scenerario/scenario4.txt
	echo ""
	#Test 5
	echo  "Expected output: Height value is not between 0 and 100: Coordinates are wrong defined."
	echo -n "Your output: "
	java -cp bin me.rcortesb.avajlauncher.Invalid scenerario/scenario5.txt
	echo ""






	java -cp bin me.rcortesb.avajlauncher.Invalid scenario1.txt
else
	echo "Bye!"
fi