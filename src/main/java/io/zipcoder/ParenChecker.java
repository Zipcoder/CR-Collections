package io.zipcoder;

import java.util.Stack;

public class ParenChecker {

    Stack<Character> parenStack = new Stack();

    public boolean parenCheck(String string){

        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i)==')' && parenStack.empty()){
                break;
            }
            if(string.charAt(i)=='('){
                parenStack.push(string.charAt(i));
            }
            if(string.charAt(i)==')'){
                parenStack.pop();
            }
        }

        return parenStack.empty();
    }

    public boolean parenPairs(String string) {
        for (int i = 0; i < string.length(); i++) {
            char current = string.charAt(i);
            if (current == '(' || current == '{'
                    || current == '[' || current == '<' || current == '"' || current == '\'') {
                parenStack.push(current);
            }
            if ((current == ')' || current == '}' || current == ']' || current == '>') || current == '"' || current == '\'') {
                if (parenStack.isEmpty()) {
                    return false;
                }
                char last = parenStack.peek();
                if (current == ')' && last == '(' || current == '}' && last == '{'
                        || current == ']' && last == '[' || current == '>' && last == '<' || current == '"' && last == '"'
                        || current == '\'' && last == '\'') {
                    parenStack.pop();
                }
            }
        }
        return parenStack.isEmpty();
    }
}