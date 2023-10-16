package Homework4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Write a program where the user must enter a string that contains letters and
//numbers.
//The program should output all the numbers from the string, as well as the sum
//of the numbers.
//Example:
//Input:
//test12ing45how-12this65works
//Output:
//12
//45
//-12
//65
//The sum of all numbers is: 110
public class Task6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a string containing numbers ");
        String str = scan.nextLine();
        Pattern pattern = Pattern.compile("-?\\d+");
        Matcher matcher = pattern.matcher(str);

        int sum = 0;
        while (matcher.find()) {
            String numbers = matcher.group();
            int number = Integer.parseInt(numbers);
            sum += number;
        }
        System.out.println("The sum of all numbers is " + sum);
        scan.close();
    }
}
