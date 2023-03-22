package morganstanley;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountNoOfSubstring {
    public static void main(String [] args){
        String str = "abcdeabcghabcijabc";
        String subStr = "abc";
        int count = countSubstring(str,subStr);
        System.out.println("Number of occurence of the sub string "+ subStr + " in string"+str+" is : "+count);
    }

    private static int countSubstring(String str, String subStr) {
        Pattern patter = Pattern.compile(subStr);
        Matcher matcher = patter.matcher(str);
        int count = 0;

        while (matcher.find()){
            count++;
        }
        return count;
    }
}
