package adi.amazon;

import java.util.Stack;

public class BalancedBracket {
    public static void main(String [] args){
        System.out.println(areBalancedBracket("[()]"));
    }

    private static boolean areBalancedBracket(String s) {
        //ArrayDeque will perform better
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char x = s.charAt(i);
            if(x == '(' || x == '{' || x == '['){
                stack.push(x);
                continue;
            }
            if(stack.isEmpty())
                return false;
            char check;
            switch (x){
                case ')':
                    check = stack.pop();
                    if(check == '{' || check == '[')
                        return false;
                    break;
                case '}':
                    check = stack.pop();
                    if(check == '(' || check == '[')
                        return false;
                    break;
                case ']':
                    check = stack.pop();
                    if(check == '{' || check == '(')
                        return false;
                    break;
            }
        }
        return (stack.isEmpty());
    }
}
