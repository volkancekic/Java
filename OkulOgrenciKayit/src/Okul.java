import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
	private String okulAdi;
	
	  ArrayList<Sinif> sinifList=new ArrayList<>();
	  ArrayList<Ogretmen> ogretmenList=new ArrayList<>();
	
	public Okul(String okulAdi) {
		super();
		this.okulAdi = okulAdi;
	}	
	public String getOkulAdi() {
		return okulAdi;
	}
	public void setOkulAdi(String okulAdi) {
		this.okulAdi = okulAdi;
	}
	public void sinifaOgretmenEkle(Sinif sinif,Ogretmen ogretmen) {
		sinif.setOgretmen(ogretmen);
		ogretmen.setSinif(sinif);
		System.out.println("\n* Sýnýfa öðretmen eklenmiþtir.\n");	
		
	}
	@Override
	public String toString() {
		return "Okul Adý: " + okulAdi;
	}
	public void sinifEkle(Okul okul) {
		Scanner oku=new Scanner(System.in);
		System.out.print("Sýnýf ismi giriniz: ");
		String sinifAdi=oku.nextLine();
		sinifList.add(new Sinif(sinifAdi, okul));
		System.out.println("\n* Sýnýf ekleme baþarýlý.\n");							
	}
	public void sinifListele(Okul okul) {
		System.out.println("--------------------------Sýnýf Listesi---------------------------------------");
		int i=0;
		for (Sinif sinif : sinifList) {
			if(sinif.getOkul().getOkulAdi().equals(okul.getOkulAdi())) {
			System.out.println((i+1)+"--> "+sinif);
			i++;
			}			
		}						
	}
	public void ogretmenEkle(Okul okulgelen) {
		Scanner oku=new Scanner(System.in);
		System.out.print("Öðretmen Adý: ");
		String ogrtAdi=oku.nextLine();
		System.out.print("Öðretmen Doðum Yýlý: ");
		int ogrtDgmt=oku.nextInt();
		System.out.print("Öðretmen Cinsiyeti [E/K]: ");
		Cinsiyet cinsiyet=Cinsiyet.valueOf(oku.next());
		System.out.print("Öðretmen Sicil No: ");
		int ogrtSicilno=oku.nextInt();
		Sinif sinif=new Sinif("Sýnýf Atanmadý", null);
		Okul okul=okulgelen;		
		ogretmenList.add(new Ogretmen(ogrtAdi, ogrtDgmt, cinsiyet, ogrtSicilno, sinif, okul));
		System.out.println("\n* Öðretmen ekleme baþarýlý.\n");							
	}
	public void ogretmenListele(Okul okul) {
		System.out.println("--------------------------Öðretmen Listesi---------------------------------------");
		int i=0;
		for (Ogretmen ogr : ogretmenList) {
			if((ogr.getOkul().getOkulAdi()).equals(okul.getOkulAdi())) {
			System.out.println((i+1)+"--> "+ogr);
			i++;
			}			
		}						
	}	
}
