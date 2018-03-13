package io.zipcoder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

import static java.util.stream.Collectors.toMap;

public class WC {
    private Iterator<String> si;
    private LinkedHashMap<String, Integer> wordCounter;

    public WC(String fileName) {
        try {
            this.si = new Scanner(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println(fileName + " Does Not Exist");
            System.exit( - 1);
        }
    }

    public WC(Iterator<String> si) {
        this.si = si;
    }

    public LinkedHashMap<String, Integer> storeWordsWithCount() {
        wordCounter = new LinkedHashMap<>();
        while(si.hasNext()) {
            String word = si.next().replace(".", "")
                    .replace(",", "")
                    .replace("-", "")
                    .replace("/", "")
                    .replace(";", "")
                    .replace(":", "")
                    .replace("\'", "")
                    .replace("\"", "")
                    .replace("?", "")
                    .replace("!", "")
                    .replace("`", "")
                    .replace("(", "")
                    .replace(")", "")
                    .toLowerCase();
            if(!wordCounter.containsKey(word)) {
                wordCounter.put(word, 1);
                } else {
                wordCounter.put(word, wordCounter.get(word) + 1);
            }
        }
        return wordCounter;
    }

    public LinkedHashMap<String, Integer> sortWordCounter() {
        LinkedHashMap<String, Integer> sortedMap = storeWordsWithCount().entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(toMap(Map.Entry::getKey,
                               Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        return sortedMap;
    }

    public String printWordsAndCountInDescendingOrder() {
        StringBuilder wordList = new StringBuilder();
        LinkedHashMap<String, Integer> sortedMap = sortWordCounter();
        for(Map.Entry<String, Integer> entries : sortedMap.entrySet()) {
            wordList.append(entries.getKey() + " : " + entries.getValue().toString() + "\n");
        }
        return wordList.toString();
    }

}
