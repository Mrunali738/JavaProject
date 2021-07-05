package myPackage;

import java.util.Scanner;

public class IOoperation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Your Name");
		String name = scan.nextLine();
		System.out.println("Your Name is " +name);
		
		System.out.println("Enter Your City");
		String city = scan.next();
		System.out.println("Your City is " +city);
		
		System.out.println("Enter your Blood Group");
		char BG = scan.next().charAt(0);
		System.out.println("Your Blood Group is " +BG);
		
		System.out.println("Enter your Age");
		int age = scan.nextInt();
		System.out.println("Your Age is " +age);
		
		System.out.println("Enter your mobile no.");
		long mb = scan.nextLong();
		System.out.println("Your mobile no. is " +mb);
		
	}

}

