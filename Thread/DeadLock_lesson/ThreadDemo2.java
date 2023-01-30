package DeadLock_lesson;

import static DeadLock_lesson.DeadLock.Lock1;
import static DeadLock_lesson.DeadLock.Lock2;

public class ThreadDemo2 extends Thread {
    public void run() {
        synchronized (Lock2) {
            System.out.println("Thread 2: Holding lock 2...");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
            System.out.println("Thread 2: Waiting for lock 1...");

            synchronized (Lock1) {
                System.out.println("Thread 2: Holding lock 1 & 2...");
            }
        }
    }
}
