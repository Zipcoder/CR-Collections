package io.zipcoder;

import java.util.Stack;

public class ParenChecker {

    public static boolean parenChecker(String aString){
        Stack myStack = new Stack();
        for(int i=0;i<aString.length();i++){
            if(aString.charAt(i)=='('){
               myStack.add(aString.charAt(i));
            }else if(!(myStack.isEmpty()) && aString.charAt(i)==')'){
                myStack.pop();
            }
        }
        return myStack.isEmpty();
    }




}
