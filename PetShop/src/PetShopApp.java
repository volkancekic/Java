
public class PetShopApp {

	public static void main(String[] args) {
		
		Dog dog1=new Dog('E', 1, "Kangal", "Yýldýz", 1500);
		System.out.println(dog1);
		dog1.eat("beef");
		dog1.sound("hav");		
		
		Cat cat1=new Cat('D', 2, "Ankara Kedisi", "Pamuk", 75);
		System.out.println(cat1);
		cat1.eat("dried cat food");
		cat1.sound("miyav");
		
		Bird bird1=new Bird('E', 3, "Serçe", "mavi", 59, 2);
		System.out.println(bird1);
		bird1.eat("bird food");
		System.out.println("Get Min Cage Size: "+bird1.getMinCageSize(bird1.getMinCageSize()));
		bird1.sound("cik");
		
		tellPetType(dog1,cat1,bird1);

	}
	public static void tellPetType(Pet p,Pet p2,Pet p3) {		
		
		System.out.println("\nPet class: "+p.getClass().getName()+"  ,Pet gender: "+p.getGender()+
				" ,Pet name: "+ ((Dog)p).getName());
		System.out.println("Pet class: "+p2.getClass().getName()+"  ,Pet gender: "+p2.getGender()+
				" ,Pet name: "+ ((Cat)p2).getName());
		System.out.println("Pet class: "+p3.getClass().getName()+" ,Pet gender: "+p3.getGender()+
				" ,Pet name: "+ ((Bird)p3).getName());
	}

}
