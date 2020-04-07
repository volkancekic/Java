import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class KisiApp {
	
	static ArrayList<Kisi> list=new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner oku=new Scanner(System.in);
		int secenek=0;
		otomatikEkle();	//baþlangýçta 3 kiþi eklendi
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
						System.out.println("Güle güle.");
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
				+ "1-->Ekle\n2-->Sil\n3-->Deðiþtir\n4-->"
				+ "Listele\n5-->Detay Görüntüle\n6-->Ara\n7-->Çýkýþ\nSeçiminiz: ");		
		int secim=0;
		
			try {
				secim = oku.nextInt();
			} catch (Exception e) {
				throw new MyMenuException("*** Hatalý Giriþ Yapýldý. ***");
			}
			if(secim==1 || secim==2 || secim==3 || secim==4 || secim==5 || secim==6 || secim==7) {
				return secim;
			}else {
				throw new MyMenuException("*** Hatalý Giriþ Yapýldý. ***"); 
			}		
	}
	public static void otomatikEkle() {
		list.add(new Kisi("Ali", "Yýldýz", 1980, Cinsiyet.E)); 
		list.add(new Kisi("Ayþe", "Yýlmaz", 1981, Cinsiyet.K)); 
		list.add(new Kisi("Zeynep", "Yýldýrým", 1982,Cinsiyet.K)); 		
	}
	public static void ekle() throws MyMenuException{
		Scanner oku=new Scanner(System.in);
		System.out.print("Eklenecek Kiþi: (Ad Soyad Doðum Yýlý Cinsiyet[E/K])");
		try {
			String ad=oku.next();
			String soyad=oku.next();
			int dYili=oku.nextInt();
			Cinsiyet cinsiyet=Cinsiyet.valueOf(oku.next());	
			list.add(new Kisi(ad,soyad,dYili,cinsiyet)); 
		} catch (Exception e) {		
			throw new MyMenuException("*** Hatalý Giriþ Yapýldý. ***");
		}
		System.out.println(" * Ekleme Ýþleme Baþarýlý. *");
	}
	public static void sil() {
		Scanner oku=new Scanner(System.in);
		listele();
		System.out.print("Silinecek kiþinin adý: ");
		String ad=oku.next();
		int indeks;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getAd().equals(ad)) {
				indeks=i;
				System.out.println(list.get(i)+" Kayýt Silinecek Emin misin? [E/H]: ");
				char onay=oku.next().charAt(0);
				if(onay=='E') {
					list.remove(indeks);									
					System.out.println(" * Silme Ýþlemi Baþarýlý. *");
					listele();
				}else {
					System.out.println(" * Silme Ýþlemi Ýptal Edildi. *");
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
		System.out.print("Deðiþtirilecek kiþinin indeksi: ");		
		try {
			indeks=oku.nextInt();
			System.out.println("Kiþi Bilgileri: "+list.get(indeks-1)); //indis sýfýrdan baþlarken sýra 1 den baþlar
			System.out.println("ad soyad dogumyýlý cinsiyet[E/K] girniz: ");
			ad=oku.next();
			soyad=oku.next();
			dogumYili=oku.nextInt();
			c=Cinsiyet.valueOf(oku.next());
			
		} catch (Exception e) {
			throw new MyMenuException("*** Hatalý Giriþ Yapýldý. ***");
		}
		list.get(indeks-1).setAd(ad);
		list.get(indeks-1).setSoyad(soyad);
		list.get(indeks-1).setDogumYili(dogumYili);
		list.get(indeks-1).setCinsiyet(c);
		System.out.println(" * Deðiþtirme iþlemi baþarýlý. *");
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
		System.out.print("Görüntülenecek kiþinin indeksi: ");
		try {
			int indeks=oku.nextInt();
			System.out.println(list.get(indeks-1)); //indis sýfýrdan baþlarken sýra 1 den baþlar
		} catch (Exception e) {
			throw new MyMenuException("*** Hatalý Giriþ Yapýldý. ***");
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
