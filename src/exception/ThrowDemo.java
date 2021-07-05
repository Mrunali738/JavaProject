package exception;

import java.io.IOException;

public class ThrowDemo {
	
	void mymethod(int num)throws IOException, ClassNotFoundException{
		if(num==1) {
			throw new IOException("ExceptionMessage1");
		}
		else {
			throw new ClassNotFoundException("ExceptionMessage2");
	}
	}
	public static void main(String[] args) { // Client or Customer
		try {
			ThrowDemo obj = new ThrowDemo();
			obj.mymethod(1);
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
			

	}

}
