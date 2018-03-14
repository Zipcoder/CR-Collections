package io.zipcoder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class WC {

    private Iterator<String> si;
    private Map <String, Integer> wordsWithCounts = new LinkedHashMap<>();

    public WC(String fileName) {
        try {
            this.si = new Scanner(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println(fileName + "Does Not Exist");
            System.exit(-1);
        }
    }

    public WC(Iterator<String> si) {
        this.wordsWithCounts = new LinkedHashMap<String, Integer>();
        this.si = si;
    }

    public Map<String, Integer> readWords() {

        while (si.hasNext()) {
            String current = si.next().toLowerCase().replaceAll("[^a-zñáéíóú]", ""); // deletes all other special characters and replaces them w blank space
            if (wordsWithCounts.containsKey(current)) {
                wordsWithCounts.put(current, wordsWithCounts.get(current) + 1); // if we have this word -> get the int value at that key and add one
            } else
                wordsWithCounts.put(current, 1); // if we do not have the word, add it and set the count to one
        }
        return wordsWithCounts;
    }

    public void reverseOrder(){
//        Map<String, Integer> sorted = readWords().entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
//                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
//        return sorted;
        this.wordsWithCounts.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }

//    public String display(){
//        readWords();
//        reverseOrder();
//        StringBuilder sb = new StringBuilder();
//        for(String key : wordsWithCounts.keySet()){
//            sb.append("\nWord: " + key + "\nCount:" + wordsWithCounts.get(key) + "\n__________");
//        }
//        System.out.println(sb.toString());
//        return sb.toString();
//    }

    public static void main(String[] args) {
    WC wc = new WC("/Users/jessicacampbell/Dev/CR-MesoLabs-Collections-EncapsulativeCharacters/src/main/resources/DonQuijote.txt");
    wc.readWords();
    wc.reverseOrder();
}

}
