
public class LoseCoupling {

	public static void main(String[] args) {
		
		//Arac araba=new Otomobil("mercedes");
		Arac araba=AracFactory.getArac("otomobil");
		araba.hizlan(20);
		araba.hizlan(10);
		
		System.out.println("");
		araba=AracFactory.getArac("at");
		araba.hizlan(50);
		araba.yavasla(10);
		
		
		
		
		
		
	}

}
