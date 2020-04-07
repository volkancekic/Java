package com.v;

public class App {
public static void main(String[] args) {
	
	//GeometrikSekil sekil=new Kare(5); alt 2 satýr yerine alternatif
	Kare kare=new Kare(5);	
	GeometrikSekil sekil=kare;
	
	System.out.println("sekil kare alaný: "+sekil.alan());
	
	
	GeometrikSekil sekil2=new Dikdortgen(3,4);
	System.out.println("sekil2 alan: "+sekil2.alan());
	
	
	Boyanabilir renkliSekil=new Dikdortgen(3,4);
	renkliSekil.boya("kýrmýzý");
	// dikdortgen hem geo sekil hemde boyanabilir gibi davranýyor polimorfizm
	
	/*System.out.println("dikdörtgen");
	System.out.println("alan: "+dikdortgen.alan());
	System.out.println("cevre: "+dikdortgen.cevre());
	
	
	
	
	System.out.println("kare");
	System.out.println("alan: "+kare.alan());
	System.out.println("cevre: "+kare.cevre());
	*/
	
	
}
	
}
