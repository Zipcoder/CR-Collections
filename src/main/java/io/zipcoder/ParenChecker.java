package io.zipcoder;
import java.util.Stack;

public class ParenChecker {

    Stack<Character> stack = new Stack<>();

    public boolean parenCheck(String string) {
        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);

            if (stack.isEmpty() && character == ')') {
                return false;
            } else if (character == '(') {
                stack.push(character);
            }
            char last = stack.peek(); // last element added
                if (character == ')' && last == '(') {
                    stack.pop();
                }
        }
        return stack.isEmpty(); // when returning stack isEmpty it is true
    }

    public boolean isPair(String string) {
        for (int i = 0; i < string.length(); i++) {
            char current = string.charAt(i);
            if (current == '(' ||
                    current == '{' ||
                    current == '<' ||
                    current == '[' ||
                    current == '\'' ||
                    current == '\"') {
                stack.push(current); // adding left of parentheses to stack
            }
            char last = stack.peek();
            if (current == ')' && last == '(' ||
                    current == '}' && last == '{' ||
                    current == '>' && last == '<' ||
                    current == ']' && last == '[' ||
                    current == '\'' && last == '\'' ||
                    current == '\"' && last == '\"') { // if contains right, delete it
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

}



