package exception;

public class DemoException {
	public static void main(String[] args) {
		String str1 = "easystep2buildwebsite";
		try {
			System.out.println(str1.length());
			char c = str1.charAt(25);
			System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("It is StringIndexOutOfBoundsException!!");
		}
		try {			//We can use multiple number of try-catch block
			String str = null;	
			System.out.println(str.length());
		}
		catch(Exception e){
			System.out.println("The Error:" +e);
		}
		System.out.println("I'm out of try-catch block in java");
	}
	
}
