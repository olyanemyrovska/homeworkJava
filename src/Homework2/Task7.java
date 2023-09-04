package Homework2;

import java.util.Scanner;

//Write a program that should do the following:
//        To read a positive integer entered by the user.
//        Display the sum of all numbers between 1 and the entered number.
//        Example:
//        Input:
//        12
//        Output:
//        The sum of all numbers to 12 is = 78.

public class Task7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a positive number: ");
        int n = scan.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println("The sum of all numbers to " + n + " is = " + sum);
        }
        scan.close();
    }
}

