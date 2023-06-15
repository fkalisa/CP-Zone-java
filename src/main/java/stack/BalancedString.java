package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedString {
    public static void main(String[] args) {
        // String value = "()()[()]";
        //String value = "()()[(])";
        //String value = "[()";
        //String value = "])(";
        String value = "]()";
        System.out.println(isBalanced(value));


    }

    public static boolean isBalanced(String input){
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']','[');
        map.put('}', '{');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            Character current = input.charAt(i);
            if (isOpening(current)){
                stack.push(current);
            }else {
                if(!stack.isEmpty() && stack.peek() == map.get(current)){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static boolean isOpening(Character input){
        return input == '(' || input == '[' || input =='{';
    }
}
