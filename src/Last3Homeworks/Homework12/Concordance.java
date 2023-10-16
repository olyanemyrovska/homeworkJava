package Last3Homeworks.Homework12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//    Write a program which creates a concordance of characters occurring in a string
//            (i.e., which characters occur where in a string). Read the string from the
//    command line (by the user).
//    Example:
//    Input:
//    Hello World
//    Output:
//    {d=[10], o=[4, 7], r=[8], W=[6], H=[0], l=[2, 3, 9], e=[1]}

public class Concordance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        String inputString = scanner.nextLine();
        scanner.close();
        Map<Character, ArrayList<Integer>> concordance = new HashMap<>();

        for (int i = 0; i < inputString.length(); i++) {
            if (Character.isLetter(inputString.charAt(i))) {
                char character = inputString.charAt(i);
                if (!concordance.containsKey(character)) {
                    concordance.put(character, new ArrayList<>());
                }
                concordance.get(character).add(i);
            }
        }
        System.out.println(concordance);
    }
}
