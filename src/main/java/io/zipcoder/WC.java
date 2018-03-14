package io.zipcoder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

/**
@TODO
*@1.)Create a parenthesis verifier method, that has one job(check if all parenthesis are ('paired')
* @2.)Create a method that checks all opening characters have a closing one
* - These Characters () {} [] <> "" ''
* This program should be able to:
 * 1 - count all the words in a file
 * 2 - Print out all the words
 * 3 - Print the word counts in descending order
 */

public class WC {
    private Iterator<String> si;

    public WC(String fileName) {
        try {
            this.si = new Scanner(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println(fileName + " Does Not Exist");
            System.exit(-1);
        }
    }

    public WC(Iterator<String> si) {
        this.si = si;
    }
}

//    private static boolean isPaired(String str) {
//        /*stores braces*/
//        Map<Character, Character> bracketPairs = new HashMap<Character, Character>(){{
//                put('(', ')');
//                put('{', '}');
//                put('[', ']');
//                put('<', '>');
//                put('"', '"');
//        }
//    };
//
//        if(str.length() % 2 != 0) { //a pair will donate a balance of at least 2 characters/braces
//            return false;
//        }
//
//            Stack<Character> openBrace = new Stack<>(); //store the open brace
//            for(int i = 0; i < str.length(); i++){
//            if(bracketPairs.containsKey(str.charAt(i))){ //if the character is open,
//                openBrace.push(str.charAt(i)); // store it into the stack
//            }
//            else if(openBrace.isEmpty() || bracketPairs.get(openBrace.pop()) != str.charAt(i)){ //if the closing character doesnt match the top of the stack or is empty, return false
//                return false;
//            }
//        }
//        return openBrace.isEmpty() ? true : false;
//    }
