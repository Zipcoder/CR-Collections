package io.zipcoder;


import java.util.HashMap;
import java.util.Stack;

public class ParenChecker{

    Stack<Character> parensStack = new Stack<Character>();
    HashMap<Character, Character> openClosingPairs = new HashMap<Character, Character>();

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
        openClosingPairs.put('(', ')');
        openClosingPairs.put('{', '}');
        openClosingPairs.put('[', ']');
        openClosingPairs.put('<', '>');
        openClosingPairs.put('"', '"');
        openClosingPairs.put('\'', '\'');

        for(int i = 0; i < input.length(); i++){
            char inputCharacter = input.charAt(i);

            if(openClosingPairs.containsKey(inputCharacter)){
                parensStack.push(inputCharacter);
            } else if (parensStack.isEmpty() || parensStack.peek() != openClosingPairs.get(inputCharacter)){
                return false;
            }
        }
        return parensStack.isEmpty();
    }
}
