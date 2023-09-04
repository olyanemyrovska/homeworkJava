package Homework2;

import java.util.Scanner;

//Write a program that accepts a positive number N (entered by the user).
//The program to calculate the value of N! (N factorial).
//Example:
//Input:
//4
//Calculations:
//4! = 1*2*3*4 = 24
//Output:
//24
public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number a positive number: ");
        int number = scanner.nextInt();
        scanner.close();
        long factorial = 1;
        if (number < 0) {
            System.out.println("Please enter a valid positive number");
        } else {
            for (int i = 1; i <= number; i++) {
                factorial *= i;
                System.out.println(i);
            }
        }
        System.out.println("factorial of number " + number + " is " + factorial);
    }
}