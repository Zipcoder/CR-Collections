package io.zipcoder;

import java.util.Stack;

public class ParenChecker {
    public String string;
    public Stack<String> openParen;
    public Stack<String> closeParen;

    public ParenChecker(String entry){
        this.string = entry;
        this.openParen = new Stack<String>();
        this.closeParen = new Stack<String>();
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

}
