package test.collections.queue;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {
	public int compare (String obj1, String obj2) {
		return obj1.length() - obj2.length();
	}

}
