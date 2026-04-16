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
        String headerOne = "Step 1";
        System.out.println("\n" + headerOne);

        // Question 1: Declare variable for favorite color and display
        final String favoriteColor = "Pink";
        System.out.println("Question 1:\n " +
                "\tMy favorite color is " + favoriteColor + ".\n");

        // Question 2: Declare a variable for class start year
        final int classYear = 2026;
        System.out.println("Question 2:\n " +
                "\tI started this class in " + classYear + ".\n");

        // Question 3: Declare a variable to store your middle initial
        final char middleInitial = 'D';
        System.out.println("Question 3:\n " +
                "\tThe initial of my most used middle name is " + middleInitial + ".\n");

        // Question 4: Declare a variable to store if you have pets (yes/no)
        boolean myPets = false;
        if (myPets) {
            System.out.println("Question 4:\n " +
                    "\tYes, I have a pet! Let me tell you all about them!\n");
        } else {
            System.out.println("Question 4:\n " +
                    "\tNo, I have no pets!\n");
        }

        // Question 5: Declare a variable with a nice saying
        final String niceSaying = "Treat others how you would like to be treated";
        System.out.println("Question 5:\n " +
                "The saying I keep near and dear to my heart is;\n " +
                "\t'"+ niceSaying + "'.\n");

        /**
         *  I want to include newlines between each step \n & \t
         *  I want to find external sources @https://www.w3schools.com
         *  to make this more efficient w/o using sout
         *  I want to use headlines for the different steps
         *  should different steps be in different loops? so different method
         */


        // Step 2
        String headerTwo = "Step 2";
        System.out.println("\n" + headerTwo);

        // Question 1: Declare and print The number of days in the week in one line
        int amountDays = 7; System.out.println("Question 1:\n" +
                "There are " + amountDays + " days in a week.\n");

        // Question 2: The price of coffee
        String coffeePrice = "$4.99"; System.out.println("Question 2:\n" +
                "The price of coffee is " + coffeePrice +
                ", which is kind of expensive.\n");

        // Question 3: Your favorite letter
        char favoriteLetter = 'M';System.out.println("Question 3:\n " +
                "My favorite letter is '" + favoriteLetter +
                "' due to it relating to my name.\n");

        // Question 4: Whether it's raining (true/false)
        boolean itsRaining = false;System.out.println("Question 4:\n"
                + itsRaining + ", it's not raining!\n");

    }

}
