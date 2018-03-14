package io.zipcoder;

import java.util.ArrayList;
import java.util.Stack;

public class ParenChecker {
    public ParenChecker(){
    }

    public boolean braceChecker(String str) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            char openCharacter = str.charAt(i);
            if (openCharacter == '[' || openCharacter == '(' || openCharacter == '{' || openCharacter == '<' || openCharacter == '"') {
                stack.push(openCharacter);
            } else if (openCharacter == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            } else if (openCharacter == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            } else if (openCharacter == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            } else if (openCharacter == '>') {
                if (stack.isEmpty() || stack.pop() != '<') {
                    return false;
                }
            } else if (openCharacter == '"') {
                if (stack.isEmpty() || stack.pop() != '"') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
