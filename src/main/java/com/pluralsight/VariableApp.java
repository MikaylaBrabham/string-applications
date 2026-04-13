/**
 * @Author Mikayla Brabham
 * Exercises - Operators
 * Workbook 1c page 69 -70
 */
package com.pluralsight;

import javax.swing.*;

public class VariableApp {
    public static void main(String[] args) {


        // Step One instructions

        // Question 1: Declare variable for favorite color and display
        String favoriteColor = "Pink";
        System.out.println("My favorite color is " + favoriteColor + ".");

        // Question 2: Declare a variable for class start year
        int classYear = 2026;
        System.out.println("I started this class in " + classYear + ".");

        // Question 3: Declare a variable to store your middle intital
        char middleInitial = 'D';
        System.out.println("The initial of my most used middle name is " + middleInitial + ".");

        // Question 4: Declare a variable to store if you have pets (yes/no)
        boolean myPets = false;
        if (myPets) {
            System.out.println("No, I have no pets!");
        } else {
            System.out.println("Yes, I have a pet! Let me tell you all about them!");
        }

        // Question 5: Declare a variable with a nice saying
        String niceSaying = "Treat others how you would like to be treated";
        System.out.println("The saying I keep near and dear to my heart is; " + niceSaying + ".");

        /**
         *  I want to include newlines between each step
         *  I want to find external sources
         *  to make this more efficient w/o using sout
         *  I want to use headlines for the different steps
         *  should different steps be in different loops? so different method
         */


        // Step 2

        // Question 1: Declare and print The number of days in the week in one line
        int amountDays = 7; System.out.println("There are " + amountDays + " days in a week.");

        // Question 2: The price of coffee
        String coffeePrice = "$4.99"; System.out.println("The price of coffee is " + coffeePrice + ", which is kind of expensive.");

        // Question 3: Your favorite letter
        char favoriteLetter = 'M';System.out.println("My favorite letter is '" + favoriteLetter + "' due to it relating to my name.");


        // Question 4: Whether it's raining (true/false)
        boolean itsRaining = false;System.out.println(itsRaining + ", it's not raining!");

    }

}
