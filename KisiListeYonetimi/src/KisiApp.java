import java.util.InputMismatchException;
import java.util.Scanner;

public class KisiApp {
	public static Scanner oku=new Scanner(System.in);
	public static Kisi[] list=new Kisi[50];
	public static int sayac=0;
	public static void main(String[] args) {
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
		System.out.print("-------------------------------------\n"
				+ "1-->Ekle\n2-->Sil\n3-->Deðiþtir\n4-->"
				+ "Listele\n5-->Detay Görüntüle\n6-->Ara\n7-->Çýkýþ\nSeçiminiz: ");		
		int secim;
		
			secim = oku.nextInt();
			if(secim==1 || secim==2 || secim==3 || secim==4 || secim==5 || secim==6 || secim==7) {
				return secim;
			}else {
				throw new MyMenuException("*** Hatalý Giriþ Yapýldý. ***"); //burada rakam kontrolü yapýldý
			}		//eðer ki rakam yerine harf vs girilirse o hata türü baþka olduðu için bu mesaj yazýlmaz
		// o kontrolü mainde menu alýnýrken int string uyumsuzluðu için yeni try catch ile halledeblrz.
	}
	public static void otomatikEkle() {
		list[sayac]=new Kisi("Ali", "Yýldýz", 1980, Cinsiyet.E);      sayac++;
		list[sayac]=new Kisi("Ayþe", "Yýlmaz", 1981, Cinsiyet.K);     sayac++;
		list[sayac]=new Kisi("Zeynep", "Yýldýrým", 1982,Cinsiyet.K); sayac++;
	}
	public static void ekle() {
		System.out.print("Eklenecek Kiþi: (Ad Soyad Doðum Yýlý Cinsiyet[E/K])");
		String ad=oku.next();
		String soyad=oku.next();
		int dYili=oku.nextInt();
		Cinsiyet cinsiyet=Cinsiyet.valueOf(oku.next());			
		list[sayac]=new Kisi(ad,soyad,dYili,cinsiyet);
		sayac++; //sýradaki boþ indis
		System.out.println(" * Ekleme Ýþleme Baþarýlý. *");
	}
	public static void sil() {
		System.out.print("Silinecek kiþinin adý: ");
		String ad=oku.next();
		int indeks;
		for(int i=0;i<sayac;i++) {
			if(list[i].getAd().equals(ad)) {
				indeks=i;
				System.out.println(list[indeks]+"Kayýt Silinecek Emin misin? [E/H]: ");
				char onay=oku.next().charAt(0);
				if(onay=='E') {
					list[indeks]=null;
					sayac--;
					for(int j=indeks;j<sayac;j++) {
						list[j]=list[j+1];
					}
					System.out.println(" * Silme Ýþlemi Baþarýlý. *");
					listele();
				}else {
					System.out.println(" * Silme Ýþlemi Ýptal Edildi. *");
				}
			}
		}		
	}
	public static void degistir() {
		listele();
		System.out.print("Deðiþtirilecek kiþinin indeksi: ");
		int indeks=oku.nextInt();
		System.out.println("Kiþi Bilgileri: "+list[indeks-1]); //indis sýfýrdan baþlarken sýra 1 den baþlar
		System.out.println("ad soyad dogumyýlý cinsiyet[E/K] girniz: ");
		list[indeks-1].setAd(oku.next());
		list[indeks-1].setSoyad(oku.next());
		list[indeks-1].setDogumYili(oku.nextInt());
		list[indeks-1].setCinsiyet(Cinsiyet.valueOf(oku.next()));
		System.out.println(" * Deðiþtirme iþlemi baþarýlý. *");
		System.out.println(list[indeks-1]);		
	}
	public static void listele() {
		System.out.println("-----  Liste -----");
		for(int i=0;i<sayac;i++) {
			System.out.println((i+1)+") "+list[i]);
		}
	}
	public static void detayGoruntule() {
		System.out.print("Görüntülenecek kiþinin indeksi: ");
		int indeks=oku.nextInt();
		System.out.println(list[indeks-1]); //indis sýfýrdan baþlarken sýra 1 den baþlar
	}
	public static void ara() {
		System.out.print("Arama (like %): ");
		String arama=oku.next();
		System.out.println("----- Arama Sonucu -----");
		for(int i=0;i<sayac;i++) {
			if(list[i].getAd().contains(arama) || list[i].getSoyad().contains(arama)) {
				System.out.println(list[i]);
			}
		}
	}
}
