package io.zipcoder;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.Stack;

public class ParenChecker {
    private Stack<Character> stackOfChars = new Stack();

    public boolean parenChecker(String inputString) {
        char[] arrayAsChar = inputString.toCharArray();
        for (int i = 0; i < arrayAsChar.length; i++) {
            characterChecker(arrayAsChar[i]);
        }

        if (stackOfChars.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    private void characterChecker(char inputChar) {
        switch (inputChar) {
            case '(':
                stackOfChars.push(inputChar);
                break;
            case '{':
                stackOfChars.push(inputChar);
                break;
            case '[':
                stackOfChars.push(inputChar);
                break;
            case '<':
                stackOfChars.push(inputChar);
                break;
            case ')':
                if (!stackOfChars.empty()) {
                    if (stackOfChars.peek().equals('(')) {
                        stackOfChars.pop();
                    } else {
                        stackOfChars.push(inputChar);
                    }
                } else {
                    stackOfChars.push(inputChar);
                }
                break;
            case '}':
                if (!stackOfChars.empty()) {
                    if (stackOfChars.peek().equals('{')) {
                        stackOfChars.pop();
                    } else {
                        stackOfChars.push(inputChar);
                    }
                } else {
                    stackOfChars.push(inputChar);
                }
                break;
            case ']':
                if (!stackOfChars.empty()) {
                    if (stackOfChars.peek().equals('[')) {
                        stackOfChars.pop();
                    } else {
                        stackOfChars.push(inputChar);
                    }
                } else {
                    stackOfChars.push(inputChar);
                }
                break;
            case '>':
                if (!stackOfChars.empty()) {
                    if (stackOfChars.peek().equals('<')) {
                        stackOfChars.pop();
                    } else {
                        stackOfChars.push(inputChar);
                    }
                } else {
                    stackOfChars.push(inputChar);
                }
                break;
            case '\"':
                if (!stackOfChars.empty()) {
                    if (stackOfChars.peek().equals('\"')) {
                        stackOfChars.pop();
                    } else {
                        stackOfChars.push(inputChar);
                    }
                } else {
                    stackOfChars.push(inputChar);
                }
                break;
            case '\'':
                if (!stackOfChars.empty()) {
                    if (stackOfChars.peek().equals('\'')) {
                        stackOfChars.pop();
                    } else {
                        stackOfChars.push(inputChar);
                    }
                } else {
                    stackOfChars.push(inputChar);
                }
                break;
        }
    }
}
