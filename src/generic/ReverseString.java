package generic;
public class ReverseString<T> {

    // Method to reverse a string using iteration
    public T reverseUsingIteration(T input) {
        StringBuilder sb = new StringBuilder();
        String str = input.toString();
        for(int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return (T) sb.toString();
    }

    // Method to reverse a string using recursion
    public T reverseUsingRecursion(T input) {
        String str = input.toString();
        if(str.length() == 0) {
            return input;
        } else {
            T reverseString = reverseUsingRecursion((T)str.substring(1));
            return (T) (reverseString.toString() + str.charAt(0));
        }
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        ReverseString<String> reverseString = new ReverseString<>();
        String input = "hello world";

        // Using iteration
        String output1 = reverseString.reverseUsingIteration(input);
        System.out.println("Using iteration: " + output1);

        // Using recursion
        String output2 = reverseString.reverseUsingRecursion(input);
        System.out.println("Using recursion: " + output2);
    }
}
