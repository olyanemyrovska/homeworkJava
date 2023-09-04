package Homework13a;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

class Tire implements Runnable, Serializable {

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

