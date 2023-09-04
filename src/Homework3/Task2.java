package Homework3;

import java.util.Arrays;

//Write a program that reads an array and creates a new array from it. Half
//of the elements of the new array must exactly be like the second half of the
//original, and the other half are the same elements, but in reverse order. Bring
//the new array to the screen.
//Example:
//Input:
//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
//Output:
//[6, 7, 8, 9, 10, 10, 9, 8, 7, 6]
public class Task2 {
    public static void main(String[] args) {
        int[] firstArr = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] secondArr = new int[10];

        for (int i = 0; i < secondArr.length / 2; i++) {
            secondArr[i] = firstArr[(firstArr.length / 2) + i];
        }
        int b = firstArr.length - 1;
        for (int i = secondArr.length / 2; i < secondArr.length; i++) {
            secondArr[i] = firstArr[b];
            b--;
        }
        System.out.println(Arrays.toString(secondArr));
    }
}
