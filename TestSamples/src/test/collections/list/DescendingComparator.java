package test.collections.list;

import java.util.Comparator;
//Separator comparator class to implement a specific type of comparison. Ex. this implements descending order
//If we need an ascedning order, we will need another class and so on
public class DescendingComparator implements Comparator<CustomObject> {
	public int compare(CustomObject obj1, CustomObject obj2) {
		return Integer.compare(obj2.getIntAttribute(), obj1.getIntAttribute());
	}

}
