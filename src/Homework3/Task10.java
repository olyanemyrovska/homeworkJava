package Homework3;

//A sequence of natural numbers we will call zigzag if the following conditions are
//met for its elements:
//N1 < N2 > N3 < N4 > N5 < … > Ni < Nj > … < Nn
//or
//N1 > N2 < N3 > N4 < N5 > … < Ni > Nj < … > Nn
//Write a program that checks whether a sequence of numbers entered into a
//one-dimensional array meet the above requirements.
//Example:
//Input:
//[1, 6, 3, 7, 2, 9, -2, 12, 5]
//[1, 2, 3, 4, 5, 6, 7, 8, 9]
//Output:
//Zigzag
//Not a Zigzag
public class Task10 {
    public static void main(String[] args) {
        int[] arr = { 1, 6, 3, 7, 2, 9, -2, 12, 5 };
        if (arr.length < 3) {
            System.out.println("Minimum 3 elements required");
        }

        //my first solution - not sure if OK, but it works somehow
        boolean isZigzag = true;

        for (int i = 0; i < arr.length - 2; i++) {
            if (!((arr[i] < arr[i + 1] && arr[i + 1] > arr[i + 2]) ||
                    (arr[i] > arr[i + 1] && arr[i + 1] < arr[i + 2]))) {
                isZigzag = false;
                break;
            }
        }

        //second solution
        System.out.println(isZigzag ? "Zigzag" : "Not a Zigzag");

        for (int i = 0; i < arr.length - 1; i++) {
            if (i % 2 == 0) {
                if (!(arr[i] < arr[i + 1])) {
                    isZigzag = false;
                    break;
                }
            } else {
                if (!(arr[i] > arr[i + 1])) {
                    isZigzag = false;
                    break;
                }
            }
        }
        System.out.println(isZigzag ? "Zigzag" : "Not a Zigzag");

        for (int i = 0; i < arr.length - 1; i++) {
            if (i % 2 == 0) {
                if (!(arr[i] > arr[i + 1])) {
                    isZigzag = false;
                    break;
                }
            } else {
                if (!(arr[i] < arr[i + 1])) {
                    isZigzag = false;
                    break;
                }
            }
        }
        System.out.println(isZigzag ? "Zigzag" : "Not a Zigzag");
    }
}

