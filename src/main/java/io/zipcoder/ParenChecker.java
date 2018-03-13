package io.zipcoder;

//import java.util.HashMap;
//import java.util.Map;
import java.util.Stack;

public class ParenChecker {

    Stack<Character> parenStack = new Stack();

    //going to pass in the chars we are looking for contained within a String ''
    public boolean parenChecker(String string) {
        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == ')' && parenStack.empty()){
                break;
            }
            if (string.charAt(i) == '(') {
                parenStack.push(string.charAt(i));
            }
            if(string.charAt(i) ==')'){
                parenStack.pop();
            }
        }
        return parenStack.empty();
    }

    public boolean pairOfParenthesies(String string) {
        for (int i =0; i < string.length(); i++) {
            char currentCharacter = string.charAt(i);
            if (currentCharacter == '[' || currentCharacter == '"' || currentCharacter == '<' || currentCharacter == '\'' || currentCharacter == '{') {
                parenStack.push(currentCharacter);
            }
            if (currentCharacter == ']' || currentCharacter == '"' || currentCharacter == '>' || currentCharacter == '\'' || currentCharacter == '}' ) {
                if (parenStack.isEmpty()) {
                    return false;
                }
                // look at the object at the top of the stack but don't remove, PEEK
                char finalCharacter = parenStack.peek();
                if (currentCharacter == ']' && finalCharacter == '[' || currentCharacter == '"' && finalCharacter == '"' || currentCharacter == '<' && finalCharacter =='>' || currentCharacter == '\'' && finalCharacter == '\'' || currentCharacter == '}' && finalCharacter == '{') {
                    parenStack.pop();
                }
            }
        }
        return parenStack.isEmpty();
    }
}

    //check if characters are balanced//
//
//    private static boolean isBalanced(String str) {
//        Map<Character, Character> bracketPairs = new HashMap<Character,  Character>(){
//            {
//                put('(', ')');
//                put('{', '}');
//                put('[', ']');
//                put('<', '>');
//            }
//        };
//
//        //in order to be balanced, there ought to be an even number of chars
//        if(str.length() % 2 !=0) {
//            return false;
//        }
//        //stores opening braces in this case
//        Stack<Character> halfBraces = new Stack<>();
//
//        for(int i = 0; i < str.length(); i++) {
//            //if characters (bracket) is opening, then store into stack
//            if(bracketPairs.containsKey(str.charAt(i))){
//                halfBraces.push(str.charAt(i));
//            }
//
//            //if closing bracket is not equal to top of stack or if stack is empty, return false
//            else if(halfBraces.isEmpty() || bracketPairs.get(halfBraces.pop()) !=str.charAt(i)) {
//                return false;
//            }
//        }
//        return halfBraces.isEmpty() ? true : false;
//    }
//
//}


//    public static boolean checkParenthesies(String input) {
//        Stack<Character> stack = new Stack<Character>();
//        for (int i = 0; i < input.length(); i++) {
//            char c = input.charAt(i);
//            if (c == '[' || c == '(' || c == '{') {
//                stack.push(c);
//            }
//        }
//    }
