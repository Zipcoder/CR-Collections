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


    public ArrayList <Map.Entry<String,Integer>> countWords(){
        LinkedHashMap<String,Integer> outputMap = new LinkedHashMap<>();

        while(si.hasNext()){
            String word = si.next().toLowerCase().replaceAll("\\.", "");
            if(outputMap.containsKey(word.toLowerCase())){
                int newNumber = outputMap.get(word)+1;
                outputMap.put(word.toLowerCase(), newNumber);
            }
            else{
                outputMap.put(word.toLowerCase(),1);
            }
        }

        ArrayList <Map.Entry<String,Integer>> outputList = new ArrayList<>(outputMap.entrySet());
        outputList.sort((o1,o2) -> o2.getValue().compareTo(o1.getValue()));


        return outputList;
    }



}

