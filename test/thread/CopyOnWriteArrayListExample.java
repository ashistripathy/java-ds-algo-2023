package thread;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        list.add("Python");
        list.add("C++");
        list.add("java");

        //print the list
        System.out.println(list);

        //Modify the list while iterating
        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()){
            String element = iterator.next();
            if(element.equals("Python")){
                list.add("Javascript");
            }
        }
        System.out.println("List : "+list);
    }
}
