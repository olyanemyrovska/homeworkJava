package Last3Homeworks.Homework13a;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CarAssemblyLine {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Homework13.Tire[] tires = new Homework13.Tire[4];
        Homework13.Seat[] seats = new Homework13.Seat[5];
        Homework13.Engine engine = new Homework13.Engine();
        Homework13.Frame frame = new Homework13.Frame();

        for (int i = 0; i < 4; i++) {
            Homework13.Tire tire = new Homework13.Tire();
            executor.submit(tire);
            tires[i] = tire;
        }

        for (int i = 0; i < 5; i++) {
            Homework13.Seat seat = new Homework13.Seat();
            executor.submit(seat);
            seats[i] = seat;
        }

        executor.submit(engine);
        executor.submit(frame);
        executor.shutdown();
        try {
            if (executor.awaitTermination(60, TimeUnit.SECONDS)) {
                Homework13.Car car = new Homework13.Car(tires, seats, engine, frame);
                try (FileOutputStream fileOut = new FileOutputStream("car.ser");
                     ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
                    out.writeObject(car);
                }
            } else {
                System.err.println("Executor did not terminate in the specified time.");
            }
        } catch (InterruptedException | IOException e) {
            System.out.println("Exception occurred while execution a program: " + e);
        }
    }
}