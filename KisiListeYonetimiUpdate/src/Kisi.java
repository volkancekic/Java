
public class Kisi {

	private String ad;
	private String soyad;
	private int dogumYili;
	private Cinsiyet cinsiyet;
	public Kisi(String ad, String soyad, int dogumYili, Cinsiyet cinsiyet) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.dogumYili = dogumYili;
		this.cinsiyet = cinsiyet;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public int getDogumYili() {
		return dogumYili;
	}
	public void setDogumYili(int dogumYili) {
		this.dogumYili = dogumYili;
	}
	public Cinsiyet getCinsiyet() {
		return cinsiyet;
	}
	public void setCinsiyet(Cinsiyet cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
	@Override
	public String toString() {
		return " Ad=" + ad + ", Soyad=" + soyad + ", Dogum Yili=" + dogumYili + ", Cinsiyet=" + cinsiyet+" ";
	}
	
}
