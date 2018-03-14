package io.zipcoder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class WC {
    private Iterator<String> si;
    private LinkedHashMap<String, Integer> countWords;

    public WC(String fileName) {
        try {
            this.si = new Scanner(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println(fileName + " Does Not Exist");
            System.exit(-1);
        }

        this.countWords = new LinkedHashMap<String, Integer>();
    }


    public WC(Iterator<String> si) {
        this.si = si;
    }

    public void generateLinkedHashMap()
    {
        while (si.hasNext())
        {
            String nextWord = si.next().toLowerCase();

            if(!countWords.containsKey(nextWord))
            {
                countWords.put(nextWord, 1);
            }
            else countWords.put(nextWord, countWords.get(nextWord) +1);
        }
    }

    public StringBuilder printLinkedHashMap()
    {
        StringBuilder sbCount = new StringBuilder();
        List<Map.Entry<String,Integer>> list = new ArrayList<>(countWords.entrySet());
        list.sort(Comparator.comparing(Map.Entry::getValue));
        Collections.reverse(list);

        for (Map.Entry<String, Integer> entry : list)
        {
            sbCount.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }

        return sbCount;
    }
}
