package Homework2;

import java.util.Scanner;

//Write a program that should do the following:
//The program must accept (by the user) a number N from the interval [1-30].
//Program to output the first N number of Fibonacci numbers.
//Note: Fibonacci numbers starts with 0 and 1, and each subsequent member of
//the sequence is obtained as the sum of the previous two.
//Example:
//Input:
//10
//Output:
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34

public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number a positive number from 1 to 30: ");
        int number = scanner.nextInt();
        scanner.close();
        if (number < 1 || number > 30) {
            System.out.println("Please enter a valid positive number from 1 to 30");
        } else {
            int fib1 = 0;
            int fib2 = 1;
            int fibNext;
            for (int i = 1; i < number-1; i++) {
                if (i == 1) {
                    System.out.println(fib1);
                }
                if (i == 2) {
                    System.out.println(fib2);
                }
                fibNext = fib1 + fib2;
                System.out.println(fibNext);
                fib1 = fib2;
                fib2 = fibNext;
            }
        }
    }
}

