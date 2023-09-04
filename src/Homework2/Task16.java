package Homework2;

import java.util.Scanner;

//Write a program that should do the following:
//The program must accept (by the user) a number N from the interval [10-30000].
//The program to check if the number entered is a palindrome.
//Note: What is a palindrome? A palindrome is a number that is read the same
//way front to back and back to front. Example: The number 28682 is a
//palindrome.
public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 10 and 30000: ");
        int number = scanner.nextInt();
        scanner.close();
        //Complicated task, better to convert to string and reverse
        if (number < 10 || number > 30000) {
            System.out.println("Please enter a valid number between 10 and 30000.");
        } else {
            int originalNumber = number;
            int reversedNumber = 0;

            while (number > 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;
            }

            if (originalNumber == reversedNumber) {
                System.out.println(originalNumber + " is a palindrome.");
            } else {
                System.out.println(originalNumber + " is not a palindrome.");
            }
        }
    }
}
