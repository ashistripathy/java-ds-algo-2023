package adi.amazon;

public class PrintWithoutLoop {
    static int k = 1;
    public static void main(String [] args){
        printNumbers(10);
    }

    private static void printNumbers(int i) {
        if(k <= i){
            System.out.println(k++);
            main(null);
        }
    }
}
