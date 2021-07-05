package frameworkCollection;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		// Program for to copy ArrayList into array

     ArrayList<String> arr1 = new ArrayList<String>();
     arr1.add("Pune");
     arr1.add("Mumbai");
     arr1.add("Delhi");
     arr1.add("Nagpur");
     System.out.println("Actual ArrayList is: "+arr1);
     String [] strArr = new String[arr1.size()];
     arr1.toArray(strArr);
     System.out.println("Created Array Content is: ");
     for(String str : strArr) {
    	 System.out.println(str);
     }
	}

}
