package package1;

public class ClassX {
    protected int a = 2;
	protected int b = 3;
	protected int c = 4;
	protected void multiply() {
		System.out.println(a*b*c);
	}
	public static void main(String[] args) {
		ClassX obj = new ClassX();
		obj.multiply();
		System.out.println(obj.b);
	}

}
