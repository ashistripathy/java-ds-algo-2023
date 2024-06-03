package hackerrank.morganstanly;

public class GenericsWithObjects<T> {
    T obj;
    GenericsWithObjects(T obj){
        this.obj = obj;
    }
    void print(){
        System.out.println(obj);
    }
}
