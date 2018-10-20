package test.collections.list;

public class CustomObject implements Comparable<CustomObject> {
	private String strAttribute;
	private int intAttribute;
	
	public CustomObject(String strAttribute, int intAttribute) {
		this.strAttribute = strAttribute;
		this.intAttribute = intAttribute;
	}
	
	//Implement comparable to use sort method from Collections. 
	//But note that this can do only one type of sorting at any given point of time
	//For multiple type of sorting, have a separate class implenting comparator interface (compare method)
	public int compareTo(CustomObject object) {
		return this.intAttribute - object.intAttribute; 
	}
	
	public String toString() {
		return strAttribute +":"+intAttribute;
	}

	public String getStrAttribute() {
		return strAttribute;
	}
	
	public void setStrAttribute(String strAttribute) {
		this.strAttribute = strAttribute;
	}
	
	public int getIntAttribute() {
		return intAttribute;
	}
	
	public void setIntAttribute(int intAttribute) {
		this.intAttribute = intAttribute;
	}
	
}
