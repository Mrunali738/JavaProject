package abstractPack;

public class AbstractTest extends AbstractDemo {
	
	 public void dispA() {
		System.out.println("I'm overriding abstract method");
	}

	public static void main(String[] args) {
		AbstractTest test = new AbstractTest();
		test.dispA();
		test.disp();
		
		
	}

}
