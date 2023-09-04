package Homework2;

import java.util.Scanner;

//Write a program that should do the following:
//To read a natural numbers entered by the user.
//When number 0 is entered, the program should stop reading more numbers
//from the console.
//To output the smallest and largest number of all entered numbers.

public class Task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int n;
        while (true) {
            System.out.print("Please enter an natural number, enter 0 to quit: ");
            n = scan.nextInt();
            if (n < 0) {
                System.out.print("Please enter a positive number: ");
            } else {
                if (n == 0) {
                    break;
                }
                if (n < smallest) {
                    smallest = n;
                }
                if (n > largest) {
                    largest = n;
                }
            }

            System.out.println("The smallest number is " + smallest);
            System.out.println("The largest number is " + largest);

            scan.close();
        }
    }
}
