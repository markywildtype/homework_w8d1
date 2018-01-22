package example.codeclan.com.wordcount;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 22/01/2018.
 */

public class WordCountTest {

    WordCount wordCount;
    WordCount wordCount2;

    @Before
    public void before(){
        wordCount = new WordCount("I'm not OK, I promise");
        wordCount2 = new WordCount("I'm not OK I promise you really need to listen to me I mean it I'm OK");
    }

    @Test
    public void hasString(){
        assertEquals("I'm not OK, I promise", wordCount.getString());
    }

    @Test
    public void canCountWords(){
        assertEquals(5, wordCount.countWords());
    }

    @Test
    public void canGetIndividualWordInstanceCount(){
        HashMap<String, Integer> words =  wordCount2.countIndividualWordInstances();
        int actual = words.get("OK");
        assertEquals(2, actual);
    }

}
