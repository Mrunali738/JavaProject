package package1;

public class ClassA {
	//Non-static class members only can be Inherited in Inheritance oops.
	int a = 10, b = 20;
	public void add() {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		ClassA objA = new ClassA();
		System.out.println(objA.a);
		objA.add();
	}

}
