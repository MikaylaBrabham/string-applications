package com.pluralsight;
// import scanner to get the user input
import java.text.DecimalFormat;
import java.util.*;

public class Receipt {

    public static void main(String[] args) {
        // reads user input
        Scanner scanner = new Scanner(System.in);

      //  Question 1.
        // Create string variable for item name
        System.out.println("What item did you buy? ");
        String itemName =  scanner.nextLine();

        // Create double variable for item price
        System.out.print("How much is the item your purchasing? ");
        double itemPrice = scanner.nextDouble();
        scanner.nextLine();

     //  Question 2.
        // Create int variable for quantity
        System.out.print("How many items do you have? ");
        int quantity = scanner.nextInt();
        scanner.nextLine();

     // Question 3.
        // Do operator expression to get price,
        double totalCost = quantity * itemPrice;
        DecimalFormat df = new DecimalFormat("0.00");


        // Create output to display results
        System.out.printf("You bought " + quantity + " "+ itemName + " for $" + (df.format(totalCost)));

        //citations
            // W3 schools


    }
}
