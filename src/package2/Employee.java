package package2;

public class Employee {
	
	private String employeename = "Mrunali Bandebuche";
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	
	private int employeeid = 38409; 
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public static void main(String[] args) {
		Employee objE = new Employee();
		System.out.println(objE.getEmployeename());
		System.out.println(objE.getEmployeeid());

		
	}

}
