package com.ElektrikliCihaz;

public class BulasikMakinesi extends BeyazEsya{

	 String kapasite;
	 String programSayisi;
	
	public BulasikMakinesi(String enerjiSinifi, int watt, int voltaj, String marka, String renk, String ses,
			String kapasite, String programSayisi) {
		super(enerjiSinifi, watt, voltaj, marka, renk, ses);
		this.kapasite = kapasite;
		this.programSayisi = programSayisi;
	}
	public String getKapasite() {
		return kapasite;
	}
	public void setKapasite(String kapasite) {
		this.kapasite = kapasite;
	}
	public String getProgramSayisi() {
		return programSayisi;
	}
	public void setProgramSayisi(String programSayisi) {
		this.programSayisi = programSayisi;
	}	
	@Override
	public String toString() {
		return "BulasikMakinesi [enerjiSinifi=" + enerjiSinifi + ", watt=" + watt + ", voltaj=" + voltaj + ", marka=" + marka + ", renk=" + renk + ", ses=" + ses + ", kapasite=" + kapasite + ", programSayisi=" + programSayisi + "]";
	}	
}
