package io.zipcoder;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class WC {
    private Iterator<String> si;
    private LinkedHashMap<String, Integer> wordCount;
    private String separator = "[^\\w]+";

    public WC(String fileName) {
        try {
            this.si = new Scanner(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println(fileName + " Does Not Exist");
            System.exit(-1);
        }
        wordCount = new LinkedHashMap<>();
    }
    public WC(Iterator<String> si) {
        this.si = si;
        wordCount = new LinkedHashMap<>();
    }

    public void textIterator(){
        wordCount = new LinkedHashMap<>();
        while (si.hasNext()){
            //put all the words in the text into a string[].
            String[] allTextSeparated = si.next().toLowerCase().split(separator);
            for (String word : allTextSeparated){
                if (wordCount.containsKey(word)){
                    int value = wordCount.get(word) + 1;
                    wordCount.put(word, value);
                }
                else {
                    wordCount.put(word, 1);
                }
            }
        }
    }
    public List <Map.Entry<String, Integer>> sorted(){
        List<Map.Entry<String, Integer>> sortedMap = new ArrayList<>(wordCount.entrySet());
        Collections.sort(sortedMap, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }

        });
        for(Map.Entry<String, Integer> entry: sortedMap){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        return sortedMap;
    }
    public String toString(){
       StringBuilder usedForTest = new StringBuilder();
        for (Map.Entry<String, Integer> entry : sorted()){
            usedForTest.append(entry.getKey() + " : " + entry.getValue() + "\n");
        }
        return usedForTest.toString();
    }


}
