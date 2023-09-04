package Homework12;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//Write a program which displays a list of the most common letters in text entered
//by the user. The program to output statistical information about the frequency
//of occurrence of the letters, not distinguishing between uppercase and
//lowercase letters. The letters should be arranged according to the frequency of
//occurrence in the text. On each line, write the letter, the number of occurrences,
//as well as a graph to illustrate the percentage of occurrences (using the "#"
//symbol).
//Example:
//Input:
//“His name is Slim Shady!”
//Output:
//Most common letters:
//S: 4 ####################
//I: 3 ###############
//A: 2 ##########
//H: 2 ##########
//M: 2 ##########
//D: 1 #####
//E: 1 #####
//L: 1 #####
//N: 1 #####
//Y: 1 #####
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        String inputString = scanner.nextLine();
        scanner.close();

        inputString = inputString.replaceAll("\\s", "").toUpperCase();

        Map<Character, Integer> letters = new TreeMap<>();
        for (char c : inputString.toCharArray()) {
            if (Character.isLetter(c)) {
                if (!letters.containsKey(c)) {
                    letters.put(c, 1);
                } else {
                    letters.put(c, letters.get(c) + 1);
                }
            }
        }
        ValueComparator valueComparator = new ValueComparator(letters);
        TreeMap<Character, Integer> sortedLetters = new TreeMap<>(valueComparator);
        sortedLetters.putAll(letters);

        System.out.println("Most common letters:");
        int totalLetters = inputString.length();
        for (Map.Entry<Character, Integer> entry : sortedLetters.entrySet()) {
            char letter = entry.getKey();
            int frequency = entry.getValue();
            int percentage = 100 * entry.getValue() / totalLetters;
            String hash = "#".repeat(percentage);
            System.out.printf("%s: %d %s%n", letter, frequency, hash);
        }
    }
}
