package varargs;

public class VarArgsExample {
    public static int sum(int ... numbers){
        int total = 0;

        for(int num : numbers){
            total += num;
        }
        return total;
    }
    public static void main(String [] args){
        System.out.println(sum(2,4,5,6));
        System.out.println(sum(2,4,5,6,7));
        System.out.println(sum(2,4,5,6,7,8));
    }
}
