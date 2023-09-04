package Homework4;

import java.util.Scanner;

//Write a program that accepts two integers from the user.
//The program calls the getTotal() method, which takes two integers and returns
//their sum.
//Store the result in a variable and print to the console
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        scanner.close();

        int total = getTotal(num1, num2);

        System.out.printf("The sum of %d and %d is %d", num1, num2, total);
    }

    public static int getTotal(int a, int b) {
        return a + b;
    }
}

