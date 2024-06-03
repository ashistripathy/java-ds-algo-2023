package singleton;

public class BillPughSingleTonDriver {
    public static void main(String [] args){
        BillPughSingleton singleton1 = BillPughSingleton.getInstance();
        BillPughSingleton singleton2 = BillPughSingleton.getInstance();

        System.out.println("Hashcode of singleton1 "+singleton1.hashCode());
        System.out.println("Hashcode of singleton2 "+singleton2.hashCode());
    }
}
