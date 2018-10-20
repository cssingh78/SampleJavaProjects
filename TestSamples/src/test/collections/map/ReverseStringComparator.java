package test.collections.map;

import java.util.Comparator;

public class ReverseStringComparator implements Comparator<String> {
	public int compare(String obj1, String obj2) {
		return obj2.compareTo(obj1);
	}
}
