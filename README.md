# Beer Temperature Monitor

This temperature monitor is implemented in java and for testing i used JUnit testing Framework.
data1.txt contains continuously increasing temperature with every 2 seconds.

# How to run this project?
* load the project folder in a java IDE and add all library and Framework to that IDE and just press run.
* In case you are unable to run the project i have added some screenshot of output and testing result.

# firstClass.java
* FirstClass.java is our main class which contains the main function:
* User has to first put the total number of different beer the truck is going to carry, and then put minimum and maximum values of temperature respectively.


# beerType.java
* beerType.java is a class that assigns minimum and maximum values to our beers using user input.


# inputData.java
* This class can be modified according to our source of input for example(user, pre-defined values in file, sensors).
* This class can collect data in two different ways: user input and input from a file.


# printingOutput.java
this class will compare our collected data to our safe range of temperature and if the temperature shifts from that range it will generate a warning.

