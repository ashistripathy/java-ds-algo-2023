package hackerrank.morganstanly;

public class Derived extends Base{
    public static void main(String[] args) {
        try{
            throw new Derived();
        }catch (Base b){
            System.out.println("Caught base class exception");
        }
    }
}
