package Homework13a;

import java.io.Serializable;

class Car implements Serializable {
    // Car components
    private Tire[] tires;
    private Seat[] seats;
    private Engine engine;
    private Frame frame;

    public Car(Tire[] tires, Seat[] seats, Engine engine, Frame frame) {
        this.tires = tires;
        this.seats = seats;
        this.engine = engine;
        this.frame = frame;
        System.out.println("Car is created!");
    }
}