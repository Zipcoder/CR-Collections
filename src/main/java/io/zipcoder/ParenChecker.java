package io.zipcoder;

import java.util.Stack;

public class ParenChecker {

    private Stack<Character> myCharStack;
    private boolean abortMission = false;

    public ParenChecker() {
        myCharStack = new Stack<Character>();

    }

    public boolean checkForPairOfParens(String sampleString) {

        for (int i = 0; i < sampleString.length(); i++) {
            if (sampleString.charAt(i) == '(') {
                myCharStack.push(sampleString.charAt(i));
            }

            if (sampleString.charAt(i) == ')') {
                if (myCharStack.size() > 0) {
                    myCharStack.pop();
                } else {
                    return false;
                }

            }
        }

        return myCharStack.isEmpty();
    }

    public boolean checkForPairs(String sampleString) {

        for (int i = 0; i < sampleString.length(); i++) {
            char currentChar = sampleString.charAt(i);

            switch (currentChar) {
                case '(':
                    myCharStack.push(currentChar);
                    break;
                case ')':
                    popChar();
                    break;
                case '[':
                    myCharStack.push(currentChar);
                    break;
                case ']':
                    popChar();
                    break;
                case '{':
                    myCharStack.push(currentChar);
                    break;
                case '}':
                    popChar();
                    break;
                case '<':
                    myCharStack.push(currentChar);
                    break;
                case '>':
                    popChar();
                    break;
                case '"':
                    if (myCharStack.contains('"')){
                        popChar();
                    }
                    myCharStack.push(currentChar);
                    break;
                case '\'':
                    if (myCharStack.contains('\'')){
                        popChar();
                    }
                    myCharStack.push(currentChar);
                    break;
            }
            if(abortMission == true){
                return false;
            }

        }

        return myCharStack.isEmpty();

    }

    private void popChar() {
        if (myCharStack.size() > 0){
            myCharStack.pop();
        } else {
            abortMission = true;
        }
    }
}
