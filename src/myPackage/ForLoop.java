package myPackage;

public class ForLoop {
	public static void main(String[] args) {
		//Print 1 to 10 Numbers
		for(int i=1; i<=10; i++) {
			if((i!=4) && (i!=7))   //except 4th number and 7th Number
			System.out.println(i);
		}
		//Print 10 to 1 Numbers
		for(int k=10; k>=1; k--) {
			System.out.println(k);
		}
		//Enhanced For Loop(It Executes all elements in an array)
		String [] Languages = {"Java","Python","Ruby","PHP"};
		for (String lang:Languages) {
			System.out.println(lang);
		}
		
	}

}
