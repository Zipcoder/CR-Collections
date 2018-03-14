package io.zipcoder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class WC {
    private Iterator<String> si;
    private TreeMap<String, Integer> wordMap = new TreeMap();


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

    public void wordCounter(){
        splitIntoSingleWords();
        sortMap();
    }

    private void splitIntoSingleWords() {
        String[] words;
        for(String fileLine = si.next(); true; fileLine = si.next()) {
            words = fileLine.split(" ");
            words = stripUnwantedChars(words);
            placeWordIntoMap(words);
            if (!si.hasNext()){
                break;
            }
        }
    }

    private void placeWordIntoMap(String[] words) {
        for (String word: words) {
            if (!wordMap.containsKey(word.toLowerCase())){
                wordMap.put(word.toLowerCase(), 1);
            } else {
                wordMap.put(word.toLowerCase(), wordMap.get(word)+ 1);
            }
        }
    }

    private void sortMap(){
        ArrayList<Map.Entry<String, Integer>> listOfEntries = new ArrayList<Map.Entry<String, Integer>>(wordMap.entrySet());
        listOfEntries.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        printAllResults(listOfEntries);
    }

    private void printAllResults(ArrayList<Map.Entry<String, Integer>> inputList){
        for (Map.Entry entry: inputList) {
            System.out.println(entry);
        }
    }

    public String[] stripUnwantedChars(String[] inputArray){
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i]= inputArray[i].replaceAll("[^a-zA-Z']", "");
        }
        return inputArray;
    }

    public TreeMap<String, Integer> getWordMap() {
        return wordMap;
    }
}
