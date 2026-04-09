package com.pluralsight;

public class VariableApp {
    public static void main(String[] args) {

        //Question 1: Declare a variable to store your favorite color.
        String favColor = "black";
        System.out.println("My favorite color is " + favColor);


        //Question 2: Declare a variable to store the year you started this class.
        int yearClassStarted = 2026;
        System.out.println("I started this class in " + yearClassStarted);


        //Question 3: Declare a variable to store your middle name initial.
        char myMiddlenameInitial = 'N';
        System.out.println("My middle name initial is " + myMiddlenameInitial);


        //Question 4: Declare a variable to store whether you have pets (yes/no)
        String havePets = "Yes";
        System.out.println("Do I have pets? " + havePets);


        //Question 5: Declare a variable with a nice message or saying
        String niceMessage = "Eric is the coolest instructor so far!";
        System.out.println(niceMessage);


        //Step 2
        // Declaring and initializing variables for:

        //Number of days in a week
        // declaring it as a constant variable since the number of days in a week will not change
        final int daysInAWeek = 7;
        System.out.println("There are " + daysInAWeek + " days in a week");


        //The price of coffee($4.99)
        final double coffeePrice = 4.99;
        System.out.println("The price for a cup of coffee is $" + coffeePrice);


        //My favorite letter
        char favoriteLetter = 'T';
        System.out.println("My favorite letter is " + favoriteLetter);


        //Whether it's raining(true/false)
        boolean isRaining = true;
        System.out.println("It's raining today: " + isRaining);



    }
}
