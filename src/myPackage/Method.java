package myPackage;

public class Method {
	//Without Returning Value

		//Create Method
		public void studentRank(int marks){
		if (marks >= 600){
		System.out.println("Rank A");
		}
		else if (marks >= 500){
		System.out.println("Rank B");
		}
		else
		System.out.println("Rank C");
		}
		public static void main (String [] args){

		//Call method by invoking object
		Method obj = new Method();
		obj.studentRank(600);
		}
		}

	


