package Homework4;

import java.util.Scanner;

//Write a program where the user must enter two strings.
//- The program to check which of the two strings is longer.
//- The program to print the length of the two strings.
//Example:
//Input:
//short, longString
//Output:
//The longest string is: longString
//short – 5, longString - 10
public class Task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter first string: ");
        String str1 = scan.nextLine();
        System.out.print("Please enter second string: ");
        String str2 = scan.nextLine();

        if (str1.length() > str2.length()) {
            System.out.println("The longest string is " + str1);
        } else if (str1.length() < str2.length()) {
            System.out.println("The longest string is " + str2);
        } else {
            System.out.println("The strings are equal");
        }
        scan.close();
    }
}

