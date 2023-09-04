package Homework5;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 1, 4, 2, 8, 2, 0, 1 };

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        boolean isSorted;

        for (int i = 0; i < arr.length - 1; i++) {
            isSorted = true;

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                    System.out.println(Arrays.toString(arr));
                }
            }
            if(isSorted){
                break;
            }
        }
    }
}