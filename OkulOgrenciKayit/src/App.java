import java.util.ArrayList;
import java.util.Scanner;

public class App {	
	
	static Boolean okulSecimi=false,sinifSecimi=false;
	static Okul okulAd=new Okul("Okul Se�ilmemi�.");
	static Sinif sinifAd=new Sinif("S�n�f Se�ilmemi�.", okulAd);
	
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
					sinifAd.setSinifAdi("S�n�f Se�ilmemi�.");
					sinifAd.setOkul(null);
					System.out.print("Okul Se�iminiz: ");
					int okulindis=oku.nextInt();
					okulAd=okulList.get(okulindis-1);
					okulSecimi=true;
					altMenuSecim=4;
					break;
				case 4:
					//anamen�
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
					System.out.print("S�n�f Se�iminiz: ");
					int sinifindis=oku.nextInt();						
					sinifAd=okulAd.sinifList.get(sinifindis-1);
					sinifSecimi=true;
					altMenuSecim=6;
					break;
				case 4:
					if(sinifSecimi==false) {
						System.out.println("\n UYARI = �nce s�n�f se�meniz gerekmektedir.");
						break;
					}
					okulAd.ogretmenListele(okulAd);
					System.out.print("Eklemek istedi�iniz ��retmeni se�iniz: ");
					int ogrtmn=oku.nextInt();					
					okulAd.sinifaOgretmenEkle(sinifAd, okulAd.ogretmenList.get(ogrtmn-1));
					break;
				case 5:
					if(sinifSecimi==false) {
						System.out.println("\n UYARI = �nce s�n�f se�meniz gerekmektedir.");
						break;
					}
					sinifAd.ogrenciEkle(okulAd,sinifAd);	
					sinifAd.ogrenciListele(okulAd);	
					break;
				case 6:
					//anamen�
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
					//anamen�
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
					//anamen�
					altMenuSecim=2;
					break;				
				}
				
				}
				
				break;
			case 5:				
				System.out.println("\n* G�le g�le.");
				secim=-1;
				break;	
				
			}
			
			
		}
		
	}
	public static int anaMenu() {
		Scanner oku=new Scanner(System.in);
		int secim=0;		
		if(okulSecimi==false) {
		System.out.print("\n------------Ana Men�------------\n*Se�ilen Okul: "+okulAd.getOkulAdi()+"\n\n"
				+ "Okul ��lemleri  --> 1\n��k��           --> 5\nSe�iminiz: ");
		secim=oku.nextInt();
		return secim;
		}else if(okulSecimi==true) {
			System.out.print("\n------------Ana Men�------------\n*Se�ilen Okul: "+okulAd.getOkulAdi()+"\n\n"
					+ "Okul ��lemleri      --> 1\nS�n�f ��lemleri     --> 2\n��retmen ��lemleri  --> 3\n"
					+ "��renci ��lemleri   --> 4\n��k��               --> 5\nSe�iminiz: ");
			secim=oku.nextInt();
			return secim;
		}
		return secim; // if ler �al��maz ise 0 d�ner
	}
	public static int okulMenu() {
			Scanner oku=new Scanner(System.in);
			int secim;		
			System.out.print("__________________________________________\n\n*Se�ilen Okul: "+okulAd.getOkulAdi()+"\n\n"
					+ "\n-----Okul ��lemleri-----\nOkul Ekleme       --> 1\nOkul Listeleme    --> 2\nOkul Se�imi       --> 3\n"
					+ "Ana Men�          --> 4\nSe�iminiz: ");
			secim=oku.nextInt();
			return secim;		
		
	}
	public static int sinifMenu() {
		Scanner oku=new Scanner(System.in);
		int secim;		
		System.out.print("__________________________________________\n\n*Se�ilen Okul: "+okulAd+"\n*Se�ilen S�n�f: "+sinifAd.getSinifAdi()+"\n"
				+ "\n-----S�n�f ��lemleri-----\nS�n�f Ekleme           --> 1\nS�n�f Listeleme        --> 2\nS�n�f Se�imi           --> 3\nS�n�fa ��retmen Atama  --> 4\n��renci Kay�t          --> 5"
				+ "\nAna Men�               --> 6\nSe�iminiz: ");
		secim=oku.nextInt();
		return secim;	
	
	}
	public static int ogretmenMenu() {
		Scanner oku=new Scanner(System.in);
		int secim;		
		System.out.print("__________________________________________\n\n*Se�ilen Okul: "+okulAd.getOkulAdi()
				+ "\n\n-----��retmen ��lemleri-----\nOkula ��retmen Ekleme  --> 1\n��retmen Listeleme     --> 2\nAna Men�               --> 3\nSe�iminiz: ");
		secim=oku.nextInt();
		return secim;	
	
	}
	public static int ogrenciMenu() {
		Scanner oku=new Scanner(System.in);
		int secim;		
		System.out.print("__________________________________________\n\n*Se�ilen Okul: "+okulAd.getOkulAdi()
				+ "\n\n-----��renci ��lemleri-----\n��renci Listeleme  --> 1\nAna Men�           --> 2\nSe�iminiz: ");
		secim=oku.nextInt();
		return secim;	
	
	}
	public static void otomatikEkle() {		
	
		okulList.add(new Okul("Amasya �lkokulu"));
		okulList.add(new Okul("Ankara �lkokulu"));
		okulList.add(new Okul("�ankaya Lisesi"));		
		
		
		Okul okulum=okulList.get(1);
		Okul okulum2=okulList.get(2);
		
		
		
		okulum.sinifList.add(new Sinif("1-A",okulum)); //ankara ilkokuluna s�n�f atand�.
		okulum2.sinifList.add(new Sinif("5-A", okulum2));
		okulum.sinifList.add(new Sinif("1-B", okulum));
		okulum2.sinifList.add(new Sinif("2-B", okulum2));
		okulum.sinifList.add(new Sinif("3-A", okulum));
		
		
		Sinif snf=okulum.sinifList.get(0);
		Sinif snf2=okulum2.sinifList.get(1);
		
		
		okulum.ogretmenList.add(new Ogretmen("Ay�e", 1980, Cinsiyet.K, 1234, snf, okulum));
		okulum.ogretmenList.add(new Ogretmen("Hasan", 1981, Cinsiyet.E, 1234, snf, okulum));
		okulum.ogretmenList.add(new Ogretmen("Y�lmaz", 1982, Cinsiyet.E, 1234, snf, okulum));
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
		
		
		
		
		System.out.println("\n-----  S�n�f Listesi  -----");
		for(int i=0;i<okulList.size();i++) {
			Okul okul=okulList.get(i);
			for (Sinif sinif : okul.sinifList) {
				System.out.println(sinif);
			}
		}
		
		System.out.println("\n-----  ��retmen Listesi  -----");
		for(int i=0;i<okulList.size();i++) {
			Okul okul=okulList.get(i);
			for (Ogretmen ogretmen : okul.ogretmenList) {
				System.out.println(ogretmen);
			}
		}
		System.out.println("\n-----  ��renci Listesi  -----");
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
		System.out.println("\n* Okul ekleme ba�ar�l�.\n");						
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
