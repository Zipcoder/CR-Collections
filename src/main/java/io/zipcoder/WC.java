package io.zipcoder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class WC {
    public HashMap<String, Integer> myHashMap = new HashMap<String, Integer>();

    private Iterator<String> si;

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

    public void splitter(){
        while(si.hasNext()){
            si.next().replace(".", "");
            if(myHashMap.containsKey(si.next())){
//                myHashMap.get(si.next());
                myHashMap.put(si.next(),myHashMap.get(si.next()).intValue()+1);
            } else {
                myHashMap.put(si.next(), 1);
            }
        }
        System.out.println(myHashMap);
    }


}

/*

sampleword.replace(".", "");

or regex
 */
