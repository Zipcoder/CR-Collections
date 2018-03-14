package io.zipcoder;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class WC {

    // private Iterator<String> si;
    private String entireFile;// = WC.class.getResource("someTextFile.txt").getFile();

    // Nullary constructor for testing
    public WC(){}

    public WC(String fileName) {
        try {
            // NOTED OUT TEMPORARILY BECAUSE AM DINGUS
            //this.si = new Scanner(new FileReader(fileName));
            this.entireFile = new Scanner(new File(WC.class.getResource("/someTextFile.txt").getFile())).useDelimiter("\\A").next();
        } catch (FileNotFoundException e) {
            System.out.println(fileName + " Does Not Exist");
            System.exit(-1);
        }
    }

//    public WC(Iterator<String> si) {
//        this.si = si;
//    }

    public void logic() {
        HashMap<String, Integer> wordsAndAmounts = new HashMap<String, Integer>();
        String[] arrayOfWords = entireFile.split("\\s+");
        for (String arrayOfWord : arrayOfWords) {
            String currentWord = arrayOfWord;
            currentWord = wordCleaner(currentWord);
            int count = wordsAndAmounts.containsKey(currentWord) ? wordsAndAmounts.get(currentWord) : 0;
            wordsAndAmounts.put(currentWord, count + 1);
        }
        // Print out all words next to how many times they appear
        for (String name : wordsAndAmounts.keySet()){
            String value = wordsAndAmounts.get(name).toString();
            System.out.println(name + " " + value);
        }
    }

    private String wordCleaner(String word) {
        return word.replaceAll("[^a-zA-Z ]", "").toLowerCase();
    }

}
