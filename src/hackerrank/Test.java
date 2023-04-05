package hackerrank;

public class Test {
    Test(){
        System.out.println("print1");
    }
    public void testMethod(){
        System.out.println("print2");
    }
    {
        System.out.println("print3");
    }
    public void printTest(){
        System.out.println("print4");
    }
    static {
        System.out.println("print5");
    }
    public static void main(String[] args) {
       Test test1 = new Test();
       test1.printTest();
       test1.testMethod();
    }
}
