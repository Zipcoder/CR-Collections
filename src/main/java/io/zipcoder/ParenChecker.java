package io.zipcoder;

import java.util.Stack;

public class ParenChecker {
    public Stack<Character> stack = new Stack<Character>();


    public ParenChecker(){

    }
    public ParenChecker(Stack<Character> stack) {
        this.stack = stack;
    }

    public boolean isPairedParenthesis(String str){
        for (int i = 0; i <str.length() ; i++) {
            char current = str.charAt(i);
            if (current == '(') {
                stack.push(current);
            } else if (current == ')') {
                if (stack.isEmpty()){
                    return false;
                }
                    else if (stack.peek() == '(') {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }



    public boolean isBalancedBrackets(String str){
        for (int i = 0; i <str.length() ; i++) {
            char current = str.charAt(i);
            if (current == '(' ||current == '{' ||current == '[' ||current == '<' ||
                    current == '\"' ||current == '\'' ) {
                stack.push(current);
            } else if (current == ')'||current == '}' ||current == ']' ||current == '>' ||
                    current == '"' ||current == '\'' ) {
                if (stack.isEmpty()){
                    return false;
                }
                else if (stack.peek() == '(') {
                    stack.pop();
                }
                else if (stack.peek() == '{') {
                    stack.pop();
                }
                else if (stack.peek() == '[') {
                    stack.pop();
                }
                else if (stack.peek() == '<') {
                    stack.pop();
                }
                else if (stack.peek() == '\"') {
                    stack.pop();
                }
                else if (stack.peek() == '\'') {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();



    }
}
