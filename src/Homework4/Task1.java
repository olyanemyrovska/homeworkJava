package Homework4;

import java.util.Scanner;

//Write a method where the user enters a string that can contain lowercase and
//        uppercase letters.
//        The size of the string should not be greater than 50.
//        Print to the console the entered string, but in uppercase letters.
//        Print to the console the entered string, but in lowercase letters.
//        Example:
//        Input:
//        Hello Java
//        Output:
//        HELLO JAVA, hello java
public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String str = scan.nextLine();
        if (str.length() > 50) {
            System.out.println("String length should noy be greater than 50");
        } else {
            System.out.println(str.toUpperCase());
            System.out.println(str.toLowerCase());
        }
        scan.close();
    }
}
