package frameworkCollection;

import java.util.HashMap; //import the HashMap class

public class HMap {
	public static void main(String[] args) {
//Create a HashMap object called CapitalCity that will store String keys and String values
	HashMap<String, String> CapitalCity = new HashMap<String, String>();
		
	// to add items to it, use the put() method
	CapitalCity.put("India", "Delhi");
	CapitalCity.put("Australia", "Canberra");
	CapitalCity.put("England", "London");
	CapitalCity.put("Germany", "Berlin");
	System.out.println(CapitalCity);
	System.out.println(CapitalCity.size());//To find out how many items there are
    System.out.println(CapitalCity.get("England")); //to add items to it, use get() method
    System.out.println(CapitalCity.remove("Germany")); //to remove item,use remove() method
    CapitalCity.clear(); //To remove all items, use the clear() method:

  
	}

}
