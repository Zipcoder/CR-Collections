package io.zipcoder;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import javax.swing.text.View;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WC extends TreeMap<String, Integer>{
    private Iterator<String> si;
    private NavigableMap<String, Integer> wordCountMap = new TreeMap<String, Integer>();

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


    public Map<String, Integer> wordCount()  {
        //iterator - hasNext() - returns true if there is something after
        while (si.hasNext()) {
            String[] words = si.next().replaceAll("\\W", "").toLowerCase().split(" ");
            for (int i = 0; i < words.length; i++) {
                incrementValue(wordCountMap, words[i]);
            }

        }

        return descendingSortByValue(wordCountMap);

    }

    public void incrementValue(Map<String, Integer> map, String key){
        Integer count = map.get(key);
        if (count == null){
            count = 0;
        }
        map.put(key, count +1);
    }


    public Map<String, Integer> descendingSortByValue(Map<String, Integer> map){
        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, ((o1, o2) -> o2.getValue().compareTo(o1.getValue())));

        Map<String, Integer> temp = new LinkedHashMap<>();

        for(Map.Entry<String, Integer> entry : list){
            temp.put(entry.getKey(), entry.getValue());
        }
        return temp;

    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        sb.append("Word Count in descending order:\n");
            for(String key : descendingSortByValue(wordCountMap).keySet()){
                sb.append("\t"+key + ": " + descendingSortByValue(wordCountMap).get(key) +"\n");
            }
        return sb.toString();
    }


    public static void main(String[] args) {
//        WC.class.getResource("/Users/bolee/Dev/Week_6/CR-MesoLabs-Collections-EncapsulativeCharacters/src/main/resources/AmericanFairyTale.txt").getFile();
//        WC wc = new WC(WC.class.getResource("/Users/bolee/Dev/Week_6/CR-MesoLabs-Collections-EncapsulativeCharacters/src/main/resources/AmericanFairyTale.txt").getFile());
//



    }


}
