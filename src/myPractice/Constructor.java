package myPractice;

public class Constructor {
	String name;
	Constructor(){
		this.name = "javabykiran";  //This represents current class object 
									//Can be applied to variable, constructor and method
	}
	public static void main(String[] args) {
		Constructor obj = new Constructor();
		System.out.println(obj.name);

	}

}
/*
 Note:1)Constructor is a special method whose name is same as that of class name.
      2)Constructor should not have any return type, not even void.
      3)Constructor will be invoked by the JVM automatically whenever you create the object.
 */