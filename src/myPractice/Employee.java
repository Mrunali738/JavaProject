package myPractice;

public class Employee {
		int empId;
		String empName;
		
		//parameterized constructor with two parameters
		Employee(int id, String name){
			this.empId = id;
			this.empName = name;
		}
		void Info() {
			System.out.println("Id: "+empId+" Name: " +empName);
		}
		
		public static void main(String[] args) {
			Employee emp = new Employee(58, "Mrunali");
			Employee emp1 = new Employee(60, "Mayuri");
			emp.Info();
			emp1.Info();
	}

}
