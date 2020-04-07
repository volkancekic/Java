import java.util.ArrayList;
import java.util.Scanner;

public class Sinif {
	private String sinifAdi;
	private Okul okul;
	private Ogretmen ogretmen=new Ogretmen("��retmen Atanmam��", 1, Cinsiyet.E, 1, null, null);
	
	
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
		return "S�n�f Ad�=" + sinifAdi + ", Okul=" + okul + ", ��retmen=" + ogretmen.getAd();
	}
	public void ogrenciEkle(Okul okul,Sinif sinifgelen) {
		Scanner oku=new Scanner(System.in);
		System.out.print("��renci Ad�: ");
		String ogrAdi=oku.nextLine();
		System.out.print("��renci Do�um Y�l�: ");
		int ogrDgmt=oku.nextInt();
		System.out.print("��renci Cinsiyeti [E/K]: ");
		Cinsiyet cinsiyet=Cinsiyet.valueOf(oku.next());
		System.out.print("��renci No: ");
		int ogrNo=oku.nextInt();
		Sinif sinif=sinifgelen;		
		ogrenciList.add(new Ogrenci(ogrAdi, ogrDgmt, cinsiyet, ogrNo, sinif));
		
		System.out.println("\n* ��renci kayd� ba�ar�l�.\n");							
	}
	public void ogrenciListele(Okul okulAd) {
		System.out.println("--------------------------��renci Listesi---------------------------------------");
		int i=0;
		for (Ogrenci ogrn : ogrenciList) {
			if(((ogrn.getSinif()).getOkul().getOkulAdi()).equals(okulAd.getOkulAdi())) {
			System.out.println((i+1)+"--> "+ogrn);
			i++;
			}			
		}						
	}	
}
