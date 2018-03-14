package io.zipcoder;

import java.util.Stack;

public class ParenChecker {

    private Stack charStack;

    ParenChecker(Stack charStack) {
        this.charStack = charStack;
    }

    public boolean logicChecker() {
        return (logic('(', ')')) &&
                logic('{', '}') &&
                logic('[', ']') &&
                logic('<', '>') &&
                quoteCounter('\"') &&
                quoteCounter('\'');
    }

    private boolean logic(char firstChar, char secondChar) {
        int parenCount = 0;
        for (Object aCharStack : charStack) {
            if (parenCount < 0) {
                return false;
            }
            if (aCharStack.equals(firstChar)) {
                parenCount++;
            }
            if (aCharStack.equals(secondChar)) {
                parenCount--;
            }
        }
        return parenCount == 0;
    }

    public boolean quoteCounter(char quote) {
        int quoteCount = 0;
        for (Object aCharStack : charStack) {
            if (aCharStack.equals(quote)) {
                quoteCount++;
            }
        }
        return quoteCount % 2 == 0;
    }

}
