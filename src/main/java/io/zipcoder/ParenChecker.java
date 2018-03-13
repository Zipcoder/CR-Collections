package io.zipcoder;

import java.util.Stack;

public class ParenChecker {
    public String string;
    public Stack<String> parens;

    public ParenChecker(String entry){
        this.string = entry;
        this.parens = new Stack<String>();
    }

    public boolean checkParen(){
        for (String letter:string.split("")) {
            if (letter.equals("(")){
                parens.push(letter);
            }
            if (letter.equals(")")){
                try {
                    parens.pop();
                } catch (Exception exception){
                    return false;
                }
            }
        }
        if (parens.size() > 0) return false;
        return true;
    }

    /**push opener
     * iterate, peek
     * it it isn't the corresponding close character, move to next
     * if it IS, pop
     * if your stack at the end is > 0, return false
     * fallout return true
     */

//    public boolean checkCharacters(){
//        for (String letter:string.split("")) {
//            if (letter.equals("(") || letter.equals("{") || letter.equals("[") || letter.equals("<")){
//                openParen.push(letter);
//            }
//            if (letter.equals("{")) openBracket.push(letter);
//            if (letter.equals(")") || letter.equals("}") || letter.equals("]") || letter.equals(">")){
//                closeParen.push(letter);
//                if (openParen.size()<closeParen.size()) return false;
//            }
//            if (letter.equals("\"") || letter.equals("'")){
//                quotes.push(letter);
//            }
//        }
//        if (openParen.size() != closeParen.size()) return false;
//        if (quotes.size() % 2 == 1) return false;
//        return true;
//    }

}
