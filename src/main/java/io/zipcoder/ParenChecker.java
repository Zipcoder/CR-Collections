package io.zipcoder;

import java.text.StringCharacterIterator;
import java.util.*;

public class ParenChecker {
    public String string;
    public Stack<String> parens;
    private Stack<Enclosers> enclosers;
    private Stack<String> quotes;
    private Stack<String> doublequotes;

    public ParenChecker(String entry){
        this.string = entry;
        this.parens = new Stack<String>();
        this.enclosers = new Stack<Enclosers>();
        this.quotes = new Stack<String>();
        this.doublequotes = new Stack<String>();
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
        ArrayList<String> openerList = new ArrayList<String>();
        ArrayList<String> closerList = new ArrayList<String>();
        for (Enclosers encloser:enclosersList) {
            openerList.add(encloser.getOpen());
            closerList.add(encloser.getClose());
        }
        for (String ch:tempArray){
            for (Enclosers encloser:enclosersList) {
                if (ch.equals(encloser.getOpen())) enclosers.push(encloser);
            }
            if (closerList.contains(ch)){
                try {
                    if (ch.equals(enclosers.peek().getClose())) enclosers.pop();
                    else return false;
                } catch (EmptyStackException exception) {
                    return false;
                }
            }
            if (ch.equals("'")){
                if (quotes.size() == 1) {
                    quotes.pop();
                } else if (quotes.size() == 0){
                    quotes.push(ch);
                }
            }
            if (ch.equals("\'")){
                if (doublequotes.size() == 1) {
                    doublequotes.pop();
                } else if (doublequotes.size() == 0){
                    doublequotes.push(ch);
                }
            }
        }
        if (enclosers.size() > 0) return false;
        if (quotes.size() > 0) return false;
        if (doublequotes.size() > 0) return false;
        return true;
    }

}
