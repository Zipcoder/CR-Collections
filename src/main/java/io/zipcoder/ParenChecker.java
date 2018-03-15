package io.zipcoder;


import java.util.Stack;

//1.Create a class with a method that verifies all parens () are paired. HINT: Use a stack.
public class ParenChecker {

    Stack<Character> stack = new Stack<Character>();

    public ParenChecker() {

    }

    public boolean parenChecker(String value) {

        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }

        }
        return stack.isEmpty();
    }


    public boolean pairParen(String value) {
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if (c == '(' || c == '[' || c == '<' || c == '{' || c == '\'' || c == '\"') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '>' || c == '}' || c == '\'' || c == '\"') {
                if (stack.isEmpty()) {
                    return false;
                }
                char lastValue = stack.peek();
                if (c == ')' && lastValue == '(' || c == '>' && lastValue == '<' || c == '"' && lastValue == '"' || c == '\'' && lastValue == '\'') {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}

//PseudoCode
//the lastValue equals the stack.peek(); the peek: Looks at the object at the top of this stack without removing it
//from the stack.

