package io.zipcoder;

import java.util.Stack;

public class ParenChecker {
    Stack<Character> stack = new Stack<Character>();

    public ParenChecker() {
    }

    public boolean parenChecker(String s){
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' ){
                stack.push(c);
            }else if(c == ')'){
                if(stack.isEmpty() || stack.pop() != '('){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public boolean pairChecker(String s){
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[' || c == '<' || c == ' ' || c == '"') {
                stack.push(c);
            }else if(c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') return false;
            }
            else if(c == '}'){
                if(stack.isEmpty() || stack.pop() != '{') return false;
            }
            else if(c == ']'){
                if(stack.isEmpty() || stack.pop() != '[') return false;
            }
            else if(c == '>'){
                if(stack.isEmpty() || stack.pop() != '<') return false;
            }
            else if(c == '\''){
                if(stack.isEmpty() || stack.pop() != '\'') return false;
            }
            else if(c == '\"'){
                if(stack.isEmpty() || stack.pop() != '\"') return false;
            }
        }
        return stack.isEmpty();
    }
}
