package kz.example;

import java.util.Map;
import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class WordCounterApplication {
    public static void main(String[] args) throws java.io.FileNotFoundException {
    	if (args.length < 2 || !isNotEmpty(args[0]) || !isNotEmpty(args[1])) {
    		System.err.println("Usage: WordCount <input-file-path> <output-file-path>\nor\nWordCount <input-file-path> console");
    		System.exit(1);
    	}
    	String inputFilePath = args[0];
    	String content = fileContents(inputFilePath);
    	Map<String, Integer> result = new WordCounter().countWords(content);
    	String destination = args[1];
    	if ("console".equals(destination)) {
    		writeToConsole(result);
    	} else {
    		writeToFile(result, destination);
    	}
    }

    private static boolean isNotEmpty(String str) {
    	return str != null && !str.isEmpty();
    }

	private static String fileContents(String filePath) throws java.io.FileNotFoundException {
		return new Scanner(new File(filePath)).useDelimiter("\\Z").next();
	}
    private static void writeToConsole(Map<String, Integer> wordsCount) {
    	writeToPrintStream(wordsCount, System.out);
    }
    private static void writeToFile(Map<String, Integer> wordsCount, String filePath) throws java.io.FileNotFoundException {
    	try (PrintStream out = new PrintStream(new File(filePath))) {
    		writeToPrintStream(wordsCount, out);
		}
    }
    private static void writeToPrintStream(Map<String, Integer> wordsCount, PrintStream out) {
    	for (Map.Entry<String, Integer> entry: wordsCount.entrySet()) {
    		out.println(String.format("%s: %d", entry.getKey(), entry.getValue()));
    	}
    }
}
