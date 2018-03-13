package io.zipcoder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Collectors;

public class WC {
    private Iterator<String> si;

    Map<String, Integer> wordMap = new HashMap<>();

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
    private void splitFile(){
        ArrayList<String> words = new ArrayList<>();
        String eachWord;
        while(si.hasNext()){
            eachWord = si.next();
            words.add(eachWord);
        }
    }
    private void wordCount(){
        while(si.hasNext()){
            String word = si.next().toLowerCase();
            Integer freq = wordMap.get(word);
            if(freq == null){
                wordMap.put(word, 1);
            }else wordMap.put(word, freq+1);
        }

    }
    private Map<String, Integer> sortedMap(){
        Map<String, Integer>
        myMap = wordMap
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

        for(Map.Entry entry: myMap){
            System.out.println(entry);
        }
        return myMap;
    }
}
