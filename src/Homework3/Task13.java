package Homework3;

import java.util.Scanner;//    You have a square two-dimensional array of natural numbers whose values are
//    entered from the console (by the user). The program should print the sum of
//    each of the diagonals of the array.
//            Example:
//    Input:
//            1, 4, 6, 3
//            5, 9, 7, 2
//            4, 8, 1, 9
//            2, 3, 4, 5
//    Output:
//    The main diagonal sum is: 16
//    The second diagonal sum is: 20

public class Task13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the two-dimensional square array: ");
        int size = scan.nextInt();
        int[][] array = new int[size][size];

        System.out.println("Enter the values for the array:");
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                array[row][col] = scan.nextInt();
            }
        }

        scan.close();

//        int[][] array = {
//                { 1, 4, 6, 3 },
//                { 5, 9, 7, 2 },
//                { 4, 8, 1, 9 },
//                { 2, 3, 4, 5 }
//        };

        int mainDiagonal = 0;
        int secondDiagonal = 0;

        for (int i = 0; i < array.length; i++) {
            mainDiagonal += array[i][i];
        }
        for (int i = 0; i < array.length; i++) {
            secondDiagonal += array[i][array.length - 1 - i];
        }
        System.out.println("The main diagonal sum is: " + mainDiagonal);
        System.out.println("The second diagonal sum is: " + secondDiagonal);
    }
}
