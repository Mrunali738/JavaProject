package myPractice;

import java.util.Scanner;

public class TableClass {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  //Scanner class allows user to take input from console.
		System.out.println("Enter a Number");
		int n = sc.nextInt();
				for (int i = 1; i <= 10; i++) {
			System.out.println(n+ "*" +i+ "=" +(i*n));
		}
		
		
		
	}

}
