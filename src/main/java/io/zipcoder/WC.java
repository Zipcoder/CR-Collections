package io.zipcoder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class WC {
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

    public ArrayList<String> removePunctuation() {
        ArrayList<String> answer = new ArrayList<>();
        while (si.hasNext()) {
            answer.add(si.next().toLowerCase().replaceAll("[^a-zA-Z`]", ""));
        }
        return answer;
    }

    public HashMap<String, Integer> wordCount(){
        ArrayList<String> filtered = removePunctuation();
        HashMap<String, Integer> answer = new HashMap<>();
        for (String word:filtered) {
            if (!answer.containsKey(word)) answer.put(word, 1);
            else answer.put(word, answer.get(word) + 1);
        }
        return answer;
    }
}
