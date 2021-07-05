package exception;
public class NestedTryCatch {
  //Nested try catch Example
	
	public static void main(String[] args) {
		//Outer try block
		try {
			//Inner try block
			try {
				System.out.println("Inside block1");
				int b = 20/5;
				System.out.println(b);
			}
			catch(ArithmeticException e1) {
				System.out.println("Exception:e1");
			}
			//Inner try block2
			try{
				System.out.println("Inside block2");
				int k = 45/0;
				System.out.println(k);
			}
			catch(ArrayIndexOutOfBoundsException e2) {
				System.out.println("Exception: e2");
			}
			catch(ArithmeticException e) {
				System.out.println("Arithmetic Exception");
						}
			catch(Exception e) {
				System.out.println("Inside Parent try catch block");
				System.out.println("Another Exception");
			}
		}
		finally {
			System.out.println("Next Statement");
		}
	}	
}

