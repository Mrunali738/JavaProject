package frameworkCollection;

import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		
		TreeMap<String, Integer> Tm = new TreeMap <String, Integer>();
		Tm.put("India1", 10);
		Tm.put("India1", 34);
		Tm.put("India2", 10);
		Tm.put("India3", 23);
		Tm.put("India4", 56);
		Tm.put("India5", 67);
		System.out.println(Tm);
		TreeMap<String, Integer> Tm1 = new TreeMap<>(); //for copy Map content to another HashMap
		Tm1.put("India6", 35);
		Tm1.put("India7", 12);
		Tm1.put("India8", 15);
		Tm.putAll(Tm1);
		System.out.println(Tm);
	}

}
