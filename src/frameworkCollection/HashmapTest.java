package frameworkCollection;

import java.util.HashMap;
import java.util.Set;

public class HashmapTest {
	public static void main(String[] args) {
		// HashMap<K, V> hm = new HashMap();
		HashMap <Integer, String> hm = new HashMap <Integer, String>();
		hm.put(10, "India5");
		hm.put(34, "India1");
		hm.put(10, "India2");
		hm.put(23, "India3");
		hm.put(56, "India4");
		hm.put(67, "India3");
		hm.put(56, "India6");
		hm.put(10, "India7");
		hm.put(12, "India8");
		System.out.println(hm);
		System.out.println("Size of the HashMap is: "+hm.size());
		hm.remove(67);		//// delete element from hasmap
		System.out.println(hm);
		//hm.remove()
		Set<Integer> keys = hm.keySet(); // Iterating through each key get corresponding value object
		for (Integer key : keys) {
		System.out.println("Value of " + key + " is: " + hm.get(key));
	}	
		
	}

}
