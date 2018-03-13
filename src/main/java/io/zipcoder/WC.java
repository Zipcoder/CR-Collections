package io.zipcoder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import static java.util.stream.Collectors.toMap;

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

    public ArrayList<String> removePunctuation() {
        ArrayList<String> answer = new ArrayList<>();
        while (si.hasNext()) {
            answer.add(si.next().toLowerCase().replaceAll("[^a-zA-Z`]", ""));
        }
        return answer;
    }

    public Map<String, Integer> wordCount(){
        ArrayList<String> filtered = removePunctuation();
        Map<String, Integer> answer = new LinkedHashMap<>();
        for (String word:filtered) {
            if (!answer.containsKey(word)) answer.put(word, 1);
            else answer.put(word, answer.get(word) + 1);
        }
        Map<String, Integer> sorted = answer.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        for (Map.Entry entry:sorted.entrySet()) {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }
        return sorted;
    }

}
