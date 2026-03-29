package stroganov.dmitriy;

public class Printer {

    private boolean isFree = true;

    public synchronized void print(String threadName) throws InterruptedException {

        while (!isFree) {
            wait();
        }

        isFree = false;

        try {
            System.out.println("поток " + threadName + " начал работу");
            Thread.sleep(1000);
            System.out.println("поток " + threadName + " продолжает работу");
            Thread.sleep(1000);
            System.out.println("поток " + threadName + " почти закончил работу");
            Thread.sleep(1000);
            System.out.println("поток " + threadName + " закончил работу");
        } finally {
            isFree = true;
            notifyAll();
        }
    }
}
