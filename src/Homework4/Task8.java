package Homework4;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the integer: ");
        int number = scanner.nextInt();

        scanner.close();

        boolean isOdd = getIsOdd(number);
        System.out.println(isOdd ? "The integer is odd" : "The integer is not odd");
    }

    public static boolean getIsOdd(int number) {
        return number % 2 != 0;
    }
}
