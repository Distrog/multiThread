package stroganov.dmitriy;

public class PrinterThread extends Thread{
    private final Printer printer;

    public PrinterThread(String name, Printer printer) {
        super(name);
        this.printer = printer;
    }

    @Override
    public void run() {
        try {
            printer.print(this.getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
