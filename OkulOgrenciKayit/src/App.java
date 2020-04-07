import java.util.ArrayList;
import java.util.Scanner;

public class App {	
	
	static Boolean okulSecimi=false,sinifSecimi=false;
	static Okul okulAd=new Okul("Okul Seçilmemiþ.");
	static Sinif sinifAd=new Sinif("Sýnýf Seçilmemiþ.", okulAd);
	
	static ArrayList<Okul> okulList=new ArrayList<>();
	
	public static void main(String[] args) {		
		
		Scanner oku=new Scanner(System.in);
		otomatikEkle();
		Yazdir();
		int secim=0,altMenuSecim;	 					 
		while(secim!=-1) {
			secim=anaMenu();
			switch(secim) {
			case 1:
				altMenuSecim=0;
				while(altMenuSecim!=4) {
					
				secim=okulMenu();
				switch(secim) {
				case 1:
					okulEkle();	
					okulListele();
					break;
				case 2:
					okulListele();
					break;
				case 3:
					okulListele();	
					sinifAd.setSinifAdi("Sýnýf Seçilmemiþ.");
					sinifAd.setOkul(null);
					System.out.print("Okul Seçiminiz: ");
					int okulindis=oku.nextInt();
					okulAd=okulList.get(okulindis-1);
					okulSecimi=true;
					altMenuSecim=4;
					break;
				case 4:
					//anamenü
					altMenuSecim=4;
					break;
				}
				
				}
				break;				
			case 2:
				if(okulSecimi==false) {
					break;
				}
				
				altMenuSecim=0;
				while(altMenuSecim!=6) {
				
				secim=sinifMenu();
				switch(secim) {
				case 1:					
					okulAd.sinifEkle(okulAd);
					okulAd.sinifListele(okulAd);									
					break;
				case 2:
					okulAd.sinifListele(okulAd);	
					break;
				case 3:
					okulAd.sinifListele(okulAd);
					System.out.print("Sýnýf Seçiminiz: ");
					int sinifindis=oku.nextInt();						
					sinifAd=okulAd.sinifList.get(sinifindis-1);
					sinifSecimi=true;
					altMenuSecim=6;
					break;
				case 4:
					if(sinifSecimi==false) {
						System.out.println("\n UYARI = Önce sýnýf seçmeniz gerekmektedir.");
						break;
					}
					okulAd.ogretmenListele(okulAd);
					System.out.print("Eklemek istediðiniz öðretmeni seçiniz: ");
					int ogrtmn=oku.nextInt();					
					okulAd.sinifaOgretmenEkle(sinifAd, okulAd.ogretmenList.get(ogrtmn-1));
					break;
				case 5:
					if(sinifSecimi==false) {
						System.out.println("\n UYARI = Önce sýnýf seçmeniz gerekmektedir.");
						break;
					}
					sinifAd.ogrenciEkle(okulAd,sinifAd);	
					sinifAd.ogrenciListele(okulAd);	
					break;
				case 6:
					//anamenü
					altMenuSecim=6;
					break;	
				}
				
				}
				
				break;
			case 3:
				if(okulSecimi==false) {
					break;
				}
				
				altMenuSecim=0;
				while(altMenuSecim!=3) {
				
				secim=ogretmenMenu();
				switch(secim) {
				case 1:
					okulAd.ogretmenEkle(okulAd);
					okulAd.ogretmenListele(okulAd);
					break;
				case 2:
					okulAd.ogretmenListele(okulAd);
					break;				
				case 3:
					//anamenü
					altMenuSecim=3;
					break;
				}
				}
				
				break;
			case 4:
				if(okulSecimi==false) {
					break;
				}
				
				altMenuSecim=0;
				while(altMenuSecim!=2) {
				
				secim=ogrenciMenu();
				switch(secim) {
				case 1:
					sinifAd.ogrenciListele(okulAd);					
					break;
				case 2:
					//anamenü
					altMenuSecim=2;
					break;				
				}
				
				}
				
				break;
			case 5:				
				System.out.println("\n* Güle güle.");
				secim=-1;
				break;	
				
			}
			
			
		}
		
	}
	public static int anaMenu() {
		Scanner oku=new Scanner(System.in);
		int secim=0;		
		if(okulSecimi==false) {
		System.out.print("\n------------Ana Menü------------\n*Seçilen Okul: "+okulAd.getOkulAdi()+"\n\n"
				+ "Okul Ýþlemleri  --> 1\nÇýkýþ           --> 5\nSeçiminiz: ");
		secim=oku.nextInt();
		return secim;
		}else if(okulSecimi==true) {
			System.out.print("\n------------Ana Menü------------\n*Seçilen Okul: "+okulAd.getOkulAdi()+"\n\n"
					+ "Okul Ýþlemleri      --> 1\nSýnýf Ýþlemleri     --> 2\nÖðretmen Ýþlemleri  --> 3\n"
					+ "Öðrenci Ýþlemleri   --> 4\nÇýkýþ               --> 5\nSeçiminiz: ");
			secim=oku.nextInt();
			return secim;
		}
		return secim; // if ler çalýþmaz ise 0 döner
	}
	public static int okulMenu() {
			Scanner oku=new Scanner(System.in);
			int secim;		
			System.out.print("__________________________________________\n\n*Seçilen Okul: "+okulAd.getOkulAdi()+"\n\n"
					+ "\n-----Okul Ýþlemleri-----\nOkul Ekleme       --> 1\nOkul Listeleme    --> 2\nOkul Seçimi       --> 3\n"
					+ "Ana Menü          --> 4\nSeçiminiz: ");
			secim=oku.nextInt();
			return secim;		
		
	}
	public static int sinifMenu() {
		Scanner oku=new Scanner(System.in);
		int secim;		
		System.out.print("__________________________________________\n\n*Seçilen Okul: "+okulAd+"\n*Seçilen Sýnýf: "+sinifAd.getSinifAdi()+"\n"
				+ "\n-----Sýnýf Ýþlemleri-----\nSýnýf Ekleme           --> 1\nSýnýf Listeleme        --> 2\nSýnýf Seçimi           --> 3\nSýnýfa Öðretmen Atama  --> 4\nÖðrenci Kayýt          --> 5"
				+ "\nAna Menü               --> 6\nSeçiminiz: ");
		secim=oku.nextInt();
		return secim;	
	
	}
	public static int ogretmenMenu() {
		Scanner oku=new Scanner(System.in);
		int secim;		
		System.out.print("__________________________________________\n\n*Seçilen Okul: "+okulAd.getOkulAdi()
				+ "\n\n-----Öðretmen Ýþlemleri-----\nOkula Öðretmen Ekleme  --> 1\nÖðretmen Listeleme     --> 2\nAna Menü               --> 3\nSeçiminiz: ");
		secim=oku.nextInt();
		return secim;	
	
	}
	public static int ogrenciMenu() {
		Scanner oku=new Scanner(System.in);
		int secim;		
		System.out.print("__________________________________________\n\n*Seçilen Okul: "+okulAd.getOkulAdi()
				+ "\n\n-----Öðrenci Ýþlemleri-----\nÖðrenci Listeleme  --> 1\nAna Menü           --> 2\nSeçiminiz: ");
		secim=oku.nextInt();
		return secim;	
	
	}
	public static void otomatikEkle() {		
	
		okulList.add(new Okul("Amasya Ýlkokulu"));
		okulList.add(new Okul("Ankara Ýlkokulu"));
		okulList.add(new Okul("Çankaya Lisesi"));		
		
		
		Okul okulum=okulList.get(1);
		Okul okulum2=okulList.get(2);
		
		
		
		okulum.sinifList.add(new Sinif("1-A",okulum)); //ankara ilkokuluna sýnýf atandý.
		okulum2.sinifList.add(new Sinif("5-A", okulum2));
		okulum.sinifList.add(new Sinif("1-B", okulum));
		okulum2.sinifList.add(new Sinif("2-B", okulum2));
		okulum.sinifList.add(new Sinif("3-A", okulum));
		
		
		Sinif snf=okulum.sinifList.get(0);
		Sinif snf2=okulum2.sinifList.get(1);
		
		
		okulum.ogretmenList.add(new Ogretmen("Ayþe", 1980, Cinsiyet.K, 1234, snf, okulum));
		okulum.ogretmenList.add(new Ogretmen("Hasan", 1981, Cinsiyet.E, 1234, snf, okulum));
		okulum.ogretmenList.add(new Ogretmen("Yýlmaz", 1982, Cinsiyet.E, 1234, snf, okulum));
		okulum2.ogretmenList.add(new Ogretmen("Sinan", 1983, Cinsiyet.E, 1234, snf2, okulum2));
		okulum2.ogretmenList.add(new Ogretmen("Sevgi", 1984, Cinsiyet.K, 1234, snf2, okulum2));
		
		
		snf2.ogrenciList.add(new Ogrenci("Mert", 2000, Cinsiyet.E, 100, snf2));
		snf2.ogrenciList.add(new Ogrenci("Selim", 2000, Cinsiyet.E, 101, snf2));
		snf2.ogrenciList.add(new Ogrenci("Aleyna", 2000, Cinsiyet.K, 102, snf2));
		snf2.ogrenciList.add(new Ogrenci("Tansu", 1999, Cinsiyet.K, 103, snf2));
		snf2.ogrenciList.add(new Ogrenci("Melike", 1999, Cinsiyet.K, 104, snf2));
		snf.ogrenciList.add(new Ogrenci("Melih", 1999, Cinsiyet.E, 105, snf));
		snf.ogrenciList.add(new Ogrenci("Salih", 2001, Cinsiyet.E, 106, snf));
		snf.ogrenciList.add(new Ogrenci("Ersel", 2001, Cinsiyet.E, 107, snf));
		snf.ogrenciList.add(new Ogrenci("Melek", 2001, Cinsiyet.K, 108, snf));
		snf.ogrenciList.add(new Ogrenci("Serap", 2001, Cinsiyet.K, 109, snf));
		
				
	
	}
	public static void Yazdir() {
		System.out.println("-----  Okul Listesi  -----");
		for (Okul okul : okulList) {
			System.out.println(okul);
		}
		
		
		
		
		System.out.println("\n-----  Sýnýf Listesi  -----");
		for(int i=0;i<okulList.size();i++) {
			Okul okul=okulList.get(i);
			for (Sinif sinif : okul.sinifList) {
				System.out.println(sinif);
			}
		}
		
		System.out.println("\n-----  Öðretmen Listesi  -----");
		for(int i=0;i<okulList.size();i++) {
			Okul okul=okulList.get(i);
			for (Ogretmen ogretmen : okul.ogretmenList) {
				System.out.println(ogretmen);
			}
		}
		System.out.println("\n-----  Öðrenci Listesi  -----");
		for(int i=0;i<okulList.size();i++) {
			Okul okul=okulList.get(i);
			for(int j=0;j<okul.sinifList.size();j++) {
				Sinif sinif=okul.sinifList.get(j);
				
				for (Ogrenci ogrenci : sinif.ogrenciList) {
					System.out.println(ogrenci);
				}
			}
		}
	}
	public static void okulEkle() {		
		Scanner oku=new Scanner(System.in);
		System.out.print("Okul ismi giriniz: ");
		String okulAdi=oku.nextLine();
		Okul okul1=new Okul(okulAdi);
		okulList.add(okul1);
		System.out.println("\n* Okul ekleme baþarýlý.\n");						
	}
	public static void okulListele() {
		System.out.println("-------------Okul Listesi-------------");
		int i=0;
		for (Okul okul : okulList) {			
			System.out.println((i+1)+"--> "+okul);
			i++;
		}						
	}
}
