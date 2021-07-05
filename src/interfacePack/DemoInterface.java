package interfacePack;

public class DemoInterface implements InterfaceAA, InterfaceAB {
	public void Method()
	{
		System.out.println("Multiple inheritance example by using interface");
	}

	public static void main(String[] args) {
		DemoInterface demo = new DemoInterface();
		demo.Method();
		
		
	}

}
