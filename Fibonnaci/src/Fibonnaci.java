/*
 *  Assignment Lab 3
 *  Description: This program is made to print out a Fibonnaci series.
 *  Name: James Giatpaiboon
 *  ID: 917848716
 *  Class: CSC 211-03
 *  Semester: Fall 2019
 */

import java.util.Scanner;   //Imported scanner to scan users input


public class Fibonnaci {
    
    public static void main (String[] args) {

        int term1 = 0;  // initializes first term to 0
        int term2 = 1;  // initializes second term to 1
        int sum = 0;    // initial sum set to be 0
        int terms;  // terms entered in by user
        int i;  // number that user inputs

        Scanner input = new Scanner(System.in); // created for user to input

        System.out.println("Enter the number of terms for Fibonacci series:");  // tells input to enter # of terms
        terms = input.nextInt();    // stores input of number of terms for series
        for (i = 0; i < 1; i++) {   // int i starts at 0, if i is greater than 0, the loop will continue to run
            if (terms > 20 || terms < 0) {  //if terms entered > 20 or < 0, program will stop running
                System.out.println("Enter a valid number between 0-20. "); // statement to make sure sure inputs number 0-20
                break; // stops the program because user did not enter a number between 0-20
            }
            System.out.println("Your Fibonnaci series is: ");    // prints out users results
            for(i = 1;i < terms; i++){  // starts loop for Fibonnaci sequence
                System.out.print(" "+term1);
                sum = term1+term2;  // adds terms together
                term1 = term2;  // assigns the first term to the second term
                term2 = sum;    // assigns the sum to the last two numbers to the second number
            }
            System.out.println(" " + term1 + " "); // prints out the Fibonnaci series
        }
    }
}
