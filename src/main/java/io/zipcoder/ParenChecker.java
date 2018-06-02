package io.zipcoder;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Stack;

public class ParenChecker {

    public Stack<String> punctuationPairs;
    EnumSet<SpecialCharactersEnum> pairs = EnumSet.allOf(SpecialCharactersEnum.class);


    ParenChecker(){
        this.punctuationPairs = new Stack<>();
    }

    ParenChecker(Stack<String> punctuationPairs){
        this.punctuationPairs = punctuationPairs;
    }

    public Stack getPunctuationPairs() {
        return punctuationPairs;
    }

    public boolean parenCheck(){

        boolean paired = false;
        int begin = punctuationPairs.search(SpecialCharactersEnum.PARENTHESIS.getBeginChar());
        int end = punctuationPairs.search(SpecialCharactersEnum.PARENTHESIS.getEndChar());
        if(end<begin && begin>0 && end>0) paired = true;
        return paired;
    }

    public boolean surround() {
        boolean paired = true;
        ArrayList<Integer> beginChar = new ArrayList<>();
        ArrayList<Integer> endChar = new ArrayList<>();
        for (SpecialCharactersEnum character : pairs) {
            Integer begin = punctuationPairs.indexOf(character.getBeginChar());
            Integer end = punctuationPairs.indexOf(character.getEndChar());
            while (begin >= 0) {
                beginChar.add(begin);
                begin = punctuationPairs.indexOf(character.getBeginChar(), begin + 1);
            }
            while (end >= 0) {
                endChar.add(end);
                end = punctuationPairs.indexOf(character.getEndChar(), end + 1);
            }
            if (endChar.size() == 0 || beginChar.size()==0) {
                return false;
            }
            if (endChar.size() > 0 && beginChar.size()>0) {
                if (endChar.get(endChar.size() - 1) < beginChar.get(endChar.size() - 1)) {
                    paired = false;
                } else {
                    paired = true;
                }
                if (beginChar.size() != endChar.size()) {
                    paired = false;
                }
            }
        }
        return paired;
    }
}
