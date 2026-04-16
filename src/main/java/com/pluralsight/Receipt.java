package com.pluralsight;
// import scanner to get the user input
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
        float itemPrice = scanner.nextFloat();
        scanner.nextLine();

     //  Question 2.
        // Create a int variable for quantity
        System.out.print("How many items do you have? ");
        int quantity = scanner.nextInt();
        scanner.nextLine();


     // Question 3.
        // Do operator expression to get price,
       float totalMath = quantity * itemPrice;

        // Create price variable to print

        //String
        // Create expression statement with variable names to display
      //  System.out.printf("The total of" + itemName + "is + %f",);
      //  String totalPrice = "" + itemName + "is $" + totalPrice;

    }
}
