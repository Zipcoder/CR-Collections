package io.zipcoder;

import java.io.*;
import java.util.*;

public class WC {
    private Iterator<String> si;

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


    public Map<String, Integer> getWordCount() {
        Map<String, Integer> wordOccurences = new HashMap<>();
        while (si.hasNext()) {
            String currentLine = si.next();
            String[] words = currentLine.split(" ");

            for (String word : words) {
                word = word.toLowerCase();
                word = word.replaceAll("[^a-zA-Z']", "");

                if (!word.trim().isEmpty()) {
                    if (wordOccurences.containsKey(word)) {
                        int count = wordOccurences.get(word);
                        wordOccurences.put(word, count + 1);
                    } else {
                        wordOccurences.put(word, 1);
                    }
                }
            }
        }
        return entriesSortedByValues(wordOccurences);
    }


    private static <K, V extends Comparable<? super V>>  Map<K, V> entriesSortedByValues(Map<K, V> map) {
        // ArrayList is initialized with all entries of passed in map
        List<Map.Entry<K, V>> sortedEntries = new ArrayList<>(map.entrySet());

        // used lambda expression to sort values in descending order and return result
        sortedEntries.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        Map<K, V> result = new LinkedHashMap<>();

        for (Map.Entry<K, V> entry : sortedEntries) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
}

