package exception;

public class EmployeeTest {
	static void employeeTest(int age)throws MyOwnException{
		if(age<0) {
			throw new MyOwnException("Age can't be less than Zero");
		}
		else {
			System.out.println("Input is valid!!");
	}
	}
	public static void main(String[] args) {
		try {
			employeeTest(-2);
		}
		catch(MyOwnException e){
			e.printStackTrace();	
		}
	}

}
