package io.zipcoder;

import java.util.Stack;

public class  ParenChecker {

    Stack<Character> parensStack = new Stack<Character>();

    public boolean verifyOpeningCharactersHaveAClosingOne(String input) {
        String changedInput = input.replaceAll("[\\(\\{\\[\\<]","(");
        changedInput = changedInput.replaceAll("[\\)\\}\\]\\>]", ")");
        changedInput = changedInput.replaceAll("[\\\"\\']", "^");
        for (int i = 0; i < input.length(); i++) {
            char inputCharacter = changedInput.charAt(i);
            if (! parensStack.isEmpty() && ((inputCharacter == ')' || inputCharacter == '^') && (parensStack.peek() == '(' || parensStack.peek() == '^'))) {
                parensStack.pop();
            }
            else if (inputCharacter == '(' ||  inputCharacter == '^') {
                parensStack.push(inputCharacter);
            } else if (inputCharacter == ')' || parensStack.peek() != '(') {
                return false;
            }
        }
        return parensStack.isEmpty();

        }
    }

