import java.util.HashMap;
import java.util.Scanner;

public class PlakaVilayet {

	public static void main(String[] args) {
	
		HashMap<String,String> ilPlaka=new HashMap<>();
		ilPlaka.put("01", "Adana");
		ilPlaka.put("02", "Ad�yaman");
		ilPlaka.put("03", "Afyon");
		ilPlaka.put("04", "A�r�");
		ilPlaka.put("05", "Amasya");
		ilPlaka.put("06", "Ankara");
		ilPlaka.put("07", "Antalya");
		ilPlaka.put("08", "Artvin");
		ilPlaka.put("09", "Ayd�n");
		ilPlaka.put("10", "Bal�kesir");
		ilPlaka.put("11", "Bilecik");
		ilPlaka.put("12", "Bing�l");		
		ilPlaka.put("13", "Bitlis");
		ilPlaka.put("14", "Bolu");
		ilPlaka.put("15", "Burdur");
		ilPlaka.put("16", "Bursa");
		ilPlaka.put("17", "�anakkale");
		ilPlaka.put("18", "�ank�r�");
		ilPlaka.put("19", "�orum");
		ilPlaka.put("20", "Denizli");
		ilPlaka.put("21", "Diyarbak�r");		
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
