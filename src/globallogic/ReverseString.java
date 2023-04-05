package globallogic;

public class ReverseString {
    public static void main(String[] args) {
        String str = "hello world";
        String reversed = reversedString(str);//Predefined Function Approach
        String reversedTA = reverseStringTA(str);//Traditional Approach

        System.out.println("Orginal String "+ str);
        System.out.println("Reversed String "+reversed);
        System.out.println("Reversed String TA "+reversedTA);
    }
    public static String reversedString(String str){
        return new StringBuilder(str).reverse().toString();
    }
    public static String reverseStringTA(String str){
        if(str == null || str.length() == 0){
            return str;
        }
        char [] chars = str.toCharArray();
        int start = 0;
        int end = str.length()-1;

        while (start < end){
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = chars[start];
            start++;
            end--;
        }
        return new String(chars);
    }
}
