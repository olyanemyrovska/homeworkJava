package Homework2;

import java.util.Scanner;

//Write a program that should do the following:
//The program must accept (by the user) a number N from the interval [1-10000].
//The program to reverse the number entered by the user and prints it in the
//console.
//Example:
//Input:
//4289
//Output:
//9824
public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (between 1 and 10000): ");
        int number = scanner.nextInt();
        scanner.close();
//complicated task, used chat
        if (number < 1 || number > 10000) {
            System.out.println("Please enter a valid number within the range [1-10000].");
        } else {
            int reversedNumber = 0;
            while (number > 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;
            }
            System.out.println("Reversed number: " + reversedNumber);
        }
    }}
