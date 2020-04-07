
public class Kisi {
	public Kisi(String ad, int dogumYili, Cinsiyet cinsiyet) {
		super();
		this.ad = ad;
		this.dogumYili = dogumYili;
		this.cinsiyet = cinsiyet;
	}
	private String ad;
	private int dogumYili;
	private Cinsiyet cinsiyet;
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
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
}
