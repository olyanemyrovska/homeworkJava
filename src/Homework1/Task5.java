package Homework1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int time;
        double amountOfMoney;
        boolean amIAtWork;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the current time (from 1 to 24)");
        time = scan.nextInt();
        while (time > 24 || time < 1) {
            System.out.println("Please enter valid time from 1 to 24");
            time = scan.nextInt();
        }
        System.out.println("The amount of money I have:");
        amountOfMoney = scan.nextDouble();
        System.out.println("I am at work: (true/false)");
        amIAtWork = scan.nextBoolean();
        scan.close();

        boolean isDay = time >= 6 && time <= 18;

        if (amIAtWork) {
            System.out.println("I'm mot going out");
        } else if (isDay && amountOfMoney > 10.0d) {
            System.out.println("I'm going to the cinema");
        } else if (isDay && amountOfMoney <= 10.0d) {
            System.out.println("I'm going for a walk");
        } else if (!isDay && amountOfMoney > 20.0d) {
            System.out.println("I'm going to a disco");
        } else if (!isDay && amountOfMoney <= 20.0d) {
            System.out.println("I'm going to sleep");
        }
    }
}
