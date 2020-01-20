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
				System.out.println("��retmen Listesi--> 1\n��renci Listesi-->2\nSe�iminiz: ");
				int kriter=oku.nextInt();
				if(kriter==1) {
					detayListe("Ogretmen");
				}else {
					detayListe("Ogrenci");
				}				
				break;
			case 5:
				System.out.println("G�le G�le.");
				break;	
			}
		}

	}
	public static int menu() {
		int secenek;
		System.out.print("****** Men� ******\n");
		System.out.print("1--> ��renci Ekle\n");
		System.out.print("2--> ��retmen Ekle\n");
		System.out.print("3--> Genel Liste\n");
		System.out.print("4--> ��renci / ��retmen Listesi\n");
		System.out.print("5--> ��k��\n");
		System.out.print("Se�iminiz: ");
		secenek=oku.nextInt();		
		return secenek;
	}
	public static void ogrenciEkle() {
		
		System.out.print("��renci Ad: ");
		oku.nextLine();
		String ad=oku.nextLine();
		System.out.print("��renci Soyad: ");
		String soyad=oku.nextLine();
		System.out.print("��renci Tc No: ");
		Long tcNo=oku.nextLong();
		System.out.print("��renci Okul No: ");
		int okulNo=oku.nextInt();
		System.out.print("��renci S�n�f: ");
		int sinif=oku.nextInt();
		list.add(new Ogrenci(ad, soyad, tcNo, "Ogrenci", okulNo, sinif));
		System.out.println("��renci Ekleme Ba�ar�l�.");
		
	}
	public static void ogretmenEkle() {
		
		System.out.print("��retmen Ad: ");
		oku.nextLine();
		String ad=oku.nextLine();
		System.out.print("��retmen Soyad: ");
		String soyad=oku.nextLine();
		System.out.print("��retmen Tc No: ");
		Long tcNo=oku.nextLong();		
		System.out.print("��retmen Sicil No: ");
		int sicilNo=oku.nextInt();
		list.add(new Ogretmen(ad, soyad, tcNo, "Ogretmen", sicilNo));
		System.out.println("��retmen Ekleme Ba�ar�l�.");
		
	}
	public static void otomatikEkle() {
		list.add(new Ogrenci("Ali", "Y�lmaz", 12345678910L, "Ogrenci", 100, 1));
		list.add(new Ogrenci("Veli", "Y�ld�r�m", 12345678453L, "Ogrenci", 101, 2));
		list.add(new Ogrenci("Ahmet", "�z", 12345963250L, "Ogrenci", 102, 1));
		list.add(new Ogrenci("Selim", "Can", 12865478910L, "Ogrenci", 103, 3));
		list.add(new Ogrenci("Fatih", "Y�ld�z", 95128347156L, "Ogrenci", 104, 1));
		list.add(new Ogretmen("�etin", "Y�ld�z", 12345678956L, "Ogretmen", 1223));
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
