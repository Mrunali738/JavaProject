package exception;

	//Using “throw keyword” we can throw checked,
	//unchecked and user -defined exceptions.
public class ThrowExample {
	
	static void checkEligibility(int StuAge, int StuWeight) {
		if(StuAge<12 && StuWeight<40) {
	throw new ArithmeticException("Student is not Eligible for Registration");
		}
	else {
		System.out.println("Entries Valid!");
		}
		}
	public static void main(String[] args) {
		System.out.println("Wellcome to the Registration Process!!");
		checkEligibility(10,39);
		//checkEligibility(15,45);
		System.out.println("Have a nice day");
		
	}

}
