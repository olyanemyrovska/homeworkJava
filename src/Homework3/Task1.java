package Homework3;

public class Task1 {
    //       Write a program that read the array and find the largest number multiple of 5 in
//       the array.
//       Example:
//       Input:
//[1, 4, 5, 2, 7, 10, 14, 55, 17, 25, 15, 12]
//       Output:
//       55
    public static void main(String[] args) {
        int[] arr = new int[]{ 1, 4, 5, 2, 7, 10, 14, 55, 17, 25, 15, 12, -100, 150 };
        int largestMultipleOf5 = Integer.MIN_VALUE;
        for (int i =0; i<arr.length; i++) {
            if ((arr[i] % 5 == 0) && (arr[i] > largestMultipleOf5)){
                largestMultipleOf5 = arr[i];
            }
        }
        System.out.println(largestMultipleOf5);
    }
}
