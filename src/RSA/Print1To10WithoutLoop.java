package RSA;

public class Print1To10WithoutLoop {
    static int i = 1;
    public static void main(String [] args){
        if(i <= 10){
            System.out.println(i++);
            main(null);
        }
    }
}
