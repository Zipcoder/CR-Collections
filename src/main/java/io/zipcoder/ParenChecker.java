package io.zipcoder;

import java.util.Stack;

public class ParenChecker {

    public static boolean parenChecker(String aString){
        Stack<Character> myStack = new Stack();
        for(int i=0;i<aString.length();i++){
            if(aString.charAt(i)=='('){
               myStack.push(aString.charAt(i));
            }else if(!(myStack.isEmpty()) && aString.charAt(i)==')'){
                myStack.pop();
            }
        }
        return myStack.isEmpty();
    }

    public static boolean checkMatchingCharacters(String aString) {

        Stack<Character> myStack = new Stack();
        for (int i = 0; i < aString.length(); i++) {
            if (aString.charAt(i) == '(' || aString.charAt(i) == '{' || aString.charAt(i) == '[' || aString.charAt(i) == '<'
                    || aString.charAt(i) == '"' || aString.charAt(i) == '\'') {
                myStack.push(aString.charAt(i));
            }
            if ((aString.charAt(i) == ')' || aString.charAt(i) == '}' || aString.charAt(i) == ']' || aString.charAt(i) == '>')
                    &&myStack.isEmpty()) {
                    return false;
                }
                 if (aString.charAt(i) == ')' && myStack.peek() == '(' || aString.charAt(i) == '}' && myStack.peek() == '{' ||
                        aString.charAt(i) == ']' && myStack.peek() == '[' || aString.charAt(i) == '>' && myStack.peek() == '<' ||
                        aString.charAt(i) == '"' && myStack.peek() == '"' || aString.charAt(i) == '\'' && myStack.peek() == '\'') {

                    myStack.pop();
                }


            }
        return myStack.isEmpty();
    }

}
