package io.zipcoder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

import static java.util.stream.Collectors.toMap;


public class WC {
    private Iterator<String> si;
    public Map<String, Integer> wordMap = new LinkedHashMap<String, Integer>();


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

    public Map<String, Integer> wordCountStorage() {

        while (si.hasNext()) {
            String current = si.next().toLowerCase().replaceAll("[^a-z0-9]", "");
            if (!wordMap.containsKey(current)) {
                wordMap.put(current, 1);
            } else {
                wordMap.put(current, wordMap.get(current) + 1);
            }
        }
        return wordMap;
    }

    public Map<String, Integer> sortInDescOrderByValue() {
        Map<String, Integer> sortByDesc = wordCountStorage().entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(toMap(Map.Entry::getKey,
                        Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        return sortByDesc;
    }
}





//TreeMap<String, Integer> uniqueWordCount = new TreeMap<String, Integer>();
