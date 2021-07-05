package interfacePack;

public class TestInterface implements Interface2nd {
	
	public void FirstMethod() {
		System.out.println("Implemented FirstMethod");
	}
	public void SecondMethod() {
		System.out.println("Implemented SecondMethod");
	}

	public static void main(String[] args) {
		
		TestInterface TI = new TestInterface();
		TI.FirstMethod();
		TI.SecondMethod();
	}

}
