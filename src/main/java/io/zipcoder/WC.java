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

    private static Comparator<Map.Entry<String, Integer>> byCountThenByName = (o1, o2) -> {
        if (o2.getValue().compareTo(o1.getValue()) == 0) return o1.getKey().compareTo(o2.getKey());
        else return o2.getValue().compareTo(o1.getValue());
    };


    public ArrayList<Map.Entry<String, Integer>> countWordsWithoutLinking() {
        HashMap<String, Integer> outputMap = new HashMap<>();

        outputMap = (HashMap<String, Integer>) buildMap(outputMap);

        ArrayList<Map.Entry<String, Integer>> outputList = new ArrayList<>(outputMap.entrySet());
        outputList.sort(byCountThenByName);

        return outputList;
    }

    public LinkedList<Map.Entry<String, Integer>> countWordsWithLinking() {
        LinkedHashMap<String, Integer> outputMap = new LinkedHashMap<>();

        outputMap = (LinkedHashMap<String, Integer>) buildMap(outputMap);

        LinkedList<Map.Entry<String, Integer>> outputList = new LinkedList<>(outputMap.entrySet());
        outputList.sort(byCountThenByName);

        return outputList;
    }

    public TreeSet<Map.Entry<String, Integer>> countWordsWithTreeSet() {
        LinkedHashMap<String, Integer> outputMap = new LinkedHashMap<>();

        outputMap = (LinkedHashMap<String, Integer>) buildMap(outputMap);

        TreeSet<Map.Entry<String, Integer>> outputSet = new TreeSet<>(byCountThenByName);
        outputSet.addAll(outputMap.entrySet());

        return outputSet;
    }

    private Map<String,Integer> buildMap (Map<String,Integer> inputMap){
        int totalWords = 0;
        while (si.hasNext()) {
            totalWords++;
            String word = si.next().toLowerCase().replaceAll("[^a-z]", "");
            if (inputMap.containsKey(word)) {
                int newNumber = inputMap.get(word) + 1;
                inputMap.put(word, newNumber);
            } else {
                inputMap.put(word, 1);
            }
        }
        inputMap.put("TOTAL WORDS", totalWords);
        return inputMap;
    }


}


