package frameworkCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		
	ArrayList <Integer> aa = new ArrayList();
		aa.add(23);
		aa.add(78);
		aa.add(23);
		aa.add(12);
		aa.add(11);
		aa.add(56);
		System.out.println(aa.size());
		System.out.println("Before Actual ArrayList: "+aa);
		  
		  //to add all elements of a list to ArrayList
		  List<Integer> list = new ArrayList();
			list.add(12);
			list.add(78);
			aa.addAll(list);
		//System.out.println("After Copy ArrayList: "+aa);
		//to find does ArrayList contains all list elements or not
		System.out.println("Does ArrayList Contains all list elements: "+aa.containsAll(list));
		list.add(75);
		System.out.println("Does ArrayList Contains all list elements: "+aa.containsAll(list));
	}

}
