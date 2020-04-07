
public class Cat extends Pet{

	private String type;
	private String name;
	private double price;
	
	public Cat(char gender, int age, String type, String name, double price) {
		super(gender, age);
		this.type = type;
		this.name = name;
		this.price = price;
	}	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "\nCat --> Type=" + type + ", Name=" + name +  ", Gender=" + getGender()
		+ ", Age=" + getAge() + ", Price=" + price;
	}
	
	
	
}
