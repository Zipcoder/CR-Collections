package io.zipcoder;

import java.text.StringCharacterIterator;
import java.util.*;

public class ParenChecker {
    public String string;
    public Stack<String> parens;
    private Stack<Enclosers> enclosers;

    public ParenChecker(String entry){
        this.string = entry;
        this.parens = new Stack<String>();
        this.enclosers = new Stack<Enclosers>();
    }

    public boolean checkParen(){
        String[] tempArray = string.split("");
        for (String ch:tempArray){
            if (ch.equals("(")) parens.push(ch);
            if (ch.equals(")")){
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

    public boolean checkCharacters(){
        String[] tempArray = string.split("");
        ArrayList<Enclosers> enclosersList = new ArrayList<Enclosers>(Arrays.asList(Enclosers.values()));
        for (String ch:tempArray){
            for (Enclosers encloser:enclosersList) {
                if (ch.equals(encloser.getOpen())) enclosers.push(encloser);
            }
            if (enclosers.size() > 0){
                if (ch.equals(enclosers.peek().getClose())){
                    try {
                        enclosers.pop();
                    } catch (EmptyStackException exception){
                        return false;
                    }
                }
            }
        }
        if (enclosers.size() > 0) return false;
        return true;
    }

}
