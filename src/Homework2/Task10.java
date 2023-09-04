package Homework2;

//Write a program that should do the following:
//        To read a positive number entered by the user.
//        The program to determine whether the number is prime.
//        Note: What is a prime number? Number that is divisible only by 1 and itself.

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();
        if (number < 1) {
            System.out.println("Enter a positive number.");
        }
        scanner.close();
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        }

        int sqrtNum = (int) Math.sqrt(number);
        for (int i = 2; i <= sqrtNum; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}

