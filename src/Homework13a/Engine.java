package Homework13a;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

public class Engine implements Runnable, Serializable {
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