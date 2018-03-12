package io.zipcoder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class WC {

    private Iterator<String> si;
    private String file = WC.class.getResource("someTextFile.txt").getFile();

    // Nullary constructor for testing
    public WC(){}

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

    public void logic() {
        HashMap<String, Integer> wordsAndAmounts = new HashMap<String, Integer>();
        while (!(file.equals(null))) {
            String[] arrayOfWords = file.split(" ");
            // Ths for loop makes all words lower case for better counting and removes periods from
            for (int j = 0; j < arrayOfWords.length; j++) {
                arrayOfWords[j].toLowerCase();
                if (arrayOfWords[j].charAt(arrayOfWords[j].length()-1) == '.') {
                    arrayOfWords[j] = arrayOfWords[j].substring(0, arrayOfWords[j].length()-1);
                }
            }
            for (int i = 0; i < wordsAndAmounts.size(); i++) {
                if (wordsAndAmounts.containsKey()) {

                }
            }
        }
    }

}
