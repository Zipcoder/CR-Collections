package io.zipcoder;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ParenChecker {
    //Create a class with a method that verifies all parens () are paired. HINT: Use a stack.
    private Stack theStack;
    private char charAt;


    public ParenChecker() {
        this.theStack = new Stack();
    }

    public boolean verifyParens(String theString) {
        // char[] theChar = theString.toCharArray();
        char parOpen = '(';
        char parClosed = ')';
        for (int i = 0; i < theString.length(); i++) {
            charAt = theString.charAt(i);
            if (theStack.contains(parOpen) && charAt == parClosed) {
                theStack.pop();
            } else if (charAt == parOpen || charAt == parClosed) {
                theStack.push(charAt);
            }
        }

        return theStack.empty();
    }


    public boolean verifyAllOpensHaveEnds(String theString) {
        boolean allOpensHavePairs = false;
        theStack.clear();
        Map<Character, Character> bracketPairs = new HashMap<Character, Character>();
        bracketPairs.put('(', ')');
        bracketPairs.put('{', '}');
        bracketPairs.put('[', ']');
        bracketPairs.put('<', '>');
        bracketPairs.put('"', '"');
        bracketPairs.put('\'', '\'');

        for (int i = 0; i < theString.length(); i++) {
            char theChar = theString.charAt(i);
            if (bracketPairs.containsKey(theChar)) {
                theStack.push(theChar);
            }

            //how to account all things in between the open brackets.
            //theStackisempty;

            else if (bracketPairs.get(theStack.peek()) == theChar){
                theStack.pop();
            }
        }
        return theStack.isEmpty();
    }
}


