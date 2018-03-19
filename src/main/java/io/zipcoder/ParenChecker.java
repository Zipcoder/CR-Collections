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

    public boolean surround(){
        boolean paired = true;
        ArrayList<Integer> beginChar = new ArrayList<>();
        ArrayList<Integer> endChar = new ArrayList<>();
        for(SpecialCharactersEnum character: pairs) {
            Integer begin = punctuationPairs.indexOf(character.getBeginChar());
            Integer end = punctuationPairs.indexOf(character.getEndChar());
            while(begin >= 0) {
                beginChar.add(begin);
                begin = punctuationPairs.indexOf(character.getBeginChar(), begin+1);
            }
            while(end >= 0) {
                endChar.add(end);
                end = punctuationPairs.indexOf(character.getEndChar(), end+1);
            }
        }
            if (beginChar.size() != endChar.size()) {
                paired = false;
            } else if(beginChar.size() == (endChar.size())) {
                for (int i = 0; i < beginChar.size(); i++) {
                    if (endChar.get(i) < beginChar.get(i)) {
                        paired = false;
                        break;
                    } else if (endChar.get(i) > beginChar.get(i)) {
                        paired = true;
                    }
                }
            }
        return paired;
    }

}
