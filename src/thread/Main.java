package thread;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer();

        Thread t1 = new Thread(new NumberRunnable(printer));
        Thread t2 = new Thread(new CharacterRunnable(printer));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class Printer {
        private volatile boolean isNumber = true;

        synchronized void printNumber(int num) {
            while (!isNumber) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.print(num);
            isNumber = false;
            notifyAll();
        }

        synchronized void printCharacter(char c) {
            while (isNumber) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.print(c);
            isNumber = true;
            notifyAll();
        }
    }

    static class NumberRunnable implements Runnable {
        private final Printer printer;

        public NumberRunnable(Printer printer) {
            this.printer = printer;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                printer.printNumber(i);
            }
        }
    }

    static class CharacterRunnable implements Runnable {
        private final Printer printer;

        public CharacterRunnable(Printer printer) {
            this.printer = printer;
        }

        @Override
        public void run() {
            for (char c = 'a'; c <= 'z'; c++) {
                printer.printCharacter(c);
            }
        }
    }
}

