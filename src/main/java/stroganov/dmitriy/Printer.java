package stroganov.dmitriy;

public class Printer {

    public void print(String threadName) throws InterruptedException {
        System.out.println("поток " + threadName + " начал работу");
        Thread.sleep(1000);
        System.out.println("поток " + threadName + " продолжает работу");
        Thread.sleep(1000);
        System.out.println("поток " + threadName + " почти закончил работу");
        Thread.sleep(1000);
        System.out.println("поток " + threadName + " закончил работу");
    }
}
