package io.zipcoder;

import java.util.Stack;

public class ParenChecker {
    Stack<Character> stack = new Stack();

    public boolean parenCheck(String string) {

        for(int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);
            //check if the stack is empty and the character is closing parenthesis (THIS IS BOUNDS)
            if (stack.isEmpty() && character == ')') {
                return false;
                //if opening parenthesis add it to the stack
            } else if (character == '(') {
                stack.push(character);
            }
            //when you get a closing parenthesis, then remove the opening that matches
            char last = stack.peek();
            if (character == ')' && last =='(') {
                stack.pop();
            }
        }
        //if stack is empty then its true;
        return stack.isEmpty();
    }

    public boolean openingHasClosing(String string) {
        for (int i = 0; i < string.length(); i++) {
            char current = string.charAt(i);
            //check if the stack is empty and the character is closing parenthesis (THIS IS BOUNDS)

            //if opening parenthesis add it to the stack
            if (current == '(' || current == '{'
                    || current == '[' || current == '<' || current == '"' || current == '\'') {
                stack.push(current);
            }
            if ((current == ')' || current == '}' || current == ']' || current == '>') || current == '"' || current == '\'') {
                if (stack.isEmpty()) {
                    return false;
                }
                //when you get a closing parenthesis, then remove the opening that matches
                char last = stack.peek();
                if (current == ')' && last == '(' || current == '}' && last == '{'
                        || current == ']' && last == '[' || current == '>' && last == '<' || current == '"' && last == '"'
                        || current == '\'' && last == '\'') {
                    stack.pop();
                }
            }
        }
        //if stack is empty then its true;
        return stack.isEmpty();
    }
}
