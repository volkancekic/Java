
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class App {	
	
	static Boolean okulSecimi=false,sinifSecimi=false,degisiklikControl=false;
	static Okul okulAd=new Okul("Okul Seçilmemiþ.");
	static Sinif sinifAd=new Sinif("Sýnýf Seçilmemiþ.", okulAd);
	
	static ArrayList<Okul> okulList=new ArrayList<>();
	
	public static void main(String[] args) {		
	
	
	
		try {
	         FileInputStream fileIn = new FileInputStream("Belgeler/okullar.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         okulList =  (ArrayList<Okul>)in.readObject();
	         in.close();
	         fileIn.close();
	      } catch (IOException i) {
	        System.out.println("Io excp oluþtu");
	         return;
	      } catch (ClassNotFoundException c) {
	         System.out.println(" class not found");		        
	         return;
	      }
		
		Scanner oku=new Scanner(System.in);
		
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
					degisiklikControl=true;
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
					degisiklikControl=true;
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
					degisiklikControl=true;
					break;
				case 5:
					if(sinifSecimi==false) {
						System.out.println("\n UYARI = Önce sýnýf seçmeniz gerekmektedir.");
						break;
					}
					sinifAd.ogrenciEkle(okulAd,sinifAd);
					degisiklikControl=true;
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
					degisiklikControl=true;
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
				Scanner oku1=new Scanner(System.in);
				if(degisiklikControl==true) {
				System.out.print("Deðiþiklikler Dosyaya Kaydedilsin mi?[ E/H ] : ");
				char cevap=oku1.next().charAt(0);
				if(cevap=='E') {
				dosyayaKaydet();
				}
				}
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
	public static void dosyayaKaydet() {
		//okul listesi
		try {
	         FileOutputStream fileOut =new FileOutputStream("Belgeler/okullar.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(okulList);
	         out.close();
	         fileOut.close();
	         System.out.printf("Okullar Dosyaya Kaydedildi--> ( Belgeler/okullar.ser )\n");
	      } catch (IOException i) {
	        System.out.println("serialize edilemedi");
	      }	
	}
}
