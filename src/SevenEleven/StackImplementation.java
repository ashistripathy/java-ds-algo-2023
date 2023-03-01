package SevenEleven;

import java.util.EmptyStackException;
import java.util.Vector;

public class StackImplementation<E> extends Vector<E> {
    //empty stack
    public StackImplementation(){

    }
    public E push(E item){
        addElement(item);
        return item;
    }
    public synchronized E pop(){
        E   obj;
        int len = size();

        obj = peek();
        removeElementAt(len-1);

        return obj;
    }
    public synchronized E peek(){
        int len = size();
        if(len == 0)
            throw new EmptyStackException();
        return elementAt(len-1);
    }
    public static void main(String [] args){
        StackImplementation si = new StackImplementation();
        si.push(13);
        si.push(15);
        System.out.println(si);
    }
}
