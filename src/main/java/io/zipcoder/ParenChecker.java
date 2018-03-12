package io.zipcoder;

import java.util.Stack;

public class ParenChecker {

    private String sentence = "";

    static boolean isMatchingPair(char character1, char character2)
    {
        if (character1 == '(' && character2 == ')')
            return true;
        else if (character1 == '{' && character2 == '}')
            return true;
        else if (character1 == '[' && character2 == ']')
            return true;
        else if (character1 == '<' && character2 == '>'){
            return true;
        }
        else if (character1 == '\"' && character2 == '\"'){
            return true;
        }
        else if (character1 == '\'' && character2 == '\''){
            return true;
        }
        else
            return false;
    }

    public boolean parenChecker(String sentence){

        Stack<Character> stack = new Stack<>();
        char[] characters = sentence.toCharArray();
        for (int i = 0; i < characters.length; i++){
            if (characters[i] == '(' || characters[i] == '{' || characters[i] == '[' ||
                    characters[i] == '<' || characters[i] == '\"' || characters[i] == '\''){
                stack.push(characters[i]);
                continue;
            }
            if (characters[i] == ')' || characters[i] == '}' || characters[i] == ']' ||
                    characters[i] == '>' || characters[i] == '\"' || characters[i] == '\''){
                if (stack.isEmpty()){
                    return false;
                } else {
                    if (!isMatchingPair(stack.peek(), characters[i]))
                        return false;
                    else
                        stack.pop();
                }
            }
        }
        if (stack.isEmpty()){
            return true;
        }
        return false;
    }
}
