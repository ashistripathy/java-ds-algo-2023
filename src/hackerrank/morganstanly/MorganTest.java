package hackerrank.morganstanly;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CyclicBarrier;

public class MorganTest {
    private String s;
    public MorganTest(String s){
        this.s = s;
    }
    public static void main(String[] args) {
        final CyclicBarrier barrier = new CyclicBarrier(3,()-> System.out.println("Let's play"));
        Runnable r = ()->{
            try{
                barrier.await();
            }catch (Exception e){

            }
        };
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        t1.start();
        t2.start();
        t3.start();
        Set set = new TreeSet();
        set.add(new Integer(2));
        set.add(new Integer(1));
        System.out.println(set);

        HashSet<Object> hs = new HashSet<Object>();
        MorganTest mt1 = new MorganTest("aardvark");
        MorganTest mt2 = new MorganTest("aardvark");

        String s1 = new String("aardvark");
        String s2 = new String("aardvark");

        hs.add(mt1);
        hs.add(mt2);

        hs.add(s1);
        hs.add(s2);

        System.out.println(hs.size());

        Boolean buy = new Boolean(true);
        Boolean sell = new Boolean(true);

        System.out.println(buy==sell);

        boolean buyPrim = buy.booleanValue();
        System.out.println(!buyPrim);
        System.out.println(buy && sell);
    }
}
