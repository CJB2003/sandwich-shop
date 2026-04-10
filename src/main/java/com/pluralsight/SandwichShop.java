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

        //Print statement asking how old person is
        System.out.println("How old are you?");

        int userAge = myScanner.nextInt();

        //Initialize a variable for discount price used later
        double discountPrice = 0;

        //If statement for 17 or under, discount of 10%
        if (userAge <= 17) {
            System.out.println("You get a 10% discount!");

            // See if sandwich size is large or regular from user input
            if (sandwichSize.equals("Large")) {
                discountPrice = largePrice - (largePrice * 0.1);
                System.out.println("You chose a " + sandwichSize + " sandwich. That'll be $"
                        + String.format("%.2f", discountPrice));
            } else {
                discountPrice = regularPrice - (regularPrice * 0.1);
                System.out.println("You chose a " + sandwichSize + " sandwich. That'll be $"
                        + String.format("%.2f", discountPrice));
            }
        }

        //If your 65 or older, you get a 20% discount
        else if (userAge >= 65) {
            System.out.println("You get a 20% discount!");

            // See if sandwich size is large or regular from user input
            if (sandwichSize.equals("Large")) {
                discountPrice = largePrice - (largePrice * 0.2);
                System.out.println("You chose a " + sandwichSize + " sandwich. That'll be $"
                        + String.format("%.2f", discountPrice));
            } else {
                discountPrice = regularPrice - (regularPrice * 0.2);
                System.out.println("You chose a " + sandwichSize + " sandwich. That'll be $"
                        + String.format("%.2f", discountPrice));
                }
        }
    }
}
