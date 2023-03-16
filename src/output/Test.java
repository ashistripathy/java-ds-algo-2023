package output;

public class Test {
    public static void main(String [] args){
        String s1 = "Hello";
        String s2 = new String("Hello");

        //s2 = s2.intern();

        System.out.println(s1==s2);

        System.out.println(s1.equals(s2));

        System.out.println(s1.hashCode());

        System.out.println(s2.hashCode());
    }
}
