package frameworkCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListArray {
	public static void main(String[] args) {
   
		ArrayList<String> Cars = new ArrayList<String>();
		Cars.add("BMW");
		Cars.add("Ford");
		Cars.add("Audi");
		Cars.add("Volvo");
		System.out.println(Cars);
		for(int i=0; i<Cars.size(); i++) {
		System.out.println(Cars.get(i));
		}     
		//OR >>> program to read all elements in ArrayList by using an iterator
		Iterator<String> itr = Cars.iterator(); 
		while(itr.hasNext()){
			System.out.println(itr.next());
			}
		}
	}


