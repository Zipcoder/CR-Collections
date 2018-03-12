package io.zipcoder;

import java.util.Stack;

public class ParenChecker {

    private Stack charStack;

    public ParenChecker(Stack charStack) {
        this.charStack = charStack;
    }

    public boolean logicChecker() {
        if ((logic('(', ')')) &&
                logic('{', '}') &&
                logic('[', ']') &&
                logic('<', '>') &&
                logic('"', '"') &&
                logic('\'', '\'')) {
            return true;
        }
        return false;
    }

    public boolean logic(char firstChar, char secondChar) {
        int parenCount = 0;
        for (int i = 0; i < charStack.size(); i++) {
            if (parenCount < 0) {
                return false;
            }
            if (charStack.get(i).equals(firstChar)) {
                parenCount++;
            }
            if (charStack.get(i).equals(secondChar)) {
                parenCount--;
            }
        }
        if (parenCount != 0) {
            return false;
        } else {
            return true;
        }
    }

}
