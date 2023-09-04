package Homework7;

import java.util.Random;

public class Hero {
     String name;
     int health;
     int strength;
     int experience;
    int level;

    public Hero(String name, int health, int strength, int experience, int level) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.experience = experience;
        this.level = level;
    }

    public Hero() {
        this("Default Hero", 100, 7, 0, 1);
    }

    public void attack(Enemy enemy) {
        Random random = new Random();
        System.out.println("Tossing a coin");
        boolean heroStarts = random.nextBoolean();
        System.out.println(
                heroStarts ? "It's heads - Hero starts first!" : "It's tails - enemy starts " +
                        "first!");
        while (this.health > 0 && enemy.health > 0) {
            if (heroStarts) {
                if (random.nextDouble() < 0.3) {
                    System.out.println("Wow! Critical hit! + 3 point to strength!");
                    enemy.health -= (this.strength + 3);
                } else {
                    enemy.health -= this.strength;
                }
                heroStarts = false;
            } else {
                if (random.nextDouble() < 0.1) {
                    this.health -= enemy.strength + 3;
                } else {
                    this.health -= enemy.strength;
                }
                heroStarts = true;
            }
        }

        if (this.health > 0) {
            System.out.println("Hero, you have won this game!");
            this.health += 20;
            if ( new Random().nextDouble() < 0.3) {
                this.health += 20;
                System.out.println( "Wow! You received additional energy burst + 20 life points!");
            }
            this.experience += 50 * enemy.level;
            if (this.experience >= 100 * this.level) {
                this.levelUp();
            }
        } else {
            //What to do if hero loses???
            this.health = 100 * this.level;
            System.out.println("Sorry, you have lost current game:(");
        }
    }

    public void avoid() {
        int maxHealth = 100 * this.level;
        if (this.experience >= 10) {
            this.experience = this.experience - 10;
        }
        if (this.health + 50 < maxHealth) {
            this.health += 50;
        } else {
            this.health = maxHealth;
        }
    }

    public void levelUp() {
        this.health = (this.health + 50) * this.level;
        this.strength = (this.strength + (new Random().nextInt(3) + 3)) * this.level;
        this.level++;
        this.experience = 0;
    }
}
