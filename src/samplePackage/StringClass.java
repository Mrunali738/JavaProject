package samplePackage;

public class StringClass {
	public static void main(String[] args) {
		String S = "   Java   ";//Java
		String S0 = "Wellcome to Software Testing";
		String S1 = "Selenium";
		String S2 = "Selenium";
		String S3 = "selenium";
		String S4 = "seleniuma";
		
		  System.out.println(S1==S2);//TRUE System.out.println(S1==S3);//FALSE
		  System.out.println(S1.compareTo(S3));//< 0
		  System.out.println(S1.compareTo(S2));// 0
		  System.out.println(S4.compareTo(S3));//> 0
		  System.out.println(S2.equals(S3));//False
		  System.out.println(S1.equals(S2));//TRUE
		  System.out.println(S1.toLowerCase());//selenium
		  System.out.println(S3.toUpperCase());//SELENIUM
		  System.out.println(S0.substring(12));//Software Testing
		  System.out.println(S0.substring(0, 28));//Wellcome to Software Testing
		  System.out.println(S.trim());
		 
	}

}
