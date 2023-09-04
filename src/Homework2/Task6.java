package Homework2;

import java.util.Scanner;

///Write a program that should do the following:
//        To read two different integers entered by the user.
//        Display all the numbers in the interval.
//        Example:
//        Input:
//        17, 30
//        Output:
//        17 18 19 20 21 22 23 24 25 26 27 28 29 30
public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scan.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scan.nextInt();
        scan.close();

        if (firstNumber < secondNumber) {
            for (int i = firstNumber; i <= secondNumber; i++) {
                System.out.print(i + " ");
            }
        } else if (firstNumber > secondNumber) {
            for (int i = secondNumber; i <= firstNumber; i++) {
                System.out.print(i + " ");
            }
        } else {
            System.out.print("Please enter different numbers");
        }
    }
}

