package Homework2;

import java.util.Scanner;

//Write a program that should do the following:
//To read a positive integer (n) entered by the user.
//Display the first n number of numbers that are divisible by 3.
//Example:
//Input:
//9
//Output:
//3, 6, 9, 12, 15, 18, 21, 24, 27
public class Task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a positive integer: ");
        int n = scan.nextInt();
        if (n <= 0) {
            System.out.println("Integer should be positive!");
        } else {
            for (int i = 3; i <= n * 3; i+=3) {
                System.out.print( i + ",");
            }
        }
        scan.close();
    }
}
