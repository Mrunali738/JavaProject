package exception;

	//How to throw an already defined exception using throw Keyword 

public class Exception2 {
	static int sum(int num1, int num2) {
		if(num1 == 0) {
			throw new ArithmeticException("First Parameter is not valid");
		}
		else {
			System.out.println("Both Parameters are Valid");
			return num1+num2;
		}
	}
	public static void main(String[] args) {
		int res = sum(0,12);
		//int res = sum(5,10);
		System.out.println(res);
		System.out.println("Continue Next Statements");
		
	}

}
