package Homework4;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String number = scanner.nextLine();

        scanner.close();

        int factorial = getFactorial(Integer.parseInt(number));

        System.out.printf("The factorial of %s is %d", number, factorial);
    }

    public static int getFactorial(int number) {
        if (number == 1) {
            return number;
        } else {
            return number * getFactorial(number - 1);
        }
    }
}
//5 * 4 * 3 *2 *1
//
//gf(5) => 5 * gf(4) => 5 * 4 * gf(3) => 5 * 4 * 3 * gf(2) = 5 * 4 * 3 * 2 * 1