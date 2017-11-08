package kz.example;

import java.util.Map;
import java.util.HashMap;
import java.util.StringTokenizer;

public class WordCounter {

    public Map<String, Integer> countWords(String content) {
    	Map<String, Integer> result = new HashMap<String, Integer>();
    	StringTokenizer tokenizer = new StringTokenizer(content);
    	while (tokenizer.hasMoreTokens()) {
    		String word = tokenizer.nextToken();
    		int count = 0;
    		if (result.containsKey(word)) {
    			count = result.get(word);
    		}
			result.put(word, count+1);
    	}
    	return result;
    }

}
