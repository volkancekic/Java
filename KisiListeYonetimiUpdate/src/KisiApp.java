import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class KisiApp {
	
	static ArrayList<Kisi> list=new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner oku=new Scanner(System.in);
		int secenek=0;
		otomatikEkle();	//ba�lang��ta 3 ki�i eklendi
		while(secenek!=7) {			
				try {
					secenek=menu();
					switch(secenek) {
					case 1:						
						ekle();					
						break;
					case 2:
						sil();
						break;
					case 3:
						degistir();
						break;
					case 4:	
						listele();
						break;	
					case 5:
						detayGoruntule();
						break;
					case 6:
						ara();
						break;
					case 7:
						System.out.println("G�le g�le.");
						break;				
					}		
				} catch (MyMenuException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.out.println(e.getMessage());
				}			
				
		}
	}
	public static int menu() throws MyMenuException{
		Scanner oku=new Scanner(System.in);
		System.out.print("-------------------------------------\n"
				+ "1-->Ekle\n2-->Sil\n3-->De�i�tir\n4-->"
				+ "Listele\n5-->Detay G�r�nt�le\n6-->Ara\n7-->��k��\nSe�iminiz: ");		
		int secim=0;
		
			try {
				secim = oku.nextInt();
			} catch (Exception e) {
				throw new MyMenuException("*** Hatal� Giri� Yap�ld�. ***");
			}
			if(secim==1 || secim==2 || secim==3 || secim==4 || secim==5 || secim==6 || secim==7) {
				return secim;
			}else {
				throw new MyMenuException("*** Hatal� Giri� Yap�ld�. ***"); 
			}		
	}
	public static void otomatikEkle() {
		list.add(new Kisi("Ali", "Y�ld�z", 1980, Cinsiyet.E)); 
		list.add(new Kisi("Ay�e", "Y�lmaz", 1981, Cinsiyet.K)); 
		list.add(new Kisi("Zeynep", "Y�ld�r�m", 1982,Cinsiyet.K)); 		
	}
	public static void ekle() throws MyMenuException{
		Scanner oku=new Scanner(System.in);
		System.out.print("Eklenecek Ki�i: (Ad Soyad Do�um Y�l� Cinsiyet[E/K])");
		try {
			String ad=oku.next();
			String soyad=oku.next();
			int dYili=oku.nextInt();
			Cinsiyet cinsiyet=Cinsiyet.valueOf(oku.next());	
			list.add(new Kisi(ad,soyad,dYili,cinsiyet)); 
		} catch (Exception e) {		
			throw new MyMenuException("*** Hatal� Giri� Yap�ld�. ***");
		}
		System.out.println(" * Ekleme ��leme Ba�ar�l�. *");
	}
	public static void sil() {
		Scanner oku=new Scanner(System.in);
		listele();
		System.out.print("Silinecek ki�inin ad�: ");
		String ad=oku.next();
		int indeks;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getAd().equals(ad)) {
				indeks=i;
				System.out.println(list.get(i)+" Kay�t Silinecek Emin misin? [E/H]: ");
				char onay=oku.next().charAt(0);
				if(onay=='E') {
					list.remove(indeks);									
					System.out.println(" * Silme ��lemi Ba�ar�l�. *");
					listele();
				}else {
					System.out.println(" * Silme ��lemi �ptal Edildi. *");
				}
			}
		}		
	}
	public static void degistir() throws MyMenuException{
		Scanner oku=new Scanner(System.in);
		listele();
		int indeks,dogumYili;
		String ad,soyad;
		Cinsiyet c;
		System.out.print("De�i�tirilecek ki�inin indeksi: ");		
		try {
			indeks=oku.nextInt();
			System.out.println("Ki�i Bilgileri: "+list.get(indeks-1)); //indis s�f�rdan ba�larken s�ra 1 den ba�lar
			System.out.println("ad soyad dogumy�l� cinsiyet[E/K] girniz: ");
			ad=oku.next();
			soyad=oku.next();
			dogumYili=oku.nextInt();
			c=Cinsiyet.valueOf(oku.next());
			
		} catch (Exception e) {
			throw new MyMenuException("*** Hatal� Giri� Yap�ld�. ***");
		}
		list.get(indeks-1).setAd(ad);
		list.get(indeks-1).setSoyad(soyad);
		list.get(indeks-1).setDogumYili(dogumYili);
		list.get(indeks-1).setCinsiyet(c);
		System.out.println(" * De�i�tirme i�lemi ba�ar�l�. *");
		System.out.println(list.get(indeks-1));
	}
	public static void listele() {
		System.out.println("-----  Liste -----");
		for(int i=0;i<list.size();i++) {
			System.out.println((i+1)+") "+list.get(i).getAd()+" "+list.get(i).getSoyad());
		}
	}
	public static void detayGoruntule() throws MyMenuException{
		Scanner oku=new Scanner(System.in);
		listele();
		System.out.print("G�r�nt�lenecek ki�inin indeksi: ");
		try {
			int indeks=oku.nextInt();
			System.out.println(list.get(indeks-1)); //indis s�f�rdan ba�larken s�ra 1 den ba�lar
		} catch (Exception e) {
			throw new MyMenuException("*** Hatal� Giri� Yap�ld�. ***");
		}
	}
	public static void ara() {
		Scanner oku=new Scanner(System.in);
		System.out.print("Arama (like %): ");
		String arama=oku.next();
		System.out.println("----- Arama Sonucu -----");
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getAd().contains(arama) || list.get(i).getSoyad().contains(arama)) {
				System.out.println(list.get(i));
			}
		}
	}
}
