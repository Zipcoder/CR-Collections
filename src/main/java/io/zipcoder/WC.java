package io.zipcoder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Collectors;

public class WC {
    private Iterator<String> si;

    Map<String, Integer> wordMap = new HashMap<>();
    ArrayList<String> words = new ArrayList<>();

    public WC(String fileName) {
        try {
            this.si = new Scanner(new FileReader(fileName)).useDelimiter("[^A-Za-z]+");
        } catch (FileNotFoundException e) {
            System.out.println(fileName + " Does Not Exist");
            System.exit(-1);
        }
    }

    public WC(Iterator<String> si) {
        this.si = si;
    }

    public void splitFile() {
        String eachWord;
        while (si.hasNext()) {
            eachWord = si.next();
            words.add(eachWord.toLowerCase());
        }
    }

    public Map<String, Integer> wordCount() {
        for (String s : words) {
            Integer freq = wordMap.get(s);
            wordMap.put(s, (freq == null) ? 1 : freq + 1);
        }
        return wordMap;
    }

    public Map<String, Integer> sortedMap() {
        Map<String, Integer>
                myMap = wordMap
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

        return myMap;
    }


    public String getSi() {
        while (si.hasNext()) {
            String currentString = si.next();
            return currentString;
        }
        return null;
    }
}
