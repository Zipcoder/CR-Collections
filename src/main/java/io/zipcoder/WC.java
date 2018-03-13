package io.zipcoder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class WC {
    private Iterator<String> si;
    private Map<String, Integer> words;

    public WC(String fileName) {
        try {
            this.si = new Scanner(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println(fileName + " Does Not Exist");
            System.exit(-1);
        }
    }

    public static void main(String[] args) {
        WC theWC = new WC("src/main/resources/someTextFile.txt");
        theWC.readsStringFromfileAddstoMap();
        theWC.print();
    }

    public WC(Iterator<String> si) {
        this.si = si;
    }

    public void readsStringFromfileAddstoMap() {
        words = new TreeMap<String, Integer>();
        while (this.si.hasNext()) {
            String[] wordsArray = this.si.next().split("[^\\w]+");
            putsStringKeyInMap(wordsArray);
        }
    }

    public void putsStringKeyInMap(String[] theWords) {
        for (int i = 0; i < theWords.length; i++) {
            String word = theWords[i];
            increaseValueOfWord(word);
        }
    }

    public void increaseValueOfWord(String theWord) {
        int count = 1;
        if (words.containsKey(theWord)) {
            count = getCount(theWord);
            words.put(theWord, count + 1);
        } else {
            words.put(theWord, count);
        }
    }

    public int getCount(String theWord) {
        return words.get(theWord);
    }


    public void print() {
        for (Map.Entry<String, Integer> entry : words.entrySet())
            System.out.println(entry.getValue() + " : " + entry.getKey());
    }

}

