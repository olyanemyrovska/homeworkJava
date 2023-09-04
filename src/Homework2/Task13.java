package Homework2;

import java.util.Scanner;
//Write a program that accepts (by the user) a natural number N from the interval
//        [10-300].
//        The program should display in reverse order all the numbers that are multiples
//        of 7 and are smaller than N.

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number between 10 and 300:");
        int number = scanner.nextInt();
        scanner.close();

        if (number< 10 || number > 300) {
            System.out.println("Please enter a valid number between 10 and 300");
        } else {
            for (int i = number; i >= 10; i--) {
                if (i % 7 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
