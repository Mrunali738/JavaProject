package frameworkCollection;

import java.util.HashMap;

public class TestMap {
	public static void main(String[] args) {
//Create a HashMap object called people that will store String keys and Integer values:
	HashMap<String, Integer> Students = new HashMap<String, Integer>();
	
	Students.put("Arvay", 13);
	Students.put("Athansh", 6);
	Students.put("Aharti", 5);
	Students.put("Advira", 4);
	System.out.println(Students);
	for(int i : Students.values()) {  //Print Values
		System.out.println(i);
	}
	for(String k : Students.keySet()) {  //Print Keys
		System.out.println(k);
	}
	for (String j : Students.keySet()) {  //Print Keys and Values
	      System.out.println("Key: " + j + " Values: " +Students.get(j));
	    }


	}

}
