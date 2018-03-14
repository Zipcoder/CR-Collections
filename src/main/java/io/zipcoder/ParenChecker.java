package io.zipcoder;

import java.util.Stack;

public class ParenChecker {


    Stack<Character> stackOfParentheses = new Stack();

    // Part 1 - gonna pass in the chars we are looking for contained within a string ' '
    public boolean checkParentheses(String string) {

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ')' && stackOfParentheses.empty()) {
                break;
            }
            if (string.charAt(i) == '(') {
                stackOfParentheses.push(string.charAt(i));  // push - element on top of stack
            }
            if (string.charAt(i) == ')') {
                stackOfParentheses.pop();   // pop - removes & returns the top element of stack
            }
        }
        return stackOfParentheses.empty();  // true if nothing is on top of stack
    }


    // Part 2
    public boolean openAndClosedCharacters(String string) {

        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);

            // checking opening characters
            if (currentChar == '(' || currentChar == '{'
                    || currentChar == '[' || currentChar == '<'
                    || currentChar == '"' || currentChar == '\'') {
                stackOfParentheses.push(currentChar);
            }
            // checking closing characters
            if (currentChar == ')' || currentChar == '}'
                    || currentChar == ']' || currentChar == '>'
                    || currentChar == '"' || currentChar == '\'') {

                if (stackOfParentheses.isEmpty()) {
                    return false;
                }
                    // checking both opening and closing characters
                char lastChar = stackOfParentheses.peek(); // peek- returns element on top of stack w/o removing it
                if (currentChar == ')' && lastChar == '('
                        || currentChar == '}' && lastChar == '{'
                        || currentChar == ']' && lastChar == '['
                        || currentChar == '>' && lastChar == '<'
                        || currentChar == '"' && lastChar == '"'
                        || currentChar == '\'' && lastChar == '\'') {
                    stackOfParentheses.pop();
                }
            }
        }

        return stackOfParentheses.isEmpty();
    }
}


/*
TC-Collections

        Paren Checker

        Part 1:
        Create a class with a method that verifies all parens () are paired.
        - HINT: Use a stack.
        - Boolean
        -

        Part 2:
        Now create a method that checks that all opening characters have a closing one.

        Characters include () {} [] <> "" ''

        - Boolean

*/