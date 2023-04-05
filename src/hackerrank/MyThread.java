package hackerrank;

public class MyThread extends Thread{
    MyThread(){
        System.out.println("My Thread");
    }
    @Override
    public void run(){
        System.out.println("run");
    }
    public void run(String s){
        System.out.println("run with parameters");
    }
}
