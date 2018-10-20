package test.thread;

import java.util.HashMap;

public class SampleThread {
	private static HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

	private static synchronized void setAccessCount(String method) {
		int count = 0;
		if (hashMap.get(method) != null) {
			count = hashMap.get(method);
		}
		hashMap.put(method, count + 1);
	}

	public void method() {
		setAccessCount("method");
	}

	public static void staticMethod() {
		setAccessCount("staticMethod");
	}

	public static HashMap<String, Integer> methodAccessCount() {
		return hashMap;
	}

}
