package io.zipcoder;

import java.util.Stack;

public class ParenChecker {

    public static boolean parenthesesAreAllClosed(String stringToTest){
        Stack<Character> stackOfParentheses = new Stack<>();
        for(int i = 0; i < stringToTest.length(); i++){
            if(stringToTest.charAt(i) == '('){
                stackOfParentheses.push(stringToTest.charAt(i));
            }
            else if(stringToTest.charAt(i) == ')' && stackOfParentheses.contains('(')){
                stackOfParentheses.pop();
            }
            else if(stringToTest.charAt(i) == ')'){
                stackOfParentheses.push(stringToTest.charAt(i));
            }
        }

        return stackOfParentheses.isEmpty();
    }

}
