import java.util.ArrayList;
import java.util.Scanner;

public class Sinif {
	private String sinifAdi;
	private Okul okul;
	private Ogretmen ogretmen=new Ogretmen("Öðretmen Atanmamýþ", 1, Cinsiyet.E, 1, null, null);
	
	
	 ArrayList<Ogrenci> ogrenciList=new ArrayList<>();
	
	public Sinif(String sinifAdi, Okul okul) {
		super();
		this.sinifAdi = sinifAdi;
		this.okul = okul;		
	}

	public String getSinifAdi() {
		return sinifAdi;
	}

	public void setSinifAdi(String sinifAdi) {
		this.sinifAdi = sinifAdi;
	}
	public Okul getOkul() {
		return okul;
	}

	public void setOkul(Okul okul) {
		this.okul = okul;
	}
	public Ogretmen getOgretmen() {
		return ogretmen;
	}

	public void setOgretmen(Ogretmen ogretmen) {
		this.ogretmen = ogretmen;
	}	
	@Override
	public String toString() {
		return "Sýnýf Adý=" + sinifAdi + ", Okul=" + okul + ", Öðretmen=" + ogretmen.getAd();
	}
	public void ogrenciEkle(Okul okul,Sinif sinifgelen) {
		Scanner oku=new Scanner(System.in);
		System.out.print("Öðrenci Adý: ");
		String ogrAdi=oku.nextLine();
		System.out.print("Öðrenci Doðum Yýlý: ");
		int ogrDgmt=oku.nextInt();
		System.out.print("Öðrenci Cinsiyeti [E/K]: ");
		Cinsiyet cinsiyet=Cinsiyet.valueOf(oku.next());
		System.out.print("Öðrenci No: ");
		int ogrNo=oku.nextInt();
		Sinif sinif=sinifgelen;		
		ogrenciList.add(new Ogrenci(ogrAdi, ogrDgmt, cinsiyet, ogrNo, sinif));
		
		System.out.println("\n* Öðrenci kaydý baþarýlý.\n");							
	}
	public void ogrenciListele(Okul okulAd) {
		System.out.println("--------------------------Öðrenci Listesi---------------------------------------");
		int i=0;
		for (Ogrenci ogrn : ogrenciList) {
			if(((ogrn.getSinif()).getOkul().getOkulAdi()).equals(okulAd.getOkulAdi())) {
			System.out.println((i+1)+"--> "+ogrn);
			i++;
			}			
		}						
	}	
}
