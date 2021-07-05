package package1;

public class Class2 extends Class1 {
	
	public void myMethod() {
		System.out.println("Wellcome to Selenium");
	}
	public static void main(String[] args) {
		Class2 run = new Class2();
		run.myMethod();	
		
		Class1 oop = new Class1();
		oop.myMethod();
	}

}
