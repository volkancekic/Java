package com.sahis;

public class App {

	public static void main(String[] args) {
		
		Sahis kisi1=new Sahis("ali","can",123456789L,'E');
		System.out.println(kisi1.toString());
		System.out.println(kisi1);
		
		Personel p1=new Personel("ali","cvb",1232536L,'E',111,"Muhasebe");
		System.out.println(p1.toString());
		
		
		
		
		
		
		
		Musteri m1=new Musteri("abcbank-1");
		Sahis herkisi;
		herkisi=new Personel("ahmet","celik",111,'E',112,"idari iþler");
		herkisi=p1;
		herkisi=new Musteri("abcdefg");
		System.out.println(((Musteri)herkisi).getHesap()); //dönüþüm ile yazdýrabiliriz
		System.out.println(((Personel)herkisi).getDepartman()); //olmayan þey yazdýrdýk //mercedes is bmw diyemeyiz.
		
		
				
	}

}
