
public class Ogrenci extends Kisi{
	private int ogrenciNo;
	private Sinif sinif;
	public Ogrenci(String ad, int dogumYili, Cinsiyet cinsiyet, int ogrenciNo, Sinif sinif) {
		super(ad, dogumYili, cinsiyet);
		this.ogrenciNo = ogrenciNo;
		this.sinif = sinif;
	}	
	public int getOgrenciNo() {
		return ogrenciNo;
	}
	public void setOgrenciNo(int ogrenciNo) {
		this.ogrenciNo = ogrenciNo;
	}
	public Sinif getSinif() {
		return sinif;
	}
	public void setSinif(Sinif sinif) {
		this.sinif = sinif;
	}
	@Override
	public String toString() {
		return "Öðrenci Adý="+getAd()+", Doðum Yýlý="+getDogumYili()+", Cinsiyet="+getCinsiyet()+", Öðrenci No=" + ogrenciNo + ", Sýnýfý=" + sinif;
	}	
}
