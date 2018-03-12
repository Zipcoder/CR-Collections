package io.zipcoder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class WC {
    private final String delimRegEx = "[^\\w]+";
    private Iterator<String> si;
    private LinkedHashMap<String, Integer> hash;

    public WC(String fileName) {
        hash = new LinkedHashMap<>();
        try {
            this.si = new Scanner(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println(fileName + " Does Not Exist");
            System.exit(-1);
        }
    }

    public WC(Iterator<String> si) {
        this.si = si;
        hash = new LinkedHashMap<>();
    }


    public void generate() {
        while (si.hasNext()) {
            String[] wordsThisLine = si.next().split(delimRegEx);
            for (String raw : wordsThisLine) {
                String key = raw.toLowerCase();

                if (key.equals(""))
                    continue;

                Integer val = hash.get(key);
                val = (val != null) ? (val + 1) : 1;
                hash.put(key, val);
            }
        }
    }

    public List<Map.Entry<String, Integer>> getSortedEntries() {
        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(hash.entrySet());
        sortedWords.sort(Comparator.comparing(Map.Entry<String, Integer>::getValue).reversed());
        return sortedWords;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        getSortedEntries().forEach((Map.Entry<String, Integer> e) ->
                sb.append(String.format("%3d : %s\n", e.getValue(), e.getKey()))
        );
        return sb.toString();
    }

    public void print() {
        System.out.println(toString());
    }
}
