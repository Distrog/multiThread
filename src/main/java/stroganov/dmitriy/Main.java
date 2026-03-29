package stroganov.dmitriy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer();

        for (int i = 0; i < 5; i++) {
            PrinterThread printerThread = new PrinterThread("Thread"+i,printer);
            printerThread.start();
        }

    }
}