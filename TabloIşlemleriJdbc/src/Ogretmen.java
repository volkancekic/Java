

public class Ogretmen {
	private int id;
	private String ad;
	private String soyad;
	private int sicil;
	private int bolum_id;
	private String bolum_ad;
	private String tarih;
	
	public Ogretmen(int id, String ad, String soyad, int sicil, int bolum_id,String bolum_ad,String tarih) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.sicil = sicil;
		this.bolum_id = bolum_id;
		this.bolum_ad = bolum_ad;
		this.tarih = tarih;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getSicil() {
		return sicil;
	}

	public void setSicil(int sicil) {
		this.sicil = sicil;
	}
	public int getBolum_id() {
		return bolum_id;
	}

	public void setBolum_id(int bolum_id) {
		this.bolum_id = bolum_id;
	}

	public String getBolum_ad() {
		return bolum_ad;
	}

	public void setBolum_ad(String bolum_ad) {
		this.bolum_ad = bolum_ad;
	}

	public String getTarih() {
		return tarih;
	}

	public void setTarih(String tarih) {
		this.tarih = tarih;
	}

	@Override
	public String toString() {
		return "\nad=" + ad + ", soyad=" + soyad + ", sicil=" + sicil + ", bolum_id=" + bolum_id
				+ ", bolum_ad=" + bolum_ad + ", tarih=" + tarih + "\n";
	}
	
	
	


	
	
	
	
}
