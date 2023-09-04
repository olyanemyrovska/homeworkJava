package Homework5;

import java.util.Arrays;

public class Lesson6 {
    //    Write a method that counts how many times each English letter occurs in a given
//    character string. Store the results in an array.
//    Example:
//    Input:
//    AaaEbBCc deD
//    Output:
//    a-3
//    b-2
//    c-2
//    d-2
//    e-2
//    f-0
    public static void main(String[] args) {

        String input = "AaaEbBCc deD";
        countChars(input);
    }

    public static void countChars(String input) {
        input = input.replaceAll("\\W", "").toLowerCase();
        int[] counting = new int[26];

        for (int i = 0; i < input.length(); i++) {
            counting[input.charAt(i) - 'a']++; // ASCII a = 97
        }
        for (int i = 0; i <counting.length ; i++) {
            System.out.println((char)(i+'a') + "-" + counting[i]);
        }
    }
}


