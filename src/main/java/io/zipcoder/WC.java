package io.zipcoder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import static java.util.stream.Collectors.toMap;

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
        this.si = si;
    }

    public void wordCount() {
        while (si.hasNext()) {
            String current = si.next().toLowerCase().replaceAll("[a-zñáéíóú]", ""); // deletes all other special characters and replaces them w blank space
            if (wordsWithCounts.containsKey(current)) {
                wordsWithCounts.put(current, wordsWithCounts.get(current) + 1); // if we have this word -> get the int value at that key and add one
            } else {
                wordsWithCounts.put(current, 1); // if we do not have the word, add it and set the count to one
            }
        }
    }

    public void print(){
        this.wordsWithCounts.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }

    public static void main (String[] args){
        WC wc = new WC("/Users/jessicacampbell/Dev/EncapsulativeCharacters/src/main/resources/DonQuijote.txt");
        wc.print();
    }

}
