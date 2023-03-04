package adi.amazon;

import java.util.ArrayDeque;

public class BalancedBracketUsingArrayDeque {

    public static boolean isBalanced(String str) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str1 = "((({}[])))";
        String str2 = "({[}])";
        System.out.println(isBalanced(str1)); // true
        System.out.println(isBalanced(str2)); // false
    }
}

