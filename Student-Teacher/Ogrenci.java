
public class Ogrenci extends Kisi{
	private int okulNo;
	private int sinif;
	public Ogrenci(String ad, String soyad, long tcNo, String yetki, int okulNo, int sinif) {
		super(ad, soyad, tcNo, yetki);
		this.okulNo = okulNo;
		this.sinif = sinif;
	}
	public int getOkulNo() {
		return okulNo;
	}
	public void setOkulNo(int okulNo) {
		this.okulNo = okulNo;
	}
	public int getSinif() {
		return sinif;
	}
	public void setSinif(int sinif) {
		this.sinif = sinif;
	}
	@Override
	public String toString() {
		return "- "+getYetki()+" Ad:"+getAd()+" ,Soyad:"+getSoyad()+" ,Tc:"+getTcNo()+" ,Okul No:"+okulNo+" ,Sýnýf:"+sinif ;
	}
}
