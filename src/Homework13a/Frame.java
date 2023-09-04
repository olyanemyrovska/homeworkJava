package Homework13a;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

class Frame implements Runnable, Serializable {
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