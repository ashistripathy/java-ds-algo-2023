package adi.amazon;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class BalancedBracket {
    public static void main(String[] args) {
        String s = "{[()]}";
        if(isBalanced(s)){
            System.out.println("The string " + s + " has balanced brackets.");
        }else{
            System.out.println("The string " + s + " has not balanced brackets.");
        }
    }
    public static boolean isBalanced(String s){
        if(s == null || s.isEmpty()){
            return true;
        }
        Deque<Character> stack = new ArrayDeque<>();
        for(Character c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            }else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            }else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
