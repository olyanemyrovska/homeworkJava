package Homework3;

import java.util.Arrays;
import java.util.Scanner;

//Write a program in which the user enters an array, then turns the elements of
//the array (this should be a change to affect the array itself) in reverse order and
//outputs them. Solve the problem with:
//- one additional array
//- no additional arrays
//Example:
//Input:
//[1, 2, 3, 4, 5]
//Output:
//[5, 4, 3, 2, 1]
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the next element: ");
            array[i] = scanner.nextInt();
        }

        //with one additional array
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < reversedArray.length; i++) {
            reversedArray[i] = array[(array.length - 1) - i];
        }

        //without additional array
        int tmp;
        for (int i = 0; i < array.length / 2; i++) {
            tmp = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = tmp;
        }

        System.out.println(Arrays.toString(reversedArray));
        System.out.println(Arrays.toString(array));

        scanner.close();
    }
}
