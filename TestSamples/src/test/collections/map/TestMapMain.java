package test.collections.map;

import java.util.HashMap;
import java.util.StringTokenizer;

public class TestMapMain {

	public static void main(String[] args) {
		findWordCount("Find the word count in this string it might not be the easy thing to count the words");
		findWordCountLatest("Find the word count in this string it might not be the easy thing to count the words");

	}

	public static void findWordCount(String str) {
		System.out.println("***findWordCount - start***");
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		//StringTokenizer is a legacy class and is maintained for compatibility reasons.
		//Use string.split
		
		StringTokenizer strToken = new StringTokenizer(str, " ");
		while (strToken.hasMoreTokens()) {
			String word = strToken.nextToken();
			System.out.println("word : " + word);
			Integer count = hashMap.get(word);
			System.out.println("count : " + count);
			if (count == null) {
				count = 0;
			}
			hashMap.put(word, count + 1);
		}
		System.out.println("hashMap : " + hashMap);
		System.out.println("***findWordCount - end***");
	}

	public static void findWordCountLatest(String str) {
		System.out.println("***findWordCountLatest - start***");
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		String[] words = str.split(" ");
		for (String word : words) {
			System.out.println("word : " + word);
			Integer count = hashMap.get(word);
			System.out.println("count : " + count);
			if (count == null) {
				count = 0;
			}
			hashMap.put(word, count + 1);
		}
		System.out.println("hashMap : " + hashMap);
		System.out.println("hashMap.keySet() : " + hashMap.keySet());
		System.out.println("hashMap.values() : " + hashMap.values());
		System.out.println("***findWordCountLatest - end***");
	}
	public static void findCharCount(String str) {
		System.out.println("***findCharCount - start***");
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			System.out.println("c : " + c);
			Integer count = hashMap.get(c);
			System.out.println("count : " + count);
			if (count == null) {
				count = 0;
			}
			hashMap.put(c, count + 1);
		}
		System.out.println("hashMap : " + hashMap);
		System.out.println("***findCharCount - end***");
	}

}
