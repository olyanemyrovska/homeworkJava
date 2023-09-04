package Homework5;

public class CarDemo {
    public static void main(String[] args) {
        Car ford = new Car();
        ford.color = "Green";

        Person olga = new Person();
        olga.name = "Olga";
        olga.age = 25;
        olga.age = 26;

        ford.person = olga;

        System.out.println(ford.person.age);

        Person yulia = new Person();
        yulia.name = "Yulia";
        yulia.age = 21;

        olga.friend = yulia;
        yulia.friend = olga;
        System.out.println(ford.person.friend.name);
        System.out.println(ford.person.friend.friend.name);

    }
}
