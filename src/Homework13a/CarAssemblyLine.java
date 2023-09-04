package Homework13a;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CarAssemblyLine {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Tire[] tires = new Tire[4];
        Seat[] seats = new Seat[5];
        Engine engine = new Engine();
        Frame frame = new Frame();

        for (int i = 0; i < 4; i++) {
            Tire tire = new Tire();
            executor.submit(tire);
            tires[i] = tire;
        }

        for (int i = 0; i < 5; i++) {
            Seat seat = new Seat();
            executor.submit(seat);
            seats[i] = seat;
        }

        executor.submit(engine);
        executor.submit(frame);
        executor.shutdown();
        try {
            if (executor.awaitTermination(60, TimeUnit.SECONDS)) {
                Car car = new Car(tires, seats, engine, frame);
                try (FileOutputStream fileOut = new FileOutputStream("car.ser");
                     ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
                    out.writeObject(car);
                }
            } else {
                System.err.println("Executor did not terminate in the specified time.");
            }
        } catch (InterruptedException | IOException e ) {
            System.out.println("Exception occurred while execution a program: " + e);
        }
    }
}