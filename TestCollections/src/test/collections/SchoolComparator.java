package test.collections;

import java.util.Comparator;

import test.commons.School;

public class SchoolComparator implements Comparator<School> {
	public int compare(School str1, School str2) {
		System.out.println("SchoolComparator -> compare(Object, Object) : "+str1+" - "+str2);
		return str2.getId() - str1.getId();
	}
/*	public int compare(Object obj1, Object obj2) {
		System.out.println("SchoolComparator -> compare(Object, Object)");
		School str1 = (School)obj1;
		School str2 = (School)obj2;
		
		return str2.getId() - str1.getId();
	}*/
}
