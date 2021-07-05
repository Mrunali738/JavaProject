package frameworkCollection;

import java.util.LinkedList;

public class ListLinked {
	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		list.add("Python");
		list.add("Pearl");
		list.add("Ruby");
		list.add("C++");
	// get elements by index
	System.out.println("Element at Index 1: "+list.get(2));
	System.out.println("Does list contains JAVA: "+list.contains("Java"));
	System.out.println(list);
	System.out.println("Is LinkedList Empty: "+list.isEmpty());
	System.out.println("Index of Pearl is: "+list.indexOf("Pearl"));
	System.out.println(list.size());
	for(String y : list)
	  {
		  System.out.println(y);
		  }
	}

}
