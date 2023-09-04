package Homework7;

import java.util.Random;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Random random = new Random();
        int heroStrength = random.nextInt(5, 11);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter desired Hero name:");
        String name = scan.nextLine();
        Hero hero = new Hero(name, 100, heroStrength, 0, 1);
        System.out.println("Let's go " + name + "!");

        for (int i = 1; i < 11; i++) {
            Enemy enemy = createNewEnemy(hero);
            System.out.println("Starting game iteration # " + i);
            System.out.println();
            System.out.println("Would you like to skip current game iteration? (y/n)");
            String skip = scan.nextLine();

            if (skip.equalsIgnoreCase("y")) {
                hero.avoid();
            } else if (skip.equalsIgnoreCase("n")) {
                hero.attack(enemy);
            } else {
                System.out.println("Please provide a valid input");
            }
        }
        scan.close();
    }

    public static Enemy createNewEnemy(Hero hero) {
        Random random = new Random();
        int enemyHealth = random.nextInt(100, 101) * hero.level;
        int enemyStrength = (int) (random.nextInt(3, 9) + 0.10 * hero.strength);
        int enemyLevel = random.nextInt(1, hero.level + 1);
        return new Enemy(enemyHealth, enemyStrength, enemyLevel);
    }
}

