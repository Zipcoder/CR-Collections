package io.zipcoder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;

public class MainApplication {

    public static void main(String[] args) {
        //Date date = new Date();
        System.out.println("Running tests without linking:");
        long startTime = System.nanoTime();
        WC goodAndEvil = new WC(WC.class.getResource("/BeyondGoodAndEvil.txt").getFile());
        ArrayList<Map.Entry<String,Integer>> words = goodAndEvil.countWordsWithoutLinking();
        System.out.println("Beyond Good and Evil: " + words);
        WC earnest = new WC(WC.class.getResource("/TheImportanceOfBeingEarnest.txt").getFile());
        ArrayList<Map.Entry<String,Integer>> words2 = earnest.countWordsWithoutLinking();
        System.out.println("The Importance of Being Earnest: " + words2);
        WC huckFinn = new WC(WC.class.getResource("/TheAdventuresOfHuckleberryFinn").getFile());
        ArrayList<Map.Entry<String,Integer>> words3 = huckFinn.countWordsWithoutLinking();
        System.out.println("The Adventures of Huckleberry Finn: " + words3);
        long duration = (System.nanoTime()-startTime)/1000000;
        System.out.println("Process took " + duration + "ms to compute");
        System.out.println();

        System.out.println("Running tests with linking:");
        long startTime2 = System.nanoTime();
        WC goodAndEvil2 = new WC(WC.class.getResource("/BeyondGoodAndEvil.txt").getFile());
        LinkedList<Map.Entry<String,Integer>> words4 = goodAndEvil2.countWordsWithLinking();
        System.out.println("Beyond Good and Evil: " + words4);
        WC earnest2 = new WC(WC.class.getResource("/TheImportanceOfBeingEarnest.txt").getFile());
        LinkedList<Map.Entry<String,Integer>> words5 = earnest2.countWordsWithLinking();
        System.out.println("The Importance of Being Earnest: " + words5);
        WC huckFinn2 = new WC(WC.class.getResource("/TheAdventuresOfHuckleberryFinn").getFile());
        LinkedList<Map.Entry<String,Integer>> words6 = huckFinn2.countWordsWithLinking();
        System.out.println("The Adventures of Huckleberry Finn: " + words6);
        long duration2 = (System.nanoTime()-startTime2)/1000000;
        System.out.println("Process took " + duration2 + "ms to compute");
    }




}
