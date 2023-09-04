package Homework1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputNumber;
        boolean isNumberValid;
        do {
            System.out.println("Enter the three digit number without 0");
            inputNumber = scan.nextInt();
            isNumberValid = checkIfNumberValid(inputNumber);
        } while (!isNumberValid);

        int thirdDigit = inputNumber % 10;
        int secondDigit = (inputNumber / 10) % 10;
        int firstDigit = inputNumber / 100;

        if ((inputNumber % firstDigit == 0) && (inputNumber % secondDigit == 0) && (inputNumber % thirdDigit == 0)) {
            System.out.println("The number " + inputNumber + " is dividable by all it's digits.");
        } else {
            System.out.println("The number " + inputNumber + " is not dividable by all it's digits.");
        }
    }

    public static boolean checkIfNumberValid(Integer number) {
        boolean isValid = true;
        if (number < 100 || number > 999) {
            isValid = false;
        } else if (String.valueOf(number).contains("0")) {
            isValid = false;
        }
        return isValid;
    }
}
