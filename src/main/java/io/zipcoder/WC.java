package io.zipcoder;

import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.toMap;

public class WC {

    private Iterator<String> si;
    private Map<String, Integer> wordCounter = new LinkedHashMap<String, Integer>();


    public WC() {

    }

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
        while (si.hasNext()) {
            String nextWord = si.next().toLowerCase().replaceAll("[^a-z]", "");

            if (wordCounter.containsKey(nextWord)) {
                wordCounter.put(nextWord, wordCounter.get(nextWord) + 1);
            } else wordCounter.put(nextWord, 1);
        }
        return wordCounter;
    }

    public Map<String, Integer> sortWordCollector() {
        Map<String, Integer> sortByDes = wordCollector().entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(toMap(Map.Entry::getKey,
                        Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        return sortByDes;

    }

    public String printSortedMap() {
        StringBuilder printOut = new StringBuilder();
        for (Map.Entry<String, Integer> e: sortWordCollector().entrySet()) {
            printOut.append(String.format("%18s : Occurred %5d times!\n", e.getKey(), e.getValue()));
            //////printOut.append(e.getKey() + " : Occurred " + e.getValue() + " times!\n" );\\\\\\\
        } return printOut.toString();
    }

    public void printToText() throws IOException {
        final File file = new File(
                "/Users/petermccormick/Dev/Peter/Week6Labs/CR-MesoLabs-Collections-EncapsulativeCharacters" +
                        "/src/main/resources/WordCountResults.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(printSortedMap());
        bufferedWriter.close();
    }

}
