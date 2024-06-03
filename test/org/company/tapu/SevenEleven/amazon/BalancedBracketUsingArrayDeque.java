package org.company.tapu.SevenEleven.amazon;

import java.util.ArrayDeque;

public class BalancedBracketUsingArrayDeque {

    public static boolean isBalanced(String str) {
        //step 1 : create stack instance of ArrayDeque<Character>
        ArrayDeque<Character> stack = new ArrayDeque<>();

        //step 2 : Traverse the string with each character in index
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            //step 3 : check openings and push it into stack
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            //step 4: check the closing ones
            else if (c == ')' || c == ']' || c == '}') {
                //step 1 : check if the stack is empty and return false
                if (stack.isEmpty()) {
                    return false;
                }
                //step 2 : remove the top
                char top = stack.pop();
                //step 3 : check removed top char and pushed character
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        //step 5 : check if the stack is empty which will return a flag
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str1 = "((({}[])))";
        String str2 = "({[}])";
        System.out.println(isBalanced(str1)); // true
        System.out.println(isBalanced(str2)); // false
    }
}

