package Homework1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = getValidTwoDigitNumber("first", scan);
        int b = getValidTwoDigitNumber("second", scan);

        int product = a * b;
        boolean isEven = (product % 2) == 0;
        int lastDigit = product % 10;
        boolean isLastDigitDivisibleBy3 = lastDigit % 3 == 0;
        System.out.println(isEven ? product + " is even." : product + " is odd.");
        System.out.println(isLastDigitDivisibleBy3 ? lastDigit + " is divisible by 3." :
                lastDigit + " is not divisible by 3.");

        scan.close();
    }

    private static int getValidTwoDigitNumber(String ordinal, Scanner scan) {
        int number;
        do {
            System.out.print("Please enter the " + ordinal + " natural 2-digit number: ");
            number = scan.nextInt();
            if (number < 10 || number > 99) {
                System.out.println("Please enter a valid 2-digit number.");
            }
        } while (number < 10 || number > 99);
        return number;
    }
}
