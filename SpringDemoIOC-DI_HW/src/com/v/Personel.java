package com.v;

public class Personel {
	public Personel(String isim, String soyisim) {
		System.out.println("isim soyisim ile 2'li const �al��t�");
		this.isim = isim;
		this.soyisim = soyisim;
	}
	public Personel() {
		System.out.println("personel default const �al��t�");
	}
	
	private String isim;
	private String soyisim;
	private OzlukDosyasi ozlukdosyasi;
	public String getIsim() {
		return isim;
	}
	
	
	public void setOzlukdosyasi(OzlukDosyasi ozlukdosyasi) {
		this.ozlukdosyasi = ozlukdosyasi;
	}
	@Override
	public String toString() {
		return "Personel [isim=" + isim + ", soyisim=" + soyisim + ", ozlukdosyasi=" + ozlukdosyasi + "]";
	}
	
	
	
}
