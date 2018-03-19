package io.zipcoder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

import static java.util.stream.Collectors.toMap;

public class WC {

    Map<String, Integer> wordsAndTheirCounts = new LinkedHashMap<String, Integer>();
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

    //Sort values into map method
    public Map<String, Integer> countNumberOfTimesWordsOccur(){
        Integer wordCount = 0;
        while(si.hasNext()){
            wordCount++;
            String word = si.next().toLowerCase().replaceAll("[^a-z]", "");
            if(wordsAndTheirCounts.containsKey(word)){
                    wordsAndTheirCounts.put(word, wordsAndTheirCounts.get(word) +1);
            } else{
                wordsAndTheirCounts.put(word, 1);
            }
        }
        wordsAndTheirCounts.put("Total Words", wordCount);
        return wordsAndTheirCounts;
    }

    //Order map in descending order method
    public Map<String, Integer> sortMapIntoDescendingOrder() {
        List<Map.Entry<String, Integer>> toSort = new ArrayList<>();
        for (Map.Entry<String, Integer> stringIntegerEntry : countNumberOfTimesWordsOccur().entrySet()) {
            toSort.add(stringIntegerEntry);
        }
        toSort.sort(Map.Entry.<String, Integer>
                comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()));
        Map<String, Integer> wordsAndTheirCountsDesc = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> stringIntegerEntry : toSort) {
            wordsAndTheirCountsDesc.putIfAbsent(stringIntegerEntry.getKey(), stringIntegerEntry.getValue());
        }
        return wordsAndTheirCountsDesc;
    }

    //Print map method
    public String printMap(){
        StringBuilder printedList = new StringBuilder();
        for (Map.Entry<String, Integer> entry : sortMapIntoDescendingOrder().entrySet()){
            printedList.append(entry.getKey());
            printedList.append(":");
            printedList.append(" appears ");
            printedList.append(entry.getValue());
            printedList.append(" times\n");
        }
        return printedList.toString();

    }


/// ^ reads like does not equal
// ::

}
