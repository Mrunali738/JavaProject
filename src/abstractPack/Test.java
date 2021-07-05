package abstractPack;

public class Test {
	String name, gender, city, country;
	void getName(String name) {
		this.name = name;
	}
	void getGender(String gender) {
		this.gender = gender;
	}
	void getCity(String city) {
		this.city = city;
	}
	void getCountry(String country) {
		this.country = country;
	}
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Gender: "+gender);
		System.out.println("City: "+city);
		System.out.println("Country: "+country);
	}
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.getName("Mrunali");
		t1.getGender("Female");
		t1.getCity("Pune");
		t1.getCountry("India");
		t1.display();
	}

}
