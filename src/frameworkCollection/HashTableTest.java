package frameworkCollection;

import java.util.Hashtable;

public class HashTableTest {

	public static void main(String[] args) {
		Hashtable Ht = new Hashtable();
		Ht.put(10, "India");
		Ht.put(34, "India1");
		Ht.put(10, "India2");
		Ht.put(23, "India3");
		Ht.put(56, "India4");
		Ht.put(67, "India5");
		Ht.put(56, "India6");
		Ht.put(10, "India7");
		Ht.put(12, "India8");
		System.out.println(Ht);
		System.out.println(Ht.size());
	}

}
