package io.zipcoder;

import java.util.Date;
import java.util.LinkedList;
import java.util.Map;

public class MainApplication {

    public static void main(String[] args) {
        //Date date = new Date();
        long startTime = System.nanoTime();
        WC goodAndEvil = new WC(WC.class.getResource("/BeyondGoodAndEvil.txt").getFile());
        LinkedList<Map.Entry<String,Integer>> words = goodAndEvil.countWords();
        System.out.println("Beyond Good and Evil: " + words);
        WC earnest = new WC(WC.class.getResource("/TheImportanceOfBeingEarnest.txt").getFile());
        LinkedList<Map.Entry<String,Integer>> words2 = earnest.countWords();
        System.out.println("The Importance of Being Earnest: " + words2);
        WC huckFinn = new WC(WC.class.getResource("/TheAdventuresOfHuckleberryFinn").getFile());
        LinkedList<Map.Entry<String,Integer>> words3 = huckFinn.countWords();
        System.out.println("The Adventures of Huckleberry Finn: " + words3);
        long duration = (System.nanoTime()-startTime)/1000000;
        System.out.println("Process took " + duration + "ms to compute");
    }




}
