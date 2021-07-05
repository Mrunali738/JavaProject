package package2;
import package1.ClassX;

public class ClassZ {//(extends ClassX) 
	  int p = 20; 
	  int q = 10; 
	  int r = 30; 
	  public void multiply() {
	  System.out.println(p*q*r); 
	  }
	public static void main(String[] args) {
		ClassZ obj1 = new ClassZ();
		System.out.println(obj1.q);
		obj1.multiply();
		/*ClassX obj = new ClassX();
		System.out.println(obj.a);
		obj.multiply();*/
	}
}
/*NOTE: In Inheritance we can import package class in another package class
	for extends  class when it public but when class is privated this class 
	cannot inherited.*/
		