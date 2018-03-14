package io.zipcoder;

import java.util.*;

public class ParenChecker {

    /**
     * Create a class with a method that verifies all parens () are paired.
     * HINT: Use a stack.
     **/
    public boolean isPaired(String input) {
       return hasPair(input, '(', ')');
    }


    /**
     * Create a method that checks that all opening characters have a closing one.
     * Characters include () {} [] <> "" ''
     **/
    public boolean hasClosing(String input) {
        return(hasPair(input, '(', ')')
                && hasPair(input, '{', '}')
                && hasPair(input, '[', ']')
                && hasPair(input, '<', '>')
                && hasPair(input, '\"', '\"')
                && hasPair(input, '\'', '\''));
    }


    public boolean hasPair(String input, Character openingChar, Character closingChar) {
        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // if currentChar is opening, add to stack
            if (currentChar == openingChar) {
                stack.push(currentChar);
                continue;
            }
            // if currentChar is closing but there's no opening in stack, return false
            if (currentChar == closingChar) {
                if(stack.isEmpty()) {
                    return false;
                } else if(stack.peek() == openingChar) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        // if stack is empty then all parentheses were paired
        return stack.empty() || (stack.size() % 2 == 0);
    }
}
