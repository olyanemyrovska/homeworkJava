package Homework4;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String string = scanner.nextLine();
        scanner.close();
        String updatedString = removeLetters(string);
        System.out.println(updatedString);
    }

    public static String removeLetters(String string) {
        return string.replaceAll("[pqr]", "");
    }
}
