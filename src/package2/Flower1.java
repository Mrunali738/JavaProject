package package2;
public class Flower1 implements Flower {

	@Override
	public void Rose() {
		System.out.println("The color of Rose is Red");		
	}
	@Override
	public void Sunflower() {
		System.out.println("The color of Sunflower is Yellow");		
	}
	@Override
	public void Orchid() {
		System.out.println("The color of Orchid is Violet");
		}
	public static void main(String[] args) {
		Flower1 obj = new Flower1();
		obj.Rose();
		obj.Sunflower();
		obj.Orchid();
	}

}
/* Note:From Class(Concrete class or Abstract Class) to Class 
 * we use “extends”
 * keyword From Interface to Class we use “implements” keyword
 */

