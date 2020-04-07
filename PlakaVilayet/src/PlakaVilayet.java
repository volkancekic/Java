import java.util.HashMap;
import java.util.Scanner;

public class PlakaVilayet {

	public static void main(String[] args) {
	
		HashMap<String,String> ilPlaka=new HashMap<>();
		ilPlaka.put("01", "Adana");
		ilPlaka.put("02", "Adýyaman");
		ilPlaka.put("03", "Afyon");
		ilPlaka.put("04", "Aðrý");
		ilPlaka.put("05", "Amasya");
		ilPlaka.put("06", "Ankara");
		ilPlaka.put("07", "Antalya");
		ilPlaka.put("08", "Artvin");
		ilPlaka.put("09", "Aydýn");
		ilPlaka.put("10", "Balýkesir");
		ilPlaka.put("11", "Bilecik");
		ilPlaka.put("12", "Bingöl");		
		ilPlaka.put("13", "Bitlis");
		ilPlaka.put("14", "Bolu");
		ilPlaka.put("15", "Burdur");
		ilPlaka.put("16", "Bursa");
		ilPlaka.put("17", "Çanakkale");
		ilPlaka.put("18", "Çankýrý");
		ilPlaka.put("19", "Çorum");
		ilPlaka.put("20", "Denizli");
		ilPlaka.put("21", "Diyarbakýr");		
		ilPlaka.put("22", "Edirne");
		
		
		int i=3;
		while(i!=0) {	
			System.out.print("plaka kodu giriniz:(01-22) ");
			Scanner oku=new Scanner(System.in);
			String plaka=oku.next();
			System.out.println("Girilen plaka kodu "+ilPlaka.get(plaka)+" iline aittir.\n");
			i--;
		}
	}

}
