package io.zipcoder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class ParenChecker {

    public static boolean parenthesesAreAllClosed(String stringToTest){
        Stack<Character> stackOfParentheses = new Stack<>();
        for(int i = 0; i < stringToTest.length(); i++){
            Character currentChar = stringToTest.charAt(i);
            if(currentChar == '('){
                stackOfParentheses.push(currentChar);
            }
            else if(currentChar == ')' && stackOfParentheses.contains('(')){
                stackOfParentheses.pop();
            }
            else if(currentChar == ')'){
                stackOfParentheses.push(currentChar);
            }
        }
        return stackOfParentheses.isEmpty();
    }

    public static boolean allCharactersAreClosed(String stringToTest){
        HashMap<Character,Character> openerMap = buildOpenerMap();
        HashMap<Character,Character> closerMap = buildCloserMap();
        ArrayList<Character> seenCharacters = new ArrayList<>();


        for(int i = 0; i < stringToTest.length(); i++){
            Character currentChar = stringToTest.charAt(i);

            if(openerMap.containsValue(currentChar) && seenCharacters.contains(closerMap.get(currentChar))){
                seenCharacters.remove(closerMap.get(currentChar));
            }
            else if(openerMap.containsKey(currentChar)){
                seenCharacters.add(currentChar);
            }
            else if(closerMap.containsKey(currentChar)){
                seenCharacters.add(currentChar);
            }
        }
        for(Character c : seenCharacters){
            System.out.println(c);
        }

        return seenCharacters.isEmpty();
    }

    private static HashMap<Character,Character> buildOpenerMap(){
        HashMap<Character,Character> characterMap = new HashMap<>();
        characterMap.put('(',')');
        characterMap.put('[',']');
        characterMap.put('<','>');
        characterMap.put('{','}');
        characterMap.put('"','"');
        characterMap.put('\'','\'');
        return characterMap;
    }

    private static HashMap<Character,Character> buildCloserMap(){
        HashMap<Character,Character> characterMap = new HashMap<>();
        characterMap.put(')','(');
        characterMap.put(']','[');
        characterMap.put('>','<');
        characterMap.put('}','{');
        characterMap.put('"','"');
        characterMap.put('\'','\'');
        return characterMap;
    }



}
