package Homework7;

public class Enemy {

    int health;
    int strength;
    int level;

    public Enemy(int health, int strength, int level) {
        this.health = health;
        this.strength = strength;
        this.level = level;
    }

    public Enemy() {
        this(150, 4, 1);
    }

    public void attack(Hero hero) {
//do we need to implement?
    }
}
