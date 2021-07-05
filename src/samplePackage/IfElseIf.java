package samplePackage;

public class IfElseIf {

	public static void main(String[] args) {
		int P = 45;
		 int Q = 30;
		 int R = 0;

		 if ((R >= 1) && (R <= 100)){ //(It is also Compound Condition)
			 System.out.println("R is a Small Number");
			 }
			 else if ((R > 100) && (R <= 1000)){
			 System.out.println("R is a Medium Number");
			 }
			 else if ((R > 1000) && (R <= 10000)) {
				 System.out.println("R is a Large Number");
			 }
			 else {
				 System.out.println("R either Zero or Negative number");
			 }
	}
	}


