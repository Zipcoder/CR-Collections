package io.zipcoder;

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


    public TreeMap storeWordsAndCount() {
        TreeMap<String, Integer> wordsAndCount = new TreeMap<>();

        while (si.hasNext()) {
            String newWord = si.next().replaceAll("[^A-Za-z0-9 ]", "").toLowerCase();
            if (!wordsAndCount.containsKey(newWord)) {
                wordsAndCount.put(newWord, 1);
            } else {
                int count = wordsAndCount.get(newWord);
                wordsAndCount.put(newWord, count + 1);
            }
        }
        return wordsAndCount;
    }




    public LinkedHashMap sortedByValueDescending(TreeMap<String, Integer> input) {
        {
            List<Map.Entry<String, Integer>> sortedByValue = new LinkedList<>(input.entrySet());

            Collections.sort(sortedByValue, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));

            LinkedHashMap<String, String> result = new LinkedHashMap<>();
            for (Map.Entry<String, Integer> entry : sortedByValue) {
                result.put(entry.getKey(), String.valueOf(entry.getValue()));
            }

            return result;
        }
    }

    public String toDisplay(LinkedHashMap<String, Integer> input){
        StringBuilder diplayString = new StringBuilder();

        for(String key : input.keySet()){
            diplayString.append("\t"+input.get(key) + " : " + key+"\n");
        }

        return diplayString.toString();
    }
}







