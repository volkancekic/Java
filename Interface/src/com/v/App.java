package com.v;

public class App {
public static void main(String[] args) {
	
	//GeometrikSekil sekil=new Kare(5); alt 2 sat�r yerine alternatif
	Kare kare=new Kare(5);	
	GeometrikSekil sekil=kare;
	
	System.out.println("sekil kare alan�: "+sekil.alan());
	
	
	GeometrikSekil sekil2=new Dikdortgen(3,4);
	System.out.println("sekil2 alan: "+sekil2.alan());
	
	
	Boyanabilir renkliSekil=new Dikdortgen(3,4);
	renkliSekil.boya("k�rm�z�");
	// dikdortgen hem geo sekil hemde boyanabilir gibi davran�yor polimorfizm
	
	/*System.out.println("dikd�rtgen");
	System.out.println("alan: "+dikdortgen.alan());
	System.out.println("cevre: "+dikdortgen.cevre());
	
	
	
	
	System.out.println("kare");
	System.out.println("alan: "+kare.alan());
	System.out.println("cevre: "+kare.cevre());
	*/
	
	
}
	
}
