
public class ValueRefApp {

	public static void main(String[] args) {
		int sayi=8;
		int kare;
		
		kare=kareAl(sayi);
		System.out.println("sayi: "+sayi);
		System.out.println("karesi: "+kare);
		
		
		Kitap k1=new Kitap("ka�a��","� seyfettin",2015);
		
		kitapYazdir(k1);
		System.out.println("son olarak kitap ad� "+k1.getKitapAdi());
		
		k1=kitapKontrol(k1);
		System.out.println(k1);
		
		//ktp guncellenmi�mi
		
		
	}
	public static int kareAl(int i) {
		int sonuc;
		System.out.println("sayi kopyas�: i= "+i);
		sonuc=i*i;
		i++;
		System.out.println("sayi 1 artarsa: "+i);
		return sonuc;
	}
	public static void kitapYazdir(Kitap kitap) {
		
		System.out.println("kitap adi: "+kitap.getKitapAdi());
		System.out.println("kitap yazar�: "+kitap.getYazar());
		System.out.println("kitap y�l�: "+kitap.getBasimYili());
		
		System.out.println("kitap ismini de�i�tiriyorum.");
		
		kitap.setKitapAdi("sefiller");
		System.out.println("kitap adi: "+kitap.getKitapAdi());
		System.out.println("kitap yazar�: "+kitap.getYazar());
		System.out.println("kitap y�l�: "+kitap.getBasimYili());
	}
	public static Kitap kitapKontrol(Kitap kitap) {
		System.out.println("kitap kontrol �al��t�..");
		if(kitap.getBasimYili()<2010) {
			kitap=new Kitap("yaprak d�k�m�","resat nuri",2016);
		}
		return kitap;
	}
}
