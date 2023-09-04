package Homework3;

import java.util.Arrays;
import java.util.Scanner;

    //    Write a program that accepts two integers from the user.
//    Then create an array with 10 elements in the following way:
//            - The first 2 elements of the array are the entered number.
//            - Each subsequent element of the array is equal to the sum of the
//    previous 2 elements in the array and if the index is:
//    o even multiply the sum by 3
//    o odd divide the sum by 2
//    Example:
//    Input:
//    Example 1: 1
//    Example 2: 3
//    Output:
//    Example 1: [1, 1, 6, 3, 27, 15, 126, 70, 588, 329]
//    Example 2: [3, 3, 18, 10, 84, 47, 393, 220, 1839, 1029]
public class Task3 {
    public static void main(String[] args) {

        int a, b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number A:");
        a = scan.nextInt();
        System.out.println("Enter the second number B:");
        b = scan.nextInt();
        scan.close();

        int[] arr = new int[10];
        arr[0] = a;
        arr[1] = b;

        for (int i = 2; i < arr.length; i++) {
            int tmp = arr[i - 1] + arr[i - 2];
            arr[i] = i % 2 == 0 ? tmp * 3 : tmp / 2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
