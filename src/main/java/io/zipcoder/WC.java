package io.zipcoder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class WC {
    private Iterator<String> si;
    private TreeMap<String, Integer> wordMap = new TreeMap();

    public WC(String fileName) {
        try {
            this.si = new Scanner(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println(fileName + " Does Not Exist");
            System.exit(-1);
        }
    }

    public WC(Iterator<String> si) {
        this.si = si;
    }

    public void wordCounter(){
        String[] words;
        for(String fileLine = si.next(); true; fileLine = si.next()) {
            words = fileLine.split(" ");
            for (String word: words) {
                if (!wordMap.containsKey(word.toLowerCase())){
                    wordMap.put(word.toLowerCase(), 1);
                } else {
                    wordMap.put(word.toLowerCase(), wordMap.get(word)+ 1);
                }
            }
            if (!si.hasNext()){
                break;
            }
        }
        printAllResults();
    }

    public TreeMap<String, Integer> getWordMap() {
        return wordMap;
    }

    public void printAllResults(){
        for (String key: wordMap.keySet()) {
            System.out.println(key + " " + wordMap.get(key));
        }
    }
}
