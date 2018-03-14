package io.zipcoder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class WC {
    private Iterator<String> si;
    private Map<String,Integer> wordsInFile=new TreeMap<String, Integer>(Collections.reverseOrder());

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

    public Map<String, Integer> readWords(){

        while(si.hasNext()) {
            String aWord = si.next().toLowerCase().replaceAll("[^a-z]","");
            if (wordsInFile.containsKey(aWord)) {
                wordsInFile.put(aWord, wordsInFile.get(aWord)+1);
            } else
                wordsInFile.put(aWord,1);
        }
            return wordsInFile;
        }

        public String printWords(){
        readWords();
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("%15s%15s\n","Words","Count"));
        for(String key: wordsInFile.keySet()){
            builder.append(String.format("%15s%15d\n", key,wordsInFile.get(key)));
        }
            System.out.println(builder.toString());
        return builder.toString();
        }

        public static void main(String[]args){
        WC wordCount = new WC("src/main/resources/someTextFile.txt");
        wordCount.printWords();
        }



}
