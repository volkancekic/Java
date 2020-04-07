
public class Pet {
	
	private char gender;
	private int age;
	
	public Pet(char gender, int age) {
		super();
		this.gender = gender;
		this.age = age;
	}	
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void sound(String sound) {
		System.out.println("Pet sounds "+sound);
	}
	public void eat(String food) {
		System.out.println("Pet eats "+food);
	}	
}
