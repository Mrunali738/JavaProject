package package1;

public class ClassB extends ClassA{
	//Declare non static variable for inheritance
	int c = 50;
	int d = 100;
	//Declare non static method for inheritance
	public void add() {
		System.out.println(c+d);
	}

	public static void main(String[] args) {
		ClassB objB = new ClassB();
		objB.add();
		System.out.println(objB.d);
	}

}
