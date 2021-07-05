package package1;

public class ClassC extends ClassB {
	int x = 5;
	int y = 7;
	public void add() {
	System.out.println(x+y);
	}
	public static void main(String[] args) {
		ClassC objC = new ClassC();
		System.out.println(objC.x);
		objC.add();
		
		ClassB objB = new ClassB();
	System.out.println(objB.c);
	objB.add();	
	}

}
