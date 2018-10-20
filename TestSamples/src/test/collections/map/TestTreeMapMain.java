package test.collections.map;

import java.util.TreeMap;

public class TestTreeMapMain {

	public static void main(String[] args) {
		exploreTreeMap();
	}

	public static void exploreTreeMap() {
		//Natural order sorting
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		treeMap.put("first", 1);
		treeMap.put("second", 1);
		treeMap.put("third", 1);
		treeMap.put("fourth", 1);
		treeMap.put("fifth", 1);

		System.out.println("treeMap : " + treeMap);
		

		//Custom sorting
		TreeMap<String, Integer> treeMap1 = new TreeMap<String, Integer>(new ReverseStringComparator());
		treeMap1.put("first", 1);
		treeMap1.put("second", 1);
		treeMap1.put("third", 1);
		treeMap1.put("fourth", 1);
		treeMap1.put("fifth", 1);

		System.out.println("treeMap1 : " + treeMap1);
		
		//TreeMap implements Navigable map which lets it do nearby searches etc
		System.out.println("treeMap.subMap(\"a\", \"s\") : " + treeMap.subMap("a", true, "so", true));
		System.out.println("treeMap.floorKey(\"z\")) : " + treeMap.floorKey("z"));
		System.out.println("treeMap.floorKey(\"a\")) : " + treeMap.ceilingKey("a"));
		System.out.println("treeMap.firstEntry() : "+treeMap.firstEntry());
		System.out.println("treeMap.lastEntry() : "+treeMap.lastEntry());

	}

}
