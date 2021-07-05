package frameworkCollection;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lh = new LinkedHashMap<Integer,String>();
		lh.put(10, "India");
		lh.put(34, "India1");
		lh.put(10, "India2");
		lh.put(23, "India3");
		lh.put(56, "India4");
		lh.put(67, "India5");
		lh.put(56, "India6");
		lh.put(10, "India7");
		lh.put(12, "India8");
		System.out.println(lh);
		System.out.println(lh.size());
	}	
		
		
	}


