package io.zipcoder;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class WC {

    private Iterator<String> si;
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

    // NOTED OUT BECAUSE STRING ITERATOR IS BLEH
//    public WC(Iterator<String> si) {
//        this.si = si;
//    }

    public void logic() {
        HashMap<String, Integer> wordsAndAmounts = new HashMap<String, Integer>();
        String[] arrayOfWords = entireFile.split(" ");
        for (int j = 0; j < arrayOfWords.length; j++) {
            String currentWord = arrayOfWords[j];
            currentWord = currentWord.toLowerCase();
            if (currentWord.charAt(currentWord.length()-1) == '.') {
                currentWord = arrayOfWords[j].substring(0, currentWord.length()-1);
            }
            int count = wordsAndAmounts.containsKey(currentWord) ? wordsAndAmounts.get(currentWord) : 0;
            wordsAndAmounts.put(currentWord, count + 1);
        }
        // Print out all words next to how many times they appear
        for (String name : wordsAndAmounts.keySet()){
            String value = wordsAndAmounts.get(name).toString();
            System.out.println(name + " " + value);
        }
    }

    // psvm temporarily made for testing purposes
    public static void main(String[] args) {
        WC wc = new WC(WC.class.getResource("/someTextFile.txt").getFile());
        wc.logic();
    }

}
