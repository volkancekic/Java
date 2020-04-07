
public class AracFactory {
	
	public static Arac getArac(String tip) {
		if(tip.equals("otomobil")) {
			return new Otomobil("mercedes");
		}else if(tip.equals("otobus")) {
			return new Otobus(40);
		}else if(tip.equals("at")) {
			return new At("at");
		}else {
			return null;
		}
				
				
				
	}
}
