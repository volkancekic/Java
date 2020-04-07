package com.Enums;

public class EnumApp {

	public static void main(String[] args) {
	Animal dog=new Animal(1, PetType.DOG, 2, "jo");
	Animal cat=new Animal(2, PetType.CAT, 3, "hellokity");
	Animal bird=new Animal(2, PetType.CAT, 3, "pasa");
	
	bird.setTip(PetType.BIRD);
	System.out.println(dog);
	System.out.println(bird);
	
	for(PetType pt:PetType.values()) { //Enum deðerleri listesi
		System.out.println(pt);
	}
	

	}

}
