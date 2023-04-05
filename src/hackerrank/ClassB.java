package hackerrank;

public class ClassB extends ClassA{
    ClassB(){
        super();
        System.out.println("Class B constructor with no argument");
    }
    protected void show(){
        System.out.println("Class B show method");
    }
    public static void methodA(){
        System.out.println("Class B method");
    }
}
