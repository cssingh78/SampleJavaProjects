package test.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestListMain {

	public static void main(String[] args) {
		//testListMethodsWithStrings();
		testListMethodsWithCustomObjects();
	}

	public static void testListMethodsWithStrings() {
		//String[] strArray = new String[] {"Mango", "Apple", "Guava", "Melon", "Banana"};
		
		List <String> strList = new ArrayList<String>();
		//Object will be added to the end of the list
		strList.add("Orange");
		strList.add("Apple");
		strList.add("Guava");
		strList.add("Pears");
		strList.add("Coconut");
		
		
		//Object will be added at the specified index
		strList.add(1, "Mango");
		
		//Object at specified index will be removed
		strList.remove(1);
		strList.add("Banana");
		
		//Specified object will be removed
		strList.remove("Mango");
		
		System.out.println("strList: " + strList);
		System.out.println("strList.indexOf(\"Guava\": " + strList.indexOf("Guava"));
		System.out.println("strList.get(2): " + strList.get(2));
		Collections.sort(strList);
		System.out.println("strList: " + strList);
		System.out.println("strList.indexOf(\"Guava\": " + strList.indexOf("Guava"));
		System.out.println("strList.get(2): " + strList.get(2));

		
		List <Integer> intList = new ArrayList<Integer>();
		intList.add(101);
		intList.add(102);
		intList.add(103);
		intList.add(1, new Integer(105));
		
		System.out.println("intList: " + intList);
		System.out.println("intList: " + intList);
		

	}

	public static void testListMethodsWithCustomObjects() {
		List<CustomObject> list = new ArrayList<CustomObject>();
		list.add(new CustomObject("String1", 101));
		list.add(new CustomObject("String2", 102));
		list.add(new CustomObject("String3", 103));
		list.add(new CustomObject("String4", 104));
		list.add(new CustomObject("String1", 101));
		list.add(new CustomObject("String5", 105));
		list.add(new CustomObject("String6", 106));
		
		System.out.println("list: " + list);
		Collections.sort(list);
		System.out.println("list: " + list);
		Collections.sort(list, new DescendingComparator());
		System.out.println("list: " + list);
	
		
	}
	
}
