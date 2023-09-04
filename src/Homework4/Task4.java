package Homework4;

import java.util.Scanner;

///Write a program where the user must enter a string of several words separated
//by a space.
//To print the entered string, but the first letters of the individual words should be
//uppercase, the rest should be lowercase.
//Example:
//Input:
//mY tEsT stRinG
//Output:
//My Test String
public class Task4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter several words separated by a space ");
        String str1 = scan.nextLine();

        StringBuilder resultString = new StringBuilder();
        String[] arr = str1.split(" ");
        for (String str : arr) {
            String stringToAd = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
            resultString.append(stringToAd).append(" ");
        }

        System.out.println(resultString);
        scan.close();
    }
}
