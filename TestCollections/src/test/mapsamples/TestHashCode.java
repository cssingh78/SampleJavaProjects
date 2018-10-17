package test.mapsamples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

import test.collections.SchoolComparator;
import test.commons.School;
import test.commons.Student;

public class TestHashCode {

	public static void main(String[] args) {
		testHashMap();
		testHashSet();
		testArrayList();
		testTreeSet();

	}
	
	private static void testHashMap() {
		System.out.println("\n\n********* testHashMap() - start **********");
		HashMap<School, ArrayList<Student>> hashMap = new HashMap<School, ArrayList<Student>>();
		hashMap.put(new School(1001, "My School1"), null);
		System.out.println("-------------------------------");
		hashMap.put(new School(1001, "My School2"), null);
		System.out.println("-------------------------------");
		hashMap.put(new School(1003, "My School3"), null);
		System.out.println("-------------------------------");
		System.out.println("-------------------------------");
		System.out.println("HashMap size : "+hashMap.size());
		System.out.println("HashMap : "+hashMap);
		System.out.println("********* testHashMap() - end **********");
	}
	
	private static void testHashMap() {
		System.out.println("\n\n********* testHashMap() - start **********");
		HashMap<School, ArrayList<Student>> hashMap = new HashMap<School, ArrayList<Student>>();
		hashMap.put(new School(1001, "My School1"), null);
		System.out.println("-------------------------------");
		hashMap.put(new School(1001, "My School2"), null);
		System.out.println("-------------------------------");
		hashMap.put(new School(1003, "My School3"), null);
		System.out.println("-------------------------------");
		System.out.println("-------------------------------");
		System.out.println("HashMap size : "+hashMap.size());
		System.out.println("HashMap : "+hashMap);
		System.out.println("********* testHashMap() - end **********");
	}

	private static void testHashSet() {
		System.out.println("\n\n********* testHashSet() - start **********");
		HashSet<School> hashSet = new HashSet<School>();
		hashSet.add(new School(1001, "My School1"));
		System.out.println("-------------------------------");
		hashSet.add(new School(1001, "My School2"));
		System.out.println("-------------------------------");
		hashSet.add(new School(1003, "My School3"));
		System.out.println("-------------------------------");
		System.out.println("-------------------------------");
		System.out.println("HashMap size : "+hashSet.size());
		System.out.println("HashMap : "+hashSet);
		System.out.println("********* testHashSet() - end **********");
	}

	private static void testArrayList() {
		System.out.println("\n\n********* testArrayList() - start **********");
		ArrayList<School> arrayList = new ArrayList<School>();
		arrayList.add(new School(1001, "My School1"));
		System.out.println("-------------------------------");
		arrayList.add(new School(1001, "My School2"));
		System.out.println("-------------------------------");
		arrayList.add(new School(1003, "My School3"));
		System.out.println("-------------------------------");
		System.out.println("-------------------------------");
		System.out.println("HashMap size : "+arrayList.size());
		System.out.println("HashMap : "+arrayList);
		System.out.println("********* testArrayList() - end **********");
	}
	
	private static void testTreeSet() {
		System.out.println("\n\n********* testTreeSet() - start **********");
		TreeSet<School> treeSet = new TreeSet<School>(new SchoolComparator());
		treeSet.add(new School(1001, "My School1"));
		System.out.println("-------------------------------2");
		treeSet.add(new School(1002, "My School2"));
		System.out.println("-------------------------------3");
		treeSet.add(new School(1003, "My School3"));
		System.out.println("-------------------------------4");
		treeSet.add(new School(1004, "My School4"));
		System.out.println("-------------------------------5");
		treeSet.add(new School(1005, "My School5"));
		System.out.println("-------------------------------6");
		treeSet.add(new School(1006, "My School6"));
		System.out.println("-------------------------------");
		System.out.println("-------------------------------");
		System.out.println("HashMap size : "+treeSet.size());
		System.out.println("HashMap : "+treeSet);
		System.out.println("********* testTreeSet() - end **********");
	}

}
