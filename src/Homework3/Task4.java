package Homework3;

//Write a program that reads an array and print whether it is mirrored. The
//following arrays are mirrored:
//[4 6 6 4]
//[3]
//[23 4 4 23]
//[7 1 12 6 3 6 12 1 7]
public class Task4 {
    public static void main(String[] args) {

        int[] arr1 = new int[]{ 7, 1, 12, 6, 3, 6, 12, 1, 7 };
        int[] arr2 = new int[]{ 4, 6, 6, 4 };
        int[] arr3 = new int[]{ 1, 2, 3, 4, 5 };

        System.out.println(checkIfArrayIsMirrored(arr1));
        System.out.println(checkIfArrayIsMirrored(arr2));
        System.out.println(checkIfArrayIsMirrored(arr3));
    }

    public static boolean checkIfArrayIsMirrored(int[] arr) {
        boolean isMirrored = false;
        for (int i = 0; i < (arr.length / 2); i++) {
            if (arr[i] == arr[(arr.length - 1) - i]) {
                isMirrored = true;
            }
        }
        return isMirrored;
    }
}
