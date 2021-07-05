package samplePackage;

public class ConditionClass {
	public static void main(String[] args) {
		int a = 10, b = 7, c = 50, d = 30;
		if(a>b) {
		if(a>c) {
		if(a>d) {
			System.out.println("a is Greater number");
		}
		else {
			System.out.println("d is Greater number");
		}
		}
		else {
			System.out.println("c is Greater number");
		}
		}
		else {
			System.out.println("b is Greater number");
		}
	    }
	}


