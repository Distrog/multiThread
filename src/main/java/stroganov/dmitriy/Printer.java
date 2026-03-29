package stroganov.dmitriy;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Printer {

    private final Lock lock = new ReentrantLock();

    public void print(String threadName) throws InterruptedException {
        lock.lock();
        try {
            System.out.println("поток " + threadName + " начал работу");
            Thread.sleep(1000);
            System.out.println("поток " + threadName + " продолжает работу");
            Thread.sleep(1000);
            System.out.println("поток " + threadName + " почти закончил работу");
            Thread.sleep(1000);
            System.out.println("поток " + threadName + " закончил работу");
        } finally {
            lock.unlock();
        }
    }
}
