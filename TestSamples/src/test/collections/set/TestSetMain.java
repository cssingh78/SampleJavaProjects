package test.collections.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestSetMain {

	public static void main(String[] args) {
		testHashSet();
		testLinkedHashSet();
		testTreeSet();
		
	}
	
	public static void testHashSet() {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Test9");
		hashSet.add("Test2");
		hashSet.add("Test3");
		hashSet.add("Test4");
		hashSet.add("Test5");
		System.out.println("hashSet : "+ hashSet);
	}

	public static void testLinkedHashSet() {
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("Test9");
		linkedHashSet.add("Test2");
		linkedHashSet.add("Test3");
		linkedHashSet.add("Test4");
		linkedHashSet.add("Test5");
		System.out.println("linkedHashSet : "+ linkedHashSet);
		
	}

	public static void testTreeSet() {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("Test9");
		treeSet.add("Test2");
		treeSet.add("Test3");
		treeSet.add("Test4");
		treeSet.add("Test5");
		System.out.println("treeSet : "+ treeSet);
		System.out.println("treeSet.headSet(\"Test4\") : "+ treeSet.headSet("Test4", true));
		System.out.println("treeSet.headSet(\"Test4\") : "+ treeSet.tailSet("Test4", true));
	}
}
