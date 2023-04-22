package hackerrank.morganstanly;

import java.util.ArrayList;
import java.util.List;

public class Mian {
    public static void main(String[] args) {
        List<A> list = new ArrayList<>();
        list.add(new B());
        list.add(new C());

        for(A a : list){
            a.x();
            //a.y();
        }
    }
}
