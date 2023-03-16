package varargs;

import java.util.HashMap;
import java.util.Map;

public class VarArgsStringExample {
    public static void printNames(String ... names){
        System.out.print("names : ");
        for(String name : names){
            System.out.print(name + " ");
        }
    }
    public static void main(String ... args){
        printNames("Alice","Bob","Charlie");
        printNames("David","Emily");
        printNames("Frank");
        printNames();
    }
}
