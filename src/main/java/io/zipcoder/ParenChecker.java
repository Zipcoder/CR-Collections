package io.zipcoder;

import java.util.ArrayList;
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
        ArrayList<Integer> beginChar = new ArrayList<>();
        ArrayList<Integer> endChar = new ArrayList<>();
        for(SpecialCharactersEnum character: pairs) {
            Integer begin = punctuationPairs.search(character.getBeginChar());
            if(begin >= 0) beginChar.add(begin);
            Integer end = punctuationPairs.search(character.getEndChar());
            if(end >= 0) endChar.add(end);
        }
            if (beginChar.size() != endChar.size()) {
                paired = false;
            } else if(beginChar.size() == (endChar.size())) {
                for (int i = 0; i < beginChar.size(); i++) {
                    if (endChar.get(i) > beginChar.get(i)) {
                        paired = false;
                    } else if (endChar.get(i) < beginChar.get(i)) {
                        paired = true;
                    }
                }
            }
        return paired;
    }

}
