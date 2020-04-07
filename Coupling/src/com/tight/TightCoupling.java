package com.tight;

public class TightCoupling {

	public static void main(String[] args) {
		
		Otomobil oto1=new Otomobil("mercedes");
		oto1.hizlan(20);
		oto1.hizlan(10);
		
		System.out.println("");
		
		Otobus otb1=new Otobus(27);
		otb1.hizlan(10);
		otb1.hizlan(5);
		
		
		
		
	}

}
