package com.ElektrikliCihaz;

public class Buzdolabi extends BeyazEsya{

	 String icHacim;
	 int kapakSayisi;
	
	public Buzdolabi(String enerjiSinifi, int watt, int voltaj, String marka, String renk, String ses, String icHacim,
			int kapakSayisi) {
		super(enerjiSinifi, watt, voltaj, marka, renk, ses);
		this.icHacim = icHacim;
		this.kapakSayisi = kapakSayisi;
	}
	public String getIcHacim() {
		return icHacim;
	}
	public void setIcHacim(String icHacim) {
		this.icHacim = icHacim;
	}
	public int getKapakSayisi() {
		return kapakSayisi;
	}
	public void setKapakSayisi(int kapakSayisi) {
		this.kapakSayisi = kapakSayisi;
	}
	@Override
	public String toString() {
		return "Buzdolabi [enerjiSinifi=" + enerjiSinifi + ", watt=" + watt + ", voltaj=" + voltaj + ", marka=" + marka + ", renk=" + renk + ", ses=" + ses + ", icHacim=" + icHacim + ", kapakSayisi=" + kapakSayisi + "]";
	}
	
}
