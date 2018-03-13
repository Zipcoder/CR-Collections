package io.zipcoder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class WC {
    private Iterator<String> si;
    public TreeMap<String, Integer> wordMap = new TreeMap<String, Integer>();


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

    public void addWord(String word, Integer count) {
        wordMap.put(word, count++);
    }

    public void getValue(String word, Integer count) {

    }


    public TreeMap wordCountStorage() {

        TreeMap<String, Integer> wordMap = new TreeMap<String, Integer>();
        while (si.hasNext()) {
            String current = si.next().toLowerCase().replaceAll("[^A-Za-z0-9]", "");
            if (!wordMap.containsKey(current)) {
                wordMap.put(current, 1);
            }
            else {
                Integer currentCount = wordMap.get(current);
                wordMap.put(current, currentCount+1);
            }
        }
        return wordMap;
    }


}





//TreeMap<String, Integer> uniqueWordCount = new TreeMap<String, Integer>();
