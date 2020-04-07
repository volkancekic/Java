
public class Ogretmen extends Kisi{
	
	private int sicilNo;
	private Sinif sinif;
	private Okul okul;
	
	public Ogretmen(String ad, int dogumYili, Cinsiyet cinsiyet, int sicilNo, Sinif sinif, Okul okul) {
		super(ad, dogumYili, cinsiyet);
		this.sicilNo = sicilNo;
		this.sinif = sinif;
		this.okul = okul;
	}	
	public int getSicilNo() {
		return sicilNo;
	}
	public void setSicilNo(int sicilNo) {
		this.sicilNo = sicilNo;
	}
	public Sinif getSinif() {
		return sinif;
	}
	public void setSinif(Sinif sinif) {
		this.sinif = sinif;
	}
	public Okul getOkul() {
		return okul;
	}
	public void setOkul(Okul okul) {
		this.okul = okul;
	}
	@Override
	public String toString() {
		return "Öðretmen Adý="+getAd()+", Doðum Yýlý="+getDogumYili()+", Cinsiyet="+getCinsiyet()+", Sicil No=" + sicilNo + ", Sýnýfý =" + sinif.getSinifAdi() + ", Okulu=" + okul.getOkulAdi();
	}	
}
