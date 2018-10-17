package test.commons;

import java.util.Comparator;

public class School implements Comparator <School>{

	private int id;
	private String name;
	
	/**
	 * While used in collections, first hashCode method is called for comparison
	 * If it returns distinct hashcode, isEquals is not called
	 * If it returns a matching hascode, isEquals is called for final confirmation
	 */
	public int hashCode() {
		System.out.println("Inside School hashCode()");
		return id;
	}
	
	/**
	 * Can be called explicitly for comparison
	 * Called from collection classes during comparison, after calling hasCode()
	 * Both hashCode() and equals() should be implemented when an object has to be used in Collections
	 */
	public boolean equals(Object obj) {
		System.out.println("Inside School equals()");
		if (this == obj)
			return true;

		boolean isEqual = false;
		if (obj !=null && obj instanceof School) {
			School school = (School) obj;
			isEqual = (school.id==this.id);
		}
		return isEqual;
	}
	
	/**
	 * 
	 */
	public String toString() {
		return String.join(", ", "Id:" + this.id, "name:" + this.name);
	}
	/**
	 * 
	 */
	public School() {
	
	}

	/**
	 * 
	 * @param id
	 * @param name
	 */
	public School(int id, String name) {
		this.id=id;
		this.name=name;
	}

	/**
	 * 
	 */
	public int compare(School school1, School school2) {
		return school2.id - school1.id;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
