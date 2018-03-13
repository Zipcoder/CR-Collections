package io.zipcoder;

import java.util.Stack;

public class ParenChecker {

    Stack<Character> checker = new Stack();

    public boolean parenCheck(String check) {

        for (int i = 0; i < check.length(); i++) {
            if (check.charAt(i) == ')' && checker.isEmpty())
                return false;
            if (check.charAt(i) == '(') {
                checker.push(check.charAt(i));
            }
            if (check.charAt(i) == ')' ) {
                checker.pop();
            }
        }
        return checker.isEmpty();
    }

    public boolean allCheck(String check) {
//        Pair input = new Pair('&', '&');

        for (int i = 0; i < check.length(); i++) {
            char current = check.charAt(i);
//                if(check.charAt(i) == input.getOpen())
//                    checker.push(check.charAt(i));
//                char top = checker.peek();
//                if(check.charAt(i) == input.getClose(top) && top == input.getOpen()) {
//                    checker.pop();
//            }



            if ((current == ')' || current == '}' || current == ']' || current == '>') && checker.isEmpty()) {
                return false;
            }
            if (current == '(' || current == '{' || current == '[' ||
                    current == '<' || current == '\'' || current == '"') {
                checker.push(current);
            }
            char top = checker.peek();
            if (current == ')' && top == '(' || current == '}' && top == '{' ||
                    current == ']' && top == '[' || current == '>' && top == '<' ||
                    current == '\'' && top == '\'' || current == '"' && top == '"') {
                checker.pop();
            }
      }
        return checker.isEmpty();
    }

}







