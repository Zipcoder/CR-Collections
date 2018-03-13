package io.zipcoder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.math.BigInteger.valueOf;

public class WC {

    private Iterator<String> si;
    private LinkedHashMap<String, Integer> wordCount;

    public WC(String fileName) {
        try {
            this.si = new Scanner(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println(fileName + " Does Not Exist");
            System.exit(-1);
        }
        this.wordCount = new LinkedHashMap<>();
    }

    public WC(Iterator<String> si) {
        this.si = si;
    }

    public void createMap() {
        while (si.hasNext()) {
            si.hasNext();
            String input = si.next();
            String element = input.replaceAll("\\W+", "").toLowerCase();
            if(!wordCount.containsKey(element)) {
                wordCount.put(element, 1);
            } else if(wordCount.containsKey(element)) {
                wordCount.replace(element, wordCount.get(element)+1);
            }
        }
    }


    public StringBuilder printMap(){
        StringBuilder count = new StringBuilder();
        List<Map.Entry<String,Integer>> list = new ArrayList<>(wordCount.entrySet());
        list.sort(Comparator.comparing(Map.Entry::getValue));
        Collections.reverse(list);
        for(Map.Entry<String,Integer> entry: list){
            count.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return count;
    }

}

