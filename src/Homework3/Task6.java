package Homework3;

import java.util.Arrays;

//Write a program that reads 2 arrays, then compares them and displays a
//message whether they are the same or not.
//Example:
//Input:
//Example 1: [1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 5, 6]
//Example 2: [1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 4, 6]
//Output:
//Example 1: Identical
//Example 2: Not identical
public class Task6 {
    public static void main(String[] args) {

        int[] arr1 = new int[]{ 1, 2, 3, 4, 5, 6 };
        int[] arr2 = new int[]{ 1, 2, 3, 4, 5, 6 };
        int[] arr3 = new int[]{ 1, 2, 3, 4, 5};


        if (Arrays.equals(arr1, arr3)) {
            System.out.println("Provided arrays are identical");
        } else {
            System.out.println("Provided arrays are not identical");
        }
    }
}
