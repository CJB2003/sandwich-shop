package com.pluralsight;
import java.util.Scanner;


public class SandwichShop {
    public static void main(String[] args) {

        //New scanner
        Scanner myScanner = new Scanner(System.in);

        //Initialize prices as double data types
        double regularPrice = 5.45;
        double largePrice = 8.95;

        //Print statement asking user what size sandwich they want with prices
        System.out.println("What size sandwich would you like?");
        System.out.println("Regular: $" + regularPrice);
        System.out.println("Large: $" + largePrice);

        //Declare string variable for a string input from user
        String sandwichSize = myScanner.nextLine();

        System.out.println("Would you like the sandwich loaded? (Y/N)");

        String yesOrNo = myScanner.nextLine();

        //Initializing a base price, realized my code was super redundant,
        // so I wanted to reduce it with this if statement.
        double basePrice = 0;
        if (yesOrNo.equals("Y")) {
            if (sandwichSize.equals("Large")) {
                basePrice = largePrice + 1;
            }
            else {
                basePrice = regularPrice + 1.75;
            }
        }
        else {
            if (sandwichSize.equals("Large")) {
                basePrice = largePrice;
            }
            else {
                basePrice = regularPrice;
            }
        }

        //Print statement asking how old person is
        System.out.println("How old are you?");

        int userAge = myScanner.nextInt();

        //Initialize a variable for discount price used later
        double discountRate = 0;

        //If statement for 17 or under, discount of 10%
        if (userAge <= 17) {
            System.out.println("You get a 10% discount!");
            discountRate = 0.1;
        }

        //If your 65 or older, you get a 20% discount
        else if (userAge >= 65) {
            System.out.println("You get a 20% discount!");
            discountRate = 0.2;
        }

        //Statement for prices for people ages in between 17 and 65
        else {
            System.out.println("You pay normal prices.");
        }

        //To reduce redundancy, moved print statement to the end as a final statement that prints
        //for all conditionals
        double finalPrice = basePrice - (basePrice * discountRate);
        System.out.println("You chose a " + sandwichSize + " sandwich. That'll be $"
                + String.format("%.2f", finalPrice) + ".");
    }
}
