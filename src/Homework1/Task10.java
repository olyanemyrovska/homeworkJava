package Homework1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputNumber;
        do {
            System.out.println("Please enter an integer from the keyboard in the range [0-24]");
            inputNumber = scan.nextInt();
        } while (inputNumber < 0 || inputNumber > 24);

        if (inputNumber >= 5 && inputNumber <= 10) {
            System.out.println("Good morning!");
        } else if (inputNumber >= 11 && inputNumber <= 18) {
            System.out.println("Good day!");
        } else if (inputNumber >= 19 && inputNumber <= 23) {
            System.out.println("Good evening!");
        } else {
            System.out.println("Why aren't you sleeping?");
        }
        scan.close();
    }
}
