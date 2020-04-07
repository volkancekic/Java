
public class Bird extends Pet implements LivesInCage{

	private String type;
	private String name;
	private double price;
	private int minCageSize;
	
	public Bird(char gender, int age, String type, String name, double price, int minCageSize) {
		super(gender, age);
		this.type = type;
		this.name = name;
		this.price = price;
		this.minCageSize = minCageSize;
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
	public int getMinCageSize() {
		return minCageSize;
	}
	public void setMinCageSize(int minCageSize) {
		this.minCageSize = minCageSize;
	}
	@Override
	public int getMinCageSize(int minCageSize) {
		
		return (int)Math.pow(minCageSize, 3);
	}
	@Override
	public String toString() {
		return "\nBird --> Type=" + getType() + ", Name=" + getName() +", Gender=" + getGender() + ", Age=" + getAge()+
				", Min Cage Size=" + getMinCageSize()+", Price=" + getPrice();
	}
	
	
	
}
