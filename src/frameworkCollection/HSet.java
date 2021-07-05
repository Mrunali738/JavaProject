package frameworkCollection;
import java.util.HashSet; 
/* Note: A HashSet is a collection of items where every item is unique,
	     and it is found in the java.util package:*/
public class HSet {
	public static void main(String[] args) {
		
	HashSet<String> Flowers = new HashSet<String>();
	Flowers.add("Rose");
	Flowers.add("Lotus");
	Flowers.add("Sunflower");
	Flowers.add("Lily");
	Flowers.add("Rose");
	Flowers.add("Lotus");
	System.out.println(Flowers);
	System.out.println(Flowers.size());
	if(Flowers.contains("Lily"))
	{
		System.out.println("Set Contains Lily");
	}
	else {
		System.out.println("Set does not Contain Lily");
	}		
	}

}
