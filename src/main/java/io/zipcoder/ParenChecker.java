package io.zipcoder;


import java.util.Stack;

public class ParenChecker{

    Stack<Character> parensStack = new Stack<Character>();

    public boolean verifyParensArePaired(String input){
       for(int i = 0; i < input.length(); i++){
           char inputCharacter = input.charAt(i);
           if (inputCharacter == '('){
               parensStack.push(inputCharacter);
           }else if (inputCharacter == ')' &&  parensStack.isEmpty() || parensStack.peek() != '('){
               return false;
           } else if (inputCharacter == ')' && parensStack.peek() == '('){
            parensStack.pop();
        }
       }
        return parensStack.isEmpty();
    }

    public boolean verifyOpeningCharactersHaveAClosingOne(String input){
        return false;
    }
}
