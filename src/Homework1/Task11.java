package Homework1;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputNumber;
        boolean isNumberValid;
        do {
            System.out.println("Enter the natural three digit number");
            inputNumber = scan.nextInt();
            isNumberValid = checkIfNumberValid(inputNumber);
        } while (!isNumberValid);

        int firstDigit = inputNumber / 100;
        int secondDigit = (inputNumber / 10) % 10;
        int thirdDigit = inputNumber % 10;

        if (firstDigit == secondDigit && secondDigit == thirdDigit) {
            System.out.println("The numbers are equal.");
        } else if (firstDigit < secondDigit && secondDigit < thirdDigit) {
            System.out.println("Ascending.");
        } else if (firstDigit > secondDigit && secondDigit > thirdDigit) {
            System.out.println("Descending.");
        } else {
            System.out.println("Try with another number.");
        }
    }

    public static boolean checkIfNumberValid(Integer number) {
        boolean isValid = true;
        if (number < 100 || number > 999) {
            isValid = false;
        }
        return isValid;
    }
}
