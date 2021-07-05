package myPackage;
import java.util.Scanner;
public class ExceptionHandling {
	
		String s = "abc";
		int a = Integer.parseInt(s);
		//System.out.println(a);
		//NumberFormatException(The wrong formatting of any value.)
		
		public static void main (String [] args) {
			
		// Convert data from String type to Integer
		Scanner scan = new Scanner(System.in);
		System.out.println("Read two Numbers");
		String s1= scan.nextLine();
		String s2= scan.nextLine();

		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		System.out.println(a+b);
		scan.close();
		
		/*String S1 = null;
		try {
			System.out.println(S1.length());
		}
		catch(NullPointerException e){
			System.out.println("It's null pointer Exception");
		}
		*/
		
}
}