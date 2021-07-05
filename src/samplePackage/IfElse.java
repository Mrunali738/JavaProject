package samplePackage;

public class IfElse {
	public static void main(String[] args) {
		int a = 50;
		int b = 20;
		// This is if Example -Single Condition(Positive and Negative Conditions)

		if(a>b) {    
			 System.out.println("A is a big number");
		 }
		 if(!(a>b)) {
			 System.out.println("B is a small number");
		 }
		// This is if else Example
		if(a<b) {
			System.out.println("a is less than b");
		}
		else {
			System.out.println("b is greater than a");
		}		  
	}
}
