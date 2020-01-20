import java.util.ArrayList;
import java.util.Scanner;

public class App {
	static Scanner oku=new Scanner(System.in);
	static ArrayList<Kisi> list=new ArrayList<Kisi>();
	public static void main(String[] args) {
		otomatikEkle();
		int secim=0;
		while(secim!=5) {
			secim=menu();
			switch(secim) {
			case 1:
				ogrenciEkle();
				break;
			case 2:
				ogretmenEkle();
				break;	
			case 3:
				genelListe();
				break;
			case 4:
				System.out.println("Öðretmen Listesi--> 1\nÖðrenci Listesi-->2\nSeçiminiz: ");
				int kriter=oku.nextInt();
				if(kriter==1) {
					detayListe("Ogretmen");
				}else {
					detayListe("Ogrenci");
				}				
				break;
			case 5:
				System.out.println("Güle Güle.");
				break;	
			}
		}

	}
	public static int menu() {
		int secenek;
		System.out.print("****** Menü ******\n");
		System.out.print("1--> Öðrenci Ekle\n");
		System.out.print("2--> Öðretmen Ekle\n");
		System.out.print("3--> Genel Liste\n");
		System.out.print("4--> Öðrenci / Öðretmen Listesi\n");
		System.out.print("5--> Çýkýþ\n");
		System.out.print("Seçiminiz: ");
		secenek=oku.nextInt();		
		return secenek;
	}
	public static void ogrenciEkle() {
		
		System.out.print("Öðrenci Ad: ");
		oku.nextLine();
		String ad=oku.nextLine();
		System.out.print("Öðrenci Soyad: ");
		String soyad=oku.nextLine();
		System.out.print("Öðrenci Tc No: ");
		Long tcNo=oku.nextLong();
		System.out.print("Öðrenci Okul No: ");
		int okulNo=oku.nextInt();
		System.out.print("Öðrenci Sýnýf: ");
		int sinif=oku.nextInt();
		list.add(new Ogrenci(ad, soyad, tcNo, "Ogrenci", okulNo, sinif));
		System.out.println("Öðrenci Ekleme Baþarýlý.");
		
	}
	public static void ogretmenEkle() {
		
		System.out.print("Öðretmen Ad: ");
		oku.nextLine();
		String ad=oku.nextLine();
		System.out.print("Öðretmen Soyad: ");
		String soyad=oku.nextLine();
		System.out.print("Öðretmen Tc No: ");
		Long tcNo=oku.nextLong();		
		System.out.print("Öðretmen Sicil No: ");
		int sicilNo=oku.nextInt();
		list.add(new Ogretmen(ad, soyad, tcNo, "Ogretmen", sicilNo));
		System.out.println("Öðretmen Ekleme Baþarýlý.");
		
	}
	public static void otomatikEkle() {
		list.add(new Ogrenci("Ali", "Yýlmaz", 12345678910L, "Ogrenci", 100, 1));
		list.add(new Ogrenci("Veli", "Yýldýrým", 12345678453L, "Ogrenci", 101, 2));
		list.add(new Ogrenci("Ahmet", "Öz", 12345963250L, "Ogrenci", 102, 1));
		list.add(new Ogrenci("Selim", "Can", 12865478910L, "Ogrenci", 103, 3));
		list.add(new Ogrenci("Fatih", "Yýldýz", 95128347156L, "Ogrenci", 104, 1));
		list.add(new Ogretmen("Çetin", "Yýldýz", 12345678956L, "Ogretmen", 1223));
		list.add(new Ogretmen("Hakan", "Kaya",74125678956L, "Ogretmen", 1265));	
		
	}
	public static void genelListe() {
		System.out.println("**** Genel Liste ****");
		for(Kisi k:list) {
			System.out.println(k);
		}
		
	}
	public static void detayListe(String kriter) {
		System.out.println("**** "+kriter+" Listesi ****");
		for(Kisi k:list) {
			if(k.getYetki().equals(kriter)) {
				System.out.println(k);
			}
		}
}
}
