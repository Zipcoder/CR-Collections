package io.zipcoder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class WC {
    private Iterator<String> si;
    private LinkedHashMap<String, Integer> wordMap;

    public WC(String fileName) {
        this.wordMap = new LinkedHashMap<String, Integer>();
        try {
            this.si = new Scanner(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println(fileName + " Does Not Exist");
            System.exit(-1);
        }
    }

    public WC(Iterator<String> si) {
        this.wordMap = new LinkedHashMap<String, Integer>();
        this.si = si;
    }


    public void buildMap() {
        while (si.hasNext()) {
            buildMapFromString(si.next());
        }
    }

    private void buildMapFromString(String aString) {
        String lowerCase = aString.toLowerCase();
        String[] aLine = lowerCase.split(" ");

        for (int i = 0; i < aLine.length; i++) {
            aLine[i] = aLine[i].replaceAll("[^a-z]", "");
        }

        for (int i = 0; i < aLine.length; i++) {
            this.incrementValue(getWordMap(), aLine[i]);
        }
    }

    public void incrementValue(LinkedHashMap<String, Integer> aMap, String key) {
        Integer value = aMap.get(key);

        if (value == null) {
            value = 0;
        }
        aMap.put(key, value + 1);
    }

    public LinkedHashMap<String, Integer> getWordMap() {
        return this.wordMap;
    }

    public List<Map.Entry<String,Integer>> sortMap() {

        List<Map.Entry<String, Integer>> sortedList = new ArrayList<Map.Entry<String, Integer>>(getWordMap().entrySet());

        Collections.sort(sortedList, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o2.getValue().compareTo(o1.getValue()));
            }
        });

        return sortedList;
    }


    public String display() {
        int count = 0;

        StringBuilder breakdown = new StringBuilder();

        for (Map.Entry<String, Integer> key : sortMap()) {
            breakdown.append(String.format("%3s", key.getValue()));
            breakdown.append(" | " + key.getKey() + "\n");
            count += key.getValue();
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Total words: " + count + "\n><><><><><><><><><\n\n");
        sb.append(breakdown);
        return sb.toString();
    }

}