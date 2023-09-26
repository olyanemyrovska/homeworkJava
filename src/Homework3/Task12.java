package Homework3;
//You have a 7x7 two-dimensional array of natural numbers whose values are pre-entered. Write a program that finds
// and print in the console the smallest and the
//largest element from this array.
//Example:
//Input:
//48,72,13,14,15,43,19
//21,22,53,24,75,48,17
//31,57,33,34,35,63,12
//41,95,43,44,45,91,50
//59,52,53,54,55,14,32
//61,69,63,64,65,81,15
//42,32,12,26,59,67,97
//Output:
//The smallest number is: 12
//The largest number is: 97
public class Task12 {
    public static void main(String[] args) {
        int[][] array = {
                {48, 72, 13, 14, 15, 43, 19},
                {21, 22, 53, 24, 75, 48, 17},
                {31, 57, 33, 34, 35, 63, 12},
                {41, 95, 43, 44, 45, 91, 50},
                {59, 52, 53, 54, 55, 14, 32},
                {61, 69, 63, 64, 65, 81, 15},
                {42, 32, 12, 26, 59, 67, 97}
        };

        int smallestNumber = array[0][0];
        int largestNumber = array[0][0];

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                int currentElement = array[row][col];
                if (currentElement < smallestNumber) {
                    smallestNumber = currentElement;
                }
                if (currentElement > largestNumber) {
                    largestNumber = currentElement;
                }
            }
        }

        System.out.println("The smallest number is: " + smallestNumber);
        System.out.println("The largest number is: " + largestNumber);
    }
}