package Homework1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scan.nextInt();
        System.out.println("Enter the second number");
        int b = scan.nextInt();
        if (a < b) {
            System.out.println(String.format("Ascending order: %d, %d", a, b));
            System.out.println(String.format("Descending order: %d, %d", b, a));
        } else if (a > b) {
            System.out.println(String.format("Ascending order: %d, %d", b, a));
            System.out.println(String.format("Descending order: %d, %d", a, b));
        } else {
            System.out.println("The provided numbers are equal, try again");
        }

        scan.close();
    }
}
