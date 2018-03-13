package io.zipcoder;

import java.util.Stack;

public class ParenChecker {
    public String string;
    public Stack<String> openParen;
    public Stack<String> closeParen;
    public Stack<String> quotes;

    public ParenChecker(String entry){
        this.string = entry;
        this.openParen = new Stack<String>();
        this.closeParen = new Stack<String>();
        this.quotes = new Stack<String>();
    }

    public boolean checkParen(){
        for (String letter:string.split("")) {
            if (letter.equals("(")){
                openParen.push(letter);
            }
            if (letter.equals(")")){
                closeParen.push(letter);
                if (openParen.size()<closeParen.size()) return false;
            }
        }
        if (openParen.size() != closeParen.size()) return false;
        return true;
    }

    public boolean checkCharacters(){
        for (String letter:string.split("")) {
            if (letter.equals("(") || letter.equals("{") || letter.equals("[") || letter.equals("<")){
                openParen.push(letter);
            }
            if (letter.equals(")") || letter.equals("}") || letter.equals("]") || letter.equals(">")){
                closeParen.push(letter);
                if (openParen.size()<closeParen.size()) return false;
            }
            if (letter.equals("\"") || letter.equals("'")){
                quotes.push(letter);
            }
        }
        if (openParen.size() != closeParen.size()) return false;
        if (quotes.size() % 2 == 1) return false;
        return true;
    }

}
