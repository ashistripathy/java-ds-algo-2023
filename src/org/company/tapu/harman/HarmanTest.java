package org.company.tapu.harman;

import java.util.Arrays;

public class HarmanTest {
    public static void main(String[] args) {
        String [] strArray = {"Ashis","Tripathy","Suresh","Wadekar","Sonali Dash"};

        /* print each word in reverse order */
        //
        String [] reversedArr = reverseWords(strArray);
        System.out.println(Arrays.toString(reversedArr));
        //Map<String, Long> stringMap = Arrays.stream(strArray).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        String reverse = "";
        /* FIRST APPROACH : using  traditonal approach */
        for(int i = 0; i < strArray.length; i++){
            char [] charArray = strArray[i].toCharArray();
            for(int j = charArray.length-1; j >= 0; j--){
                reverse += charArray[j];
            }
            System.out.println(reverse);
        }
        /* Third Approach using Stream API */
        String [] reversedArray = Arrays.stream(strArray)
                .map(str -> new StringBuilder(str).reverse().toString())
                .toArray(String [] :: new);
        System.out.println(Arrays.toString(reversedArray));
    }
    public static String [] reverseWords(String [] strArray){
        /* SECOND APPROACH using String Builder */
        for(int i = 0; i < strArray.length; i++){
            String [] words = strArray[i].split(" ");
            StringBuilder sb = new StringBuilder();
            for(String word : words){
                char [] letters = word.toCharArray();
                for(int j = letters.length-1; j >= 0; j--){
                    sb.append(letters[j]);
                }
                sb.append(" ");
            }
            strArray[i] = sb.toString().trim();
            System.out.println();
        }
        return strArray;
    }
}
