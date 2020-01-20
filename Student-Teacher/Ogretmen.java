
public class Ogretmen extends Kisi{
	private int sicilNo;

	public Ogretmen(String ad, String soyad, long tcNo, String yetki, int sicilNo) {
		super(ad, soyad, tcNo, yetki);
		this.sicilNo = sicilNo;
	}

	public int getSicilNo() {
		return sicilNo;
	}

	public void setSicilNo(int sicilNo) {
		this.sicilNo = sicilNo;
	}

	@Override
	public String toString() {
		return "+ "+getYetki()+" Ad:"+getAd()+" ,Soyad:"+getSoyad()+" ,Tc:"+getTcNo()+" ,Sicil No:"+sicilNo;
	}
}
