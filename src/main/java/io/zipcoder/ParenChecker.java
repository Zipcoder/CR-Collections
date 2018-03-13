package io.zipcoder;

import java.util.Stack;

public class ParenChecker {

    private Stack<Character> characterStack;

    public ParenChecker() {
        characterStack = new Stack<Character>();
    }

    public boolean verifyClosingParens(String someText) {

        for (int i = 0; i < someText.length(); i++) {
            if (someText.charAt(i) == '(') {
                characterStack.push(someText.charAt(i));
            }
            if (someText.charAt(i) == ')') {
                if (characterStack.size() > 0) {
                    characterStack.pop();
                } else {
                    return false;
                }
            }
        }
        return characterStack.isEmpty();
    }

    public boolean verifyAllClosingTypes(String someText) {

        for (int i = 0; i < someText.length(); i++) {
            char current = someText.charAt(i);

            if (current == '(' || current == '{' || current == '[' || current == '<') {
                characterStack.push(current);
            }

            if (current == ')' || current == '}' || current == ']' || current == '>' || current == '"' || current == '\'') {

                switch (current) {
                    case ')':
                        if (characterStack.peek().equals('(')) {
                            characterStack.pop();
                        }
                        break;

                    case '}':
                        if (characterStack.peek().equals('{')) {
                            characterStack.pop();
                        }
                        break;

                    case ']':
                        if (characterStack.peek().equals('[')) {
                            characterStack.pop();
                        }
                        break;

                    case '>':
                        if (characterStack.peek().equals('<')) {
                            characterStack.pop();
                        }
                        break;

                    case '"':
                        if (characterStack.peek().equals('"')) {
                            characterStack.pop();
                        } else {
                            characterStack.push(current);
                        }
                        break;

                    case '\'':
                        if (characterStack.peek().equals('\'')) {
                            characterStack.pop();
                        } else {
                            characterStack.push(current);
                        }
                        break;

                    default:
                        return false;
                }
            }
        }
        return characterStack.isEmpty();
    }


}
