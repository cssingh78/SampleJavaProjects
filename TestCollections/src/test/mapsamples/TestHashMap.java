package test.mapsamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import test.commons.Student;

/*
 * HashMap is not synchronised while Hashtable is. 
 * HashMap and other map classes don't implement Iterable interface. 
 * Alternative way to iterate through the entries.
 * 
 */
public class TestHashMap {

	public static void main(String[] args) {
		HashMap<String, Student> hashMap = new HashMap<String, Student>();
		for (int i = 0; i < 5; i++) {
			Student student = Student.generateSampleStudent(i);
			hashMap.put(student.getName(), student);
		}
		
		//System.out.println("Printing entire hashMap: " + hashMap);

		// Iterating through the hashmap entries.
		//System.out.println("Iterating through the hashmap entries using entryset...");
		Set<Map.Entry<String, Student>> set = hashMap.entrySet();
		for (Map.Entry<String, Student> entry : set) {
			//System.out.println(entry.getKey() + entry.getValue());
		}

		// Iterating through the hashmap entries using keyset.
		System.out.println("Iterating through the hashmap entries using keyset...");
		Set<String> set1 = hashMap.keySet();
		for (String key : set1) {
			Student value = hashMap.get(key);
			//System.out.println(key + value);
			System.out.println("Key Hashcode: "+key.hashCode() + ", Value hashcode: "+ value.hashCode());
		}
		Student student1 = new Student();
		Student student2 = new Student();
		
		System.out.println("Student: "+student1 + "Hashcode: "+student1.hashCode());
		System.out.println("Student: "+student2 + "Hashcode: "+student2.hashCode());
		System.out.println(new String("test.commons.Student@55f96302").hashCode());
	}
}
