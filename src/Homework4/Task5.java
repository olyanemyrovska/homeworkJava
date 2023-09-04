package Homework4;

import java.util.Scanner;

//Write a program where the user must enter a single word (string).
//The program to check if the entered string is a palindrome.
//Note: Palindrome – a word that is read left-to-right and right-to-left in the same
//way.
//Example:
//Input:
//kayak
//wow
//test
//Output:
//kayak is palindrome.
//wow is palindrome.
//test is not a palindrome.
public class Task5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a word ");
        String str = scan.nextLine();

        StringBuilder stringBuilder = new StringBuilder(str).reverse();
        String reversedStr = stringBuilder.toString();

        if (str.equals(reversedStr)) {
            System.out.printf("%s is a palindrome", str);
        } else {
            System.out.printf("%s is not a palindrome", str);
        }
        scan.close();
    }
}
