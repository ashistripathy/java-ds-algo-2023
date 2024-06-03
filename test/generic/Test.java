package generic;

public class Test<T> {
    public T reverseStringI(T input){
        StringBuilder sb = new StringBuilder();
        String str = input.toString();

        for(int i = str.length()-1; i >= 0; i--){
            sb.append(str.charAt(i));
        }
        return (T) sb.toString();
    }
    public T reverseStringR(T input){
        String str = input.toString();
        if(str.length() == 0){
            return input;
        }else{
            T reverseString = reverseStringR((T)str.substring(1));
            return (T)(reverseString.toString() + str.charAt(0));
        }
    }
    public static void main(String[] args) {
        Test<String> test = new Test<>();
        String input = "Hello, World";

        // Using Iteration
        String output1 = test.reverseStringI(input);
        System.out.println("Using Iteration : "+ output1);

        // Using Recursion
        String output2 = test.reverseStringR(input);
        System.out.println("using Recursion : "+output2);
    }
}
