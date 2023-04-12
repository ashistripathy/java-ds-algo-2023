package org.company.tapu.volkswagen;

public class DaemonThreadExample extends Thread{
    public static void main(String[] args) {
        Thread daemonThread = new Thread(new MyDaemonRunnable());
        daemonThread.setDaemon(true);
        daemonThread.start();
    }

}
class MyDaemonRunnable implements Runnable{

    @Override
    public void run() {
        while(true){
            System.out.println("Performing some background work ");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){

            }
        }
    }
}
