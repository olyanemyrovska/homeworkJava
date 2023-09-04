package Last3Homeworks.Homework12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    //Write a program which creates ArrayList with 20 random numbers between 0
    //and 5000.
    //• The user enters a random number, the program must say if the
    //list contains that number. If yes, show the index, otherwise
    //show appropriate message.
    //• Find min and max number in the list.
    //• Show all the elements of the list.

    public static void main(String[] args) {
        List<Integer> listWithRandomNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            listWithRandomNumbers.add(random.nextInt(5000));
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number from 0 to 5000:");
        int guessNumber = scanner.nextInt();
        if (guessNumber > 5000 || guessNumber < 0) {
            System.out.println("You number is out of range of valid values.");
        } else if (listWithRandomNumbers.contains(guessNumber)) {
            System.out.println("List contains the number at index " + listWithRandomNumbers.indexOf(guessNumber));
        } else {
            System.out.println("List does not contain entered number");
        }

        System.out.println("Max random number in array is " + Collections.max(listWithRandomNumbers));
        System.out.println("Min random number in array is " + Collections.min(listWithRandomNumbers));
        System.out.println(listWithRandomNumbers);

        scanner.close();
    }
}
