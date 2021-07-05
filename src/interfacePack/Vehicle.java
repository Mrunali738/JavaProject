package interfacePack;

public class Vehicle implements Moveable{
	public void move() {
		System.out.println("Average Speed is: "+AvgSpeed);
	}

	public static void main(String[] args) {
		Vehicle VC =new Vehicle();
		VC.move();
	}

}
