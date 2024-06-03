package singleton;

//Example of singleton eager initalization
public class EagerSingleTon {
    private static final EagerSingleTon instance = new EagerSingleTon();

    private EagerSingleTon(){

    }
    public static EagerSingleTon getInstance(){
        return instance;
    }
}
