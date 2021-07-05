package samplePackage;

public class MultiDiArray {

	public static void main(String[] args) {
		
		String [] Company = {"TCS","Wipro","IBM"};
		System.out.println(Company[1]);
		for(String str: Company) {
			System.out.println(str);
		}
		int [][] array = {{1,2,3,4}, {5,6,7,8,9}};
		System.out.println(array[0][1]);
		System.out.println(array[1][3]);
		//int i =0; int j= 4;
		for(int i=0; i<array.length; i++) {
		for(int j=0; j<array[i].length; j++) {
			System.out.println(array[i][j]);
		}
		}
		}

}
