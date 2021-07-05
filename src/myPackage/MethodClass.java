package myPackage;

public class MethodClass {
	public int multiply(int a, int b, int c) {
		
		//With Returning Value 
		int result = a*b*c;
		return result;
	}
	public static void main(String[] args) {
		
		/* Method is always create before main method
		 * Object is always create after main method
		 * we can call external method(From another class)
		 */
		
		MethodClass obj = new MethodClass();//Create Object
		
		//Call Method
		int z = obj.multiply(20, 15, 35);
		System.out.println(z);
		
	}

}
