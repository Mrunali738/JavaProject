package package2;

public class Animal1 extends Animal {
	@Override
	public void Dog() {
		System.out.println("Sound of Dog is: BHOW BHOW" );
	}
	@Override
	public void Cat() {
		System.out.println("Sound of Cat is: MAW MAW");
	}
	@Override
	public void Cow() {
		System.out.println("Sound of Cow is: HUMBA HUMBA");
	}

	public static void main(String[] args) {
		Animal1 pet = new Animal1();
		pet.Dog();
		pet.Cat();
		pet.Cow();
		}

}
