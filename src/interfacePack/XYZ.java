package interfacePack;

public class XYZ implements MyInterface {
	public void myMethod1() {
		System.out.println("Implemented method1");
	}
	public void myMethod2() {
		System.out.println("Implemented method2");
	}

	public static void main(String[] args) {
		MyInterface Mi = new XYZ();
		Mi.myMethod1();
		
	}

}
