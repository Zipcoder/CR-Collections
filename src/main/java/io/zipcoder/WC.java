package io.zipcoder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class WC {
    private Iterator<String> si;
    private TreeMap<String, Integer> map = new TreeMap<String, Integer>();

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

    public Map<String, Integer> count(){
        while(si.hasNext()){
            String[] characters = si.next().replaceAll("\\W", "").toLowerCase().split(" ");
            for(int i = 0; i<characters.length; i++){
                increment(map, characters[i]);
            }
        }
        return map;
    }

    public void increment(Map<String, Integer> map, String index){
        Integer counter = map.get(index);
        if(counter==null){
            counter = 0;
        }
        map.put(index, counter + 1);
    }

    public String displayMap(){
        Collections.sort(Map,(o1, o2) -> o2.getValue().compareTo(o1.getValue()));


        StringBuilder sb = new StringBuilder();
        sb.append("Count in descending order: \n");
        for(String index : map.keySet()){
            sb.append("\t"+index + ": " + map.get(index) +"\n");
        }
        return sb.toString()

    }
}
//PseudoCode
//create a counter
//loop through si
//and make all words characters except symbols and numbers and all lowercase

//Actual Code Explanation
//Create a treemap up top, it holds the keys (index) and the value(word)
//