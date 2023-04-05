package hackerrank;

public class TestThreads {
    public static void main(String[] args) {
        Thread t = new Thread(){
            @Override
            public void run(){
                System.out.println("Hi");
            }
        };
        t.start();
    }
}
