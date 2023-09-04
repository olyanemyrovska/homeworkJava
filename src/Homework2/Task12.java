package Homework2;
//Write a program that aims to output all natural three-digit numbers that do not
//have the same digits.
public class Task12 {
    public static void main(String[] args) {
            System.out.println("Three-digit numbers with distinct digits:");
            for (int i = 102; i <= 987; i++) {
                int num = i;
                int digit1 = num % 10;
                num /= 10;
                int digit2 = num % 10;
                num /= 10;
                int digit3 = num;

                if (digit1 != digit2 && digit2 != digit3 && digit1 != digit3) {
                    System.out.println(i);
                }
            }
        }
}