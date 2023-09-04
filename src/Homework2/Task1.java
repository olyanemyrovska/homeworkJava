package Homework2;

import java.util.Scanner;

public class Task1 {
    //    Write a program that should do the following:
//            - To read a char from the keyboard.
//            - If Y / y char is entered, the program must print "Yes" in the console
//- When N / n char is entered, the program must print "No" in the console
//- Use Switch state
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a character (Y/y or N/n): ");
        char inputChar = scan.next().charAt(0);

        switch (inputChar) {
            case 'Y':
            case 'y':
                System.out.println("Yes");
                break;
            case 'N':
            case 'n':
                System.out.println("No");
                break;
            default:
                System.out.println("Invalid input entered");
        }

        scan.close();
    }
}

