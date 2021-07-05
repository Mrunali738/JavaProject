package package1;

//This is example of Compile Time Polymorphism(Method Overloading)
public class MethodOverloading {
	public void divide(int a, int b) {
		System.out.println(a/b);
	}
	public void multiply(int x, int y, int z) {
		System.out.println(x*y*z);
	}
	public void add(float c, float d, float f) {
		System.out.println(c+d+f);
	}
	public void subtract(double j, double k) {
		System.out.println(j-k);
	}
	public static void main(String[] args) {
		MethodOverloading poly = new MethodOverloading();
		poly.divide(20, 5);
		poly.multiply(15, 20, 35);
		poly.add(5.1f, 3.2f, 1.2f);
		poly.subtract(2.342, 1.241);
		
	}

}
