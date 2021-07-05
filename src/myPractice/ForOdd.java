package myPractice;

public class ForOdd {

	public static void main(String[] args) {
		//int n= 30;
		int count = 0;
		for (int i = 1; i < 30; i++ ) {
			
			if(i%2!= 0) {
				System.out.println(i);
				 count++;
			}			
		}
		System.out.println(count);

	}

}
