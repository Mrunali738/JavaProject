package myPractice;
public class Demo {
		int value1;
		int value2;
		Demo(){ //Simple Constructor
			value1 = 10;
			value2 = 20;
			System.out.println("Inside 1st Constructor");
		}
		//Override Constructor
		Demo(int a){
			value1 = a;
			System.out.println("Inside 2nd Constructor");
		}
		Demo(int a, int b){
			value1 = a;
			value2 = b;
			System.out.println("Inside 3rd Constructor");
		}
		public void display() {
			System.out.println("value1 == " +value1);
			System.out.println("value2 == " +value2);
		}
		public static void main(String[] args) {
			Demo ob = new Demo();
			Demo ob1 = new Demo(12);
			Demo ob2 = new Demo(15,25);
			ob.display();
			ob1.display();
			ob2.display();
	}

}
