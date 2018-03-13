package io.zipcoder;

import java.io.IOException;

public class MainApplication {

    public static void main(String[] args) {
        WC wordCountsimulation = new WC("/Users/petermccormick/Dev/Peter/Week6Labs/CR-MesoLabs-Collections-" +
                "EncapsulativeCharacters/src/main/resources/14015.txt");

        wordCountsimulation.wordCollector();
        wordCountsimulation.sortWordCollector();
        wordCountsimulation.printSortedMap();
        try {
            wordCountsimulation.printToText();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
