package Homework1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int int1 = scan.nextInt();
        System.out.println("Enter the second number");
        int int2 = scan.nextInt();

        while (int2 == 0) {
            System.out.println("Enter another number, number should not be zero");
            int2 = scan.nextInt();
        }

        int sum = int1 + int2;
        int diff = int1 - int2;
        int product = int1 * int2;
        int remOfDiv = int1 % int2;
        int div = int1 / int2;

        System.out.printf("The sum of integers %d and %d is %d%n", int1, int2, sum);
        System.out.printf("The difference of integers %d and %d is %d%n", int1, int2, diff);
        System.out.printf("The product of integers %d and %d is %d%n", int1, int2, product);
        System.out.printf("The remainder of division of integers %d and %d is %d%n", int1, int2, remOfDiv);
        System.out.printf("The result of integer division of %d and %d is %d%n", int1, int2, div);

        //Version with doubles
        System.out.println("Enter the first double");
        double double1 = scan.nextDouble();
        System.out.println("Enter the second double");
        double double2 = scan.nextDouble();

        while (double2 == 0.0d) {
            System.out.println("Enter another double, should not be zero");
            double2 = scan.nextDouble();
        }

        scan.close();

        double sumDouble = double1 + double2;
        double diffDoubles = double1 - double2;
        double productDoubles = double1 * double2;
        double remainderOfDivisionDouble = double1 % double2;
        double divisionDouble = double1 / double2;

        System.out.printf("The sum of doubles %f and %f is %f%n", double1, double2, sumDouble);
        System.out.printf("The difference of doubles %f and %f is %f%n", double1, double2, diffDoubles);
        System.out.printf("The product of doubles %f and %f is %f%n", double1, double2, productDoubles);
        System.out.printf("The remainder of division of doubles %f and %f is %f%n", double1, double2,
                remainderOfDivisionDouble);
        System.out.printf("The result of doubles division of %f and %f is %f%n", double1, double2, divisionDouble);
    }
}
