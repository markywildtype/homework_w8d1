package example.codeclan.com.wordcount;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by user on 22/01/2018.
 */


public class WordCount {

    String string;

    public WordCount(String string){
        this.string = string;
    }


    public String getString() {
        return this.string;
    }

    public int countWords() {
        String[] wordArray = this.string.split(" ");
        return wordArray.length;
    }

    public HashMap<String, Integer> countIndividualWordInstances(){
        String[] wordArray = this.string.split(" ");
        HashMap<String, Integer> wordOccurrence = new HashMap<>();
        for(String word : wordArray){
            if(!wordOccurrence.containsKey(word)){
                wordOccurrence.put(word, 1);
            } else {
                wordOccurrence.put(word, wordOccurrence.get(word) + 1);
            }
        } return wordOccurrence;
    }



}