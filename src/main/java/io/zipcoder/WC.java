package io.zipcoder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

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


    public ArrayList <Map.Entry<String,Integer>> countWordsWithoutLinking(){
        HashMap<String,Integer> outputMap = new HashMap<>();
        int totalWords =0;

        while(si.hasNext()){
            totalWords++;
            String word = si.next().toLowerCase().replaceAll("[^a-z]","");
            if(outputMap.containsKey(word)){
                int newNumber = outputMap.get(word)+1;
                outputMap.put(word, newNumber);
            }
            else{
                outputMap.put(word,1);
            }
        }
        outputMap.put("TOTAL WORDS", totalWords);

        ArrayList <Map.Entry<String,Integer>> outputList = new ArrayList<>(outputMap.entrySet());
        outputList.sort((o1,o2) -> {
            if(o2.getValue().compareTo(o1.getValue()) == 0) return o1.getKey().compareTo(o2.getKey());
            else return o2.getValue().compareTo(o1.getValue());
        });

        return outputList;
    }

    public LinkedList <Map.Entry<String,Integer>> countWordsWithLinking(){
        LinkedHashMap<String,Integer> outputMap = new LinkedHashMap<>();
        int totalWords =0;

        while(si.hasNext()){
            totalWords++;
            String word = si.next().toLowerCase().replaceAll("[^a-z]","");
            if(outputMap.containsKey(word)){
                int newNumber = outputMap.get(word)+1;
                outputMap.put(word, newNumber);
            }
            else{
                outputMap.put(word,1);
            }
        }
        outputMap.put("TOTAL WORDS", totalWords);

        LinkedList <Map.Entry<String,Integer>> outputList = new LinkedList<>(outputMap.entrySet());
        outputList.sort((o1,o2) -> {
            if(o2.getValue().compareTo(o1.getValue()) == 0) return o1.getKey().compareTo(o2.getKey());
            else return o2.getValue().compareTo(o1.getValue());
        });

        return outputList;
    }

}

