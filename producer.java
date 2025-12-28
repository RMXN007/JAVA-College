// Q: Write a program in Java to demonstrate inter-thread communication using wait() and notify()
import java.io.*;

class SharedResource {
    private int data;
    private boolean hasData = false; // flag to track data availability

    // Producer method
    synchronized void produce(int value) {
        while (hasData) {  // if data already produced, wait until it's consumed
            try {
                wait(); // wait until consumer consumes the data
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        data = value;
        hasData = true;
        System.out.println("Producer produced: " + data);

        notify(); // notify the consumer thread
    }

    // Consumer method
    synchronized void consume() {
        while (!hasData) {  // if no data yet, wait for producer
            try {
                wait(); // wait until producer produces
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Consumer consumed: " + data);
        hasData = false;

        notify(); // notify the producer thread to produce again
    }
}

class Producer extends Thread {
    SharedResource resource;

    Producer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.produce(i);
            try {
                Thread.sleep(500); // simulate time delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    SharedResource resource;

    Consumer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.consume();
            try {
                Thread.sleep(1000); // simulate time delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class producer {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Producer p = new Producer(resource);
        Consumer c = new Consumer(resource);

        p.start();
        c.start();
    }
}
