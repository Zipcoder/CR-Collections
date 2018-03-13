package io.zipcoder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class WC {
    private Iterator<String> si;
    private Map<String, Integer> wordsAndCounts = new LinkedHashMap<String, Integer>();

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

    public WC() {}

    public void program(){
        ArrayList<String> words = new ArrayList<String>();
        do{
            words.add(si.next());
        }while(si.hasNext() == true);
        fillTreeMap(words);
        printInfo();
    }

    private void printInfo() {
        for(Map.Entry entry : wordsAndCounts.entrySet()){
            System.out.println(String.format("Word: %-20s  |  Occurrences: %s", entry.getKey().toString(), entry.getValue().toString()));
        }
    }

    public void fillTreeMap(ArrayList words){
        Collections.sort(words, Collections.reverseOrder());
        for(Object element : words){
            int occ = getOccurrences(element, words);
            wordsAndCounts.put(element.toString(), occ);
        }
    }

    public int getOccurrences(Object element, ArrayList words){
        int wordCount = 0;
        for(Object word : words){
            if(word.equals(element)){
                wordCount++;
            }
        }
        return wordCount;
    }

}
