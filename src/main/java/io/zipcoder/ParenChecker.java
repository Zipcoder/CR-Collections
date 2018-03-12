package io.zipcoder;

import java.util.Stack;

public class ParenChecker {

    private Stack charStack;

    public ParenChecker(Stack charStack) {
        this.charStack = charStack;
    }

    public boolean logic() {
        int parenCount = 0;
        for (int i = 0; i < charStack.size(); i++) {
            if (parenCount < 0) {
                return false;
            }
            if (charStack.get(i).equals('(')) {
                parenCount++;
            }
            if (charStack.get(i).equals(')')) {
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
