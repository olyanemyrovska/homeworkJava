package Homework1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputNumber;
        do {
            System.out.println("Please enter an integer from the keyboard in the range [0-100]");
            inputNumber = scan.nextInt();
        } while (inputNumber < 0 || inputNumber > 100);

        if (inputNumber == 0) {
            System.out.println("It will not rain.");
        } else if (inputNumber <= 5) {
            System.out.println("Minimal chance of precipitation.");
        } else if (inputNumber <= 20) {
            System.out.println("A small chance of precipitation.");
        } else if (inputNumber <= 50) {
            System.out.println("There is a chance of precipitation.");
        } else if (inputNumber <= 80) {
            System.out.println("High chance of precipitation.");
        } else {
            System.out.println("It will rain.");
        }
        scan.close();
    }
}
