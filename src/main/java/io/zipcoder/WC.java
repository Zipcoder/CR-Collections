package io.zipcoder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class WC implements Comparator{

    private Iterator<String> si;
    private Map<String, Integer> wordCounter = new HashMap<String, Integer>();

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

    public void wordCollector() {
        while (si.hasNext()) {
            String nextWord = si.next().toLowerCase();

            if (wordCounter.containsKey(nextWord)) {
                wordCounter.put(nextWord, wordCounter.get(nextWord) + 1);
            } else wordCounter.put(nextWord, 1);

        }
    }

}
