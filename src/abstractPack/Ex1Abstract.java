package abstractPack;

public class Ex1Abstract extends ExaAbstract {
	int x,y,z;
	
	void get(int a, int b) {
		x = a;
		y = b;
	}
	void add() {
		z = x+y;
	}
	void display() {
		System.out.println("The addition is: "+z);
	}

	public static void main(String[] args) {
		Ex1Abstract sub = new Ex1Abstract();
		sub.get(10, 15);
		sub.add();
		sub.display();
	}

}
