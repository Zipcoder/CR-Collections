package io.zipcoder;

import java.util.Stack;

public class ParenChecker {

    ParenChecker() {

    }

    public boolean parenPair(String string) {

        Stack stack = new Stack();

        for (int i = 0; i <string.length(); i++) {
            char character = string.charAt(i);
            if (stack.empty() && character == ')') {
                return false;
            }
            if (character == '(') {
                stack.push(character);
            }
            if (string.charAt(i) == ')' ) {
                stack.pop();
            }
        }
        return stack.isEmpty();

    }

    public boolean forEachOpeningAClosing(String string) {

        Stack stack = new Stack();

        for (int i = 0; i <string.length(); i++) {
            char character = string.charAt(i);

            if (stack.empty() && character == ')' || stack.empty() && character == '}' || stack.empty() && character
                    == ']' || stack.empty() && character == '>' ) {
                return false;
            }
            if (character == '(' || character == '{' || character == '[' || character == '<' || character == '\'' ||
                    character == '"') {
                stack.push(character);
            }
            if (character == ')' || character == '}' || character == ']' || character == '>' ||
                    character == '\'' || character == '"') {
                stack.pop();
            }
        }
        return stack.isEmpty();


    }



}
