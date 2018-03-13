package io.zipcoder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class WC {
    private Iterator<String> si;
    private int counter = 0;

    Map<String, Integer> reader = new HashMap<String,Integer>();

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

    public Map<String, Integer> wordCollector(){
        while(si.hasNext()){
            String nextWord = si.next().toLowerCase().replaceAll("[^a-z']", "");
            if(reader.containsKey(nextWord)){
                reader.put(nextWord, reader.get(nextWord) + 1);
                counter++;
                } else {
                reader.put(nextWord, 1);
                counter++;
            }
        }
        return reader;
    }

    public Map<String, Integer> sortByCount(){

        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(reader.entrySet());

        //sort the list in descending order with a comparator
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        //convert sortedMap back to Map
        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

    public int countWord() {
        return counter;
    }

    public String printMap(Map<String, Integer> map){

        StringBuilder mapBuilder = new StringBuilder();

        for(String key : map.keySet()){
            mapBuilder.append(String.format("%-2s", reader.get(key)));
            mapBuilder.append(String.format("%-2s", ":"));
            mapBuilder.append(key);
            mapBuilder.append("\n");
        }

        return mapBuilder.toString();
    }
}

