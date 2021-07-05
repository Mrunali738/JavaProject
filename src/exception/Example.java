package exception;

public class Example {
//A try block can have any number of catch blocks
	
	public static void main(String[] args) {
		try {
			int num = Integer.parseInt("XYZ");
			System.out.println("First Statement in try block");
		}
		catch(NumberFormatException e){
			System.out.println("Warning: NumberFormat Exception Occurred");
		}
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("Warning: ArrayIndexOuTOfBoundsException");
		}
		catch(Exception e2) {
			System.out.println("Warning: Some other exception");
		}
		System.out.println("Hello");	
	}

}
