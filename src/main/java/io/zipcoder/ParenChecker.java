package io.zipcoder;

import java.util.Stack;

public class ParenChecker {
    private Stack charStack;

    public ParenChecker() {
        this.charStack = new Stack<Character>();
    }

    public void add(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != 32) {
                charStack.add(input.charAt(i));
            }
        }
    }

    public String getCharString() {
        StringBuilder result = new StringBuilder();
        result.append(charStack);
        return result.toString();
    }

    public boolean isOpen() {
        boolean result = true;
        int openCount = 0;
        int quoteCount = 0;
        for (int i = 0; i < charStack.size(); i++) {
            char input = charStack.get(i).toString().charAt(0);
            switch (input) {
                case '(':
                    openCount++;
                    break;
                case ')':
                    openCount--;
                    break;
                case '{':
                    openCount++;
                    break;
                case '}':
                    openCount--;
                    break;
                case '[':
                    openCount++;
                    break;
                case ']':
                    openCount--;
                    break;
                case '<':
                    openCount++;
                    break;
                case '>':
                    openCount--;
                    break;
                case 34:
                    if (quoteCount == 1) {
                        openCount--;
                        quoteCount--;
                        break;
                    }
                    openCount++;
                    quoteCount++;
                    break;
                case 39:
                    if (quoteCount == 1) {
                        openCount--;
                        quoteCount--;
                        break;
                    }
                    openCount++;
                    quoteCount++;
                    break;
            }
        }
        if (openCount == 0) {
            result = false;
        }
        return result;
    }

}
