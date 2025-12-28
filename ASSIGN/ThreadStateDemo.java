// Q2: WAP that demonstrates different states of thread using sleep() and wait()

class ThreadStateDemo extends Thread {
    public void run() {
        synchronized (this) {
            try {
                System.out.println(getName() + " is running...");
                Thread.sleep(1000); // TIMED_WAITING state
                System.out.println(getName() + " is waiting...");
                wait(); // WAITING state
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(getName() + " has resumed and finished execution.");
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadStateDemo t1 = new ThreadStateDemo();
        System.out.println("Thread state after creation: " + t1.getState());
        t1.start();

        Thread.sleep(500);
        System.out.println("Thread state after start: " + t1.getState());

        Thread.sleep(1500);
        synchronized (t1) {
            System.out.println("Thread state before notify: " + t1.getState());
            t1.notify(); // wake up from waiting
        }

        Thread.sleep(500);
        System.out.println("Thread state after notify: " + t1.getState());
    }
}
