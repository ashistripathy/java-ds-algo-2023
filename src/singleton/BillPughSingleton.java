package singleton;

public class BillPughSingleton {
    private BillPughSingleton(){

    }
    private static class SingleTonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    public static BillPughSingleton getInstance(){
        return SingleTonHelper.INSTANCE;
    }
}
