
package abstractPack;

public class MainClass {
	String name;
	
	void getvalname(String name) {
		this.name = name;
	}
	void display() {
		System.out.println("Hello: "+name);
	}
	public static void main(String[] args) {
		MainClass ms = new MainClass();
		ms.getvalname("Sample codeZ");
		ms.display();
	}

}
