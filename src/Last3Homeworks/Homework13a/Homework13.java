package Last3Homeworks.Homework13a;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;
//Sorry I was updating files and somehow put all classes into one
public class Homework13 {
    static class Frame implements Runnable, Serializable {
        @Override
        public void run() {
            try {
                TimeUnit.SECONDS.sleep(5);
                System.out.println("New Frame is created in thread: " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static class Seat implements Serializable, Runnable {
        @Override
        public void run() {
            try {
                TimeUnit.SECONDS.sleep(3);
                System.out.println("New Seat is created in thread: " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static class Tire implements Runnable, Serializable {

        @Override
        public void run() {
            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.println("New Tire is created in thread: " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static class Engine implements Runnable, Serializable {
        @Override
        public void run() {
            try {
                TimeUnit.SECONDS.sleep(7);
                System.out.println("New Engine is created in thread: " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static class Car implements Serializable {
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
}
