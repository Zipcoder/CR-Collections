package io.zipcoder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedMap;

public class WC {

    private Iterator<String> si;


    public WC(String fileName) {
        try {
            this.si = new Scanner(new FileReader("text.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(fileName + " Does Not Exist");
            System.exit(-1);
        }
    }

    public WC(Iterator<String> si) {

        this.si = si;
    }


    public int wordCount(){
    int count = 0;

    while(si.hasNext()) {
        String[] words = si.next().split(" ");
        count += words.length;
    }
    return count;

    }

//    public SortedMap<String, Integer> wordCount() {
//        while(si.hasNext()) {
//            si.next().replaceAll("\\W", " ").toUpperCase();
//            uniqueWordMap =
//            for (String uniqueWord : "text.txt") {
//            {
//                //if word is already present in wordCountMap, updating its count
//                if(si.containsKey(uniqueWord))
//                {
//                    wordCountMap.put(uniqueWord, wordCountMap.get(uniqueWord)+1);
//                }
//
//                //otherwise inserting the word as key and 1 as its value
//                else
//                {
//                    wordCountMap.put(uniqueWord, 1);
//                }
//            }
//
//            //Reading next line into currentLine
//
//            currentLine = reader.readLine();
//        }
//
//        //Getting the most repeated word and its occurrence
//
//        String mostRepeatedWord = null;
//
//        int count = 0;
//
//        Set<Entry<String, Integer>> entrySet = wordCountMap.entrySet();
//
//        for (Entry<String, Integer> entry : entrySet)
//        {
//            if(entry.getValue() > count)
//            {
//                mostRepeatedWord = entry.getKey();
//
//                count = entry.getValue();
//            }
//        }
//
//        System.out.println("The most repeated word in input file is : "+mostRepeatedWord);
//
//        System.out.println("Number Of Occurrences : "+count);
//    }
//        catch (IOException e)
//    {
//        e.printStackTrace();
//    }
//        finally
//    {
//        try
//        {
//            reader.close();           //Closing the reader
//        }
//        catch (IOException e)
//        {
//            e.printStackTrace();
//        }
//    }

}
