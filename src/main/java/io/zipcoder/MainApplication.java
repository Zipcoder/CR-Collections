package io.zipcoder;

import java.util.ArrayList;
import java.util.Map;

public class MainApplication {

    public static void main(String[] args) {
        WC goodAndEvil = new WC(WC.class.getResource("/BeyondGoodAndEvil.txt").getFile());
        ArrayList<Map.Entry<String,Integer>> words = goodAndEvil.countWords();
        System.out.println(words);
    }




}
