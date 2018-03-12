package io.zipcoder;

import java.util.EnumSet;
import java.util.Stack;

public class ParenChecker {

    public Stack<String> punctuationPairs;
    EnumSet<SpecialCharactersEnum> pairs = EnumSet.allOf(SpecialCharactersEnum.class);

    ParenChecker(){
        this.punctuationPairs = new Stack<String>();
    }

    ParenChecker(Stack<String> punctuationPairs){
        this.punctuationPairs = punctuationPairs;
    }

    public Stack getPunctuationPairs() {
        return punctuationPairs;
    }

    public EnumSet<SpecialCharactersEnum> getPairs() {
        return pairs;
    }

    public boolean parenCheck(){
        boolean paired = false;
        int begin = punctuationPairs.search(SpecialCharactersEnum.PARENTHESIS.getBeginChar());
        int end = punctuationPairs.search(SpecialCharactersEnum.PARENTHESIS.getEndChar());
        if(end<begin && begin>0 && end>0) paired = true;
        return paired;
    }

    public boolean surround(){
        boolean paired = false;
        for(SpecialCharactersEnum character: pairs) {
            int begin = punctuationPairs.search(character.getBeginChar());
            int end = punctuationPairs.search(character.getEndChar());
            if(end<begin && begin>0 && end>0) paired = true;
        }
        return paired;
    }



}
