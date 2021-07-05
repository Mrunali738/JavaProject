package package2;

public class EncapsulationTest extends Employee {

	public static void main(String[] args) {
		
		EncapsulationTest test = new EncapsulationTest();
		test.setEmployeename("Mayuri Bandebuche");
		test.setEmployeeid(38407);
		System.out.println(test.getEmployeename());
		System.out.println(test.getEmployeeid());
		
		Employee obj = new Employee();
		System.out.println(obj.getEmployeename());
		System.out.println(obj.getEmployeeid());	
		
	}
}
 //Note:Encapsulation means Wrapping of Code & Data into a single unit.