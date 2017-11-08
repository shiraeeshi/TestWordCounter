package kz.example;

import org.junit.Test;
import java.util.Map;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class WordCounterTest {

    @Test
    public void testCountsWord() {
    	String content = "abc def ghi";
    	Map<String, Integer> result = new WordCounter().countWords(content);
    	assertTrue(result.containsKey("abc"));
    	assertEquals(1, (int)result.get("abc"));
    }

    @Test
    public void testCountsAllWords() {
    	String content = "abc def ghi";
    	Map<String, Integer> result = new WordCounter().countWords(content);
    	assertTrue(result.containsKey("abc"));
    	assertTrue(result.containsKey("def"));
    	assertTrue(result.containsKey("ghi"));
    	assertEquals(1, (int)result.get("abc"));
    	assertEquals(1, (int)result.get("def"));
    	assertEquals(1, (int)result.get("ghi"));
    }

    @Test
    public void testCountsWordTwice() {
    	String content = "abc def ghi abc";
    	Map<String, Integer> result = new WordCounter().countWords(content);
    	assertTrue(result.containsKey("abc"));
    	assertEquals(2, (int)result.get("abc"));
    }

}
