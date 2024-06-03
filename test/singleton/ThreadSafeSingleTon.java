package singleton;

public class ThreadSafeSingleTon {
    private static volatile ThreadSafeSingleTon instance;

    private ThreadSafeSingleTon(){

    }
    public static ThreadSafeSingleTon getInstance(){
        if(instance == null){
            synchronized (ThreadSafeSingleTon.class){
                if(instance == null){
                    instance = new ThreadSafeSingleTon();
                }
            }
        }
        return instance;
    }
}
