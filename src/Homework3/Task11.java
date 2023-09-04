package Homework3;

//      We have two one-dimensional arrays with natural numbers. Create a program
//that compares all numbers
//with the same indexes from both arrays and writes in a third array the smaller of
//the two numbers. At the end print the console the following:
//- the content of all three arrays
//- the sum of the three arrays
//- the product of the elements of the last array
//Example:
//Input:
//[18, 19, 32, 1, 3, 4, 5, 6, 7, 8]
//[ 1, 2, 3, 4, 5, 16, 17, 18, 27, 11]
//Output:
//The content of all 3 arrays
//[18, 19, 32, 1, 3, 4, 5, 6, 7, 8]
//[1, 2, 3, 4, 5, 16, 17, 18, 27, 11]
//[1, 2, 3, 1, 3, 4, 5, 6, 7, 8]
//The sum of the 3 arrays: 103 + 104 + 40 = 247
//The product of the elements of the third array: 120 960
public class Task11 {
    public static void main(String[] args) {
        int[] array1 = { 18, 19, 32, 1, 3, 4, 5, 6, 7, 8 };
        int[] array2 = { 1, 2, 3, 4, 5, 16, 17, 18, 27, 11 };
        int length = Math.min(array1.length, array2.length);
        int[] finalArray = new int[length];

        for (int i = 0; i < array1.length; i++) {
            finalArray[i] = Math.min(array1[i], array2[i]);
        }

        System.out.println("The content of all 3 arrays");
        System.out.println(java.util.Arrays.toString(array1));
        System.out.println(java.util.Arrays.toString(array2));
        System.out.println(java.util.Arrays.toString(finalArray));

        int sumOfFirstArr = 0;
        for (int num : array1) {
            sumOfFirstArr += num;
        }
        int sumOfSecondArr = 0;
        for (int num : array2) {
            sumOfSecondArr += num;
        }
        int sumOfThirdArr = 0;
        for (int num : finalArray) {
            sumOfThirdArr += num;
        }

        System.out.printf("The sum of the 3 arrays:  %d + %d + %d = %d %n", sumOfFirstArr, sumOfSecondArr,
                sumOfThirdArr, sumOfFirstArr + sumOfSecondArr + sumOfThirdArr);

        long product = 1;
        for (int num : finalArray) {
            product *= num;
        }
        System.out.println("The product of the elements of the third array: " + product);
    }
}

