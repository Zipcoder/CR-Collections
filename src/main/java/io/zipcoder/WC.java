package io.zipcoder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.Map.Entry;

import static java.util.stream.Collectors.toMap;



public class WC{
    private Iterator<String> si;
    Map<String, Integer> reader = new LinkedHashMap<String, Integer>();
    private ArrayList<Entry> sorted;

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

    public Map<String, Integer> wordCollector() {

        int count = 0;
        while (si.hasNext()) {
            count++;
          String nextWord = si.next().toLowerCase().replaceAll("[^a-z]", "");
          if(reader.containsKey(nextWord)) {
              reader.put(nextWord, reader.get(nextWord)+1);
          } else {
              reader.put(nextWord, 1);
          }
      } reader.put("Total Words", count);

       return reader;
    }


    public Map<String, Integer> sortInDescOrderByValue() {
        Map<String, Integer> sortByDesc = wordCollector().entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer> comparingByValue().reversed())
                .collect(toMap(Map.Entry::getKey,
                        Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        return sortByDesc;
    }

    public String printMap(){
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry: sortInDescOrderByValue().entrySet()) {
            sb.append(entry.getKey() + ":" + " appears " + entry.getValue() + " times\n");
        }
        System.out.println(sb.toString());
        return sb.toString();
    }


    public static void main(String[] args) {
        WC wc = new WC("/Users/danielhorowitz/Dev/CR-MesoLabs-Collections-EncapsulativeCharacters/src/main/resources/1400-0.txt");
        wc.printMap();


    }

}
