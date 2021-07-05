package frameworkCollection;

import java.util.List;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector <Integer> a1 = new Vector <Integer>();
		a1.add(23);
		a1.add(78);
		a1.add(23);
		a1.add(12);
		a1.add(11);
		a1.add(9);
		a1.add(56);
		System.out.println("Actual Vector is : "+a1);
		for(int i=0; i<a1.size(); i++) {
			int y = a1.get(i);
			System.out.println(y);
		}
		
		// this function delete all items from Vector
		a1.clear();
		System.out.println("After Clear Vector is : "+a1);

	}

}
