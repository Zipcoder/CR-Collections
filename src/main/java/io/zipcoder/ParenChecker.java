package io.zipcoder;

import java.util.Stack;

public class ParenChecker {

    public Stack<Character> stack = new Stack<Character>();

    public ParenChecker() {
    }

    public ParenChecker(Stack<Character> stack) {
        this.stack = stack;
    }

    public boolean checkParen(String str)
    {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++)
        {
            char current = str.charAt(i);
            if (current == '{' || current == '(' || current == '[' || current == '<' || current == '"' || current == '\'')
            {
                stack.push(current);
            }

            if (current == '}' || current == ')' || current == ']' || current == '>' || current == '"' || current == '\'')
            {
                if (stack.isEmpty())
                    return false;

                char last = stack.peek();
                if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[' || current == '>' && last == '<' || current == '"' && last == '"' || current == '\'' && last == '\'')
                    stack.pop();
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }

}
//    public boolean checkParen(String str) {
//        int opening = 0;
//        int closing = 0;
//        int total;
//        for (int i = 0; i < str.length(); i++) {
//            char current = str.charAt(i);
//            if (current == '(') {
//                opening++;
//            }
//            if (current == ')') {
//                closing++;
//            }
//            total = opening - closing;
//            if (total == 0) {
//                return true;
//            }
//        }
//        return false;
//    }