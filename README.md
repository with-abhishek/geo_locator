
## Overview
This project provides a Java program to determine the country code based on latitude and longitude coordinates using a CSV file containing the country codes with their coordinates.

## Setup
1.  Create a Maven Project in Eclipse IDE :
    -> Open Eclipse IDE.
    -> Select 'File' > 'New' > 'Other'.
    -> Choose 'Maven Project' and click 'Next'.
    -> Select the appropriate Archetype (e.g., 'maven -archetype -quickstart') and click 'Next'.
    -> Fill in the Group Id and Artifact Id and click 'Finish'.

2.  Create Java Classes :
    -> Right ->click on 'src/main/java' in your Maven project.
    -> Select 'New' > 'Package' and create a package.
    -> Inside the package, create the following Java classes:
      -> 'CountryFinder.java'
      -> 'CountryLocatorTest.java'
      -> 'PerformanceTest.java'

3.  Download the CSV File :
    -> Download a CSV file containing country boundaries (latitude and longitude coordinates).
    -> Place the CSV file in the project directory (e.g., 'src/main/resources').

## Running the Program
1.  Load the CSV File :
    -> Use 'CountryFinder.java' to load and parse the CSV file.

2.  Get Country Code :
   	 -> Use 'CountryFinder'to get the country code based on input latitude and longitude.

3.  Testing :
  	  -> Use 'CountryLocatorTest.java' to test the country code functionality.
   	 -> Use 'PerformanceTest.java' to perform performance testing.

## Dependencies
Add the following dependencies to your 'pom.xml' file
	 ->  JUnit : For unit testing.
	 ->  JUnit Jupiter : Used for writing unit tests with JUnit 5.

## Structure
	 ->  'CountryFinder' : Main class to get the country code.
	 ->  'CSV file' : Class to load and parse the CSV file.
	 ->  'CountryLocatorTest' : Unit tests for 'CountryFinder'.
	 ->  'PerformanceTest' : Performance testing class.

## Prerequisites
	 ->  JDK : Ensure JDK is installed.
	 ->  Maven : Ensure Maven is installed.
	 ->  IDE : Use any IDE like Eclipse or VSCode.

## How to Run
1.  Check for Java Installation :
   	 -> Ensure Java is installed by running 'java  --version' in the terminal.
  	  -> If not installed, download and install JDK from the [official site]	(https://www.oracle.com/java/technologies/javase --jdk11 --downloads.html).

2.  Open the Project in IDE :
   	 -> Open the Maven project in your IDE.

3.  Check for Maven Installation :
  	  -> Ensure Maven is installed by running 'mvn --version' in the terminal.
  	  -> If not installed, download and install Maven from the [official site](https://maven.apache.org/install.html).

4.  Run 'CountryFinder.java' :
  	  -> Enter latitude and longitude to get the country code.

5.  Run Unit Tests :
   	 -> run 'CountryLocatorTest.java' for unit testing.
5.  Run Performance Tests :
   	 -> run 'PerformanceTest.java' for performance testing.


   
