package Homework1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number A:");
        a = scan.nextDouble();
        System.out.println("Enter the second number B:");
        b = scan.nextDouble();
        System.out.println("Enter the third number C:");
        c = scan.nextDouble();
        scan.close();

        if (c > a && c < b || c < a && c > b) {
            System.out.println(String.format("Number %s is between %s and %s.", c, a, b));
        } else {
            System.out.println(String.format("Number %s is not between %s and %s.", c, a, b));
        }
    }
}
