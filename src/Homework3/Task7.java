package Homework3;

import java.util.Arrays;

//Write a program that finds and outputs the longest sequence of identical
//sequential elements in an array.
//Example:
//Input:
//[1, 1, 2, 2, 3, 4, 4, 4, 5, 5, 6, 7, 7, 7, 7, 7, 7, 8, 8, 9, 10]
//Output:
//7, 7, 7, 7, 7, 7
public class Task7 {
    public static void main(String[] args) {

        int[] arr =
                new int[]{ 1, 1, 1, 1, 1, 2, 2, 3, 4, 4, 4, 5, 5, 6, 7, 7, 7, 7, 7, 7, 8, 8, 9, 8, 8, 8, 8, 8, 8, 8, 8,
                        8
                        , 8, 8, 8, 8, 8, 8, 8, 8, 8, 8 };

        int maxSequence = 0;
        int duplicatedNumber = arr[0];
        int currentCount = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                currentCount++;
                duplicatedNumber = arr[i];
            } else {
                if (currentCount > maxSequence) {
                    maxSequence = currentCount;
                }
                currentCount = 1;
            }
        }

        int[] arrayWithDuplicates = new int[Math.max(maxSequence, currentCount)];
        Arrays.fill(arrayWithDuplicates, duplicatedNumber);

        System.out.println(Arrays.toString(arrayWithDuplicates));
    }
}

