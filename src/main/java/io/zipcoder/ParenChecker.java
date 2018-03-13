package io.zipcoder;

import java.util.Stack;

public class ParenChecker {

    public boolean arePaired(String string) {
        if(string.isEmpty()) {
            return true;
        }

        Stack<Character> newStack = new Stack<>();

        for(int i = 0; i < string.length(); i++) {
            char current = string.charAt(i);

            if(current == '(' ||
                    current == '{' ||
                    current == '[' ||
                    current == '<' ||
                    current == '\''||
                    current == '\"') {
                newStack.push(current);
            }

            if(current == ')' ||
                    current == '}' ||
                    current == ']' ||
                    current == '>' ||
                    current == '\''||
                    current == '\"') {

                if(newStack.isEmpty()) {
                    return false;
                }

                char last = newStack.peek();
                if((current == ')' && last == '(') ||
                        (current == '}' && last == '{') ||
                        (current == ']' && last == '[') ||
                        (current == '>' && last == '<') ||
                        (current == '\'' && last == '\'')||
                        (current == '\"' && last == '\"')
                        ) {
                    newStack.pop();
                    return true;
                }
            }
        }
        return newStack.isEmpty();
    }
}
