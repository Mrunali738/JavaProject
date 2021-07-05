package myPackage;

public class TryCatchBlock {

	public static void main(String[] args) {
		int a = 20;
		int b = 0;
		String [] fruit = new String[4];
		try{
			int c = a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println("Divide by zero is Error");
		}
		try {
			fruit[4] = "Orange";
			System.out.println(fruit[4]);
		}
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("Array Index is out of Bounds");
		}
		System.out.println("Hello Java");
	}

	}


