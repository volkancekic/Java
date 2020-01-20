
public class Kisi {
	private String ad;
	private String soyad;
	private long tcNo;
	private String yetki;
	public Kisi(String ad, String soyad, long tcNo, String yetki) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.tcNo = tcNo;
		this.yetki = yetki;
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
	public long getTcNo() {
		return tcNo;
	}
	public void setTcNo(long tcNo) {
		this.tcNo = tcNo;
	}
	public String getYetki() {
		return yetki;
	}
	public void setYetki(String yetki) {
		this.yetki = yetki;
	}	
}
