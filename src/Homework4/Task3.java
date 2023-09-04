package Homework4;

import java.util.Scanner;

//Write a program where the user must enter two strings.
//The program should merge the two strings and print the newly obtained one.
//Example:
//Input:
//Hello to; Java world
//Output:
//Hello to Java world
public class Task3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter first string: ");
        String str1 = scan.nextLine();
        System.out.print("Please enter second string: ");
        String str2 = scan.nextLine();

        System.out.println(str1.concat(" ").concat(str2));

        scan.close();

    }
}
