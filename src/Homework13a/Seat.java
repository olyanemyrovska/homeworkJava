package Homework13a;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

class Seat implements Serializable, Runnable {
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
