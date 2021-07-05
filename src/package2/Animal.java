
package package2;
public abstract class Animal {
	/* NOTE: abstract Methods: Methods which are not having any body 
	 * for e.g = public abstract void Dog();
	 * Cocrete Methods:Methods which are having body
	 * for e.g = public void Cat(){ statement
	 * }
	 */
	public abstract void Dog();
	public abstract void Cat();
	public abstract void Cow();
	
	public static void main(String[] args) {
		Animal1 hg = new Animal1();
		hg.Dog();
		hg.Cat();
		hg.Cow();
	}
}
/*Note: Abstraction means Hiding implementation coding detail 
 *& showing only functionalities to the user.
 */