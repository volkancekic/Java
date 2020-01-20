package com.ElektrikliCihaz;

public class BeyazEsya extends ElektrikliCihaz{
	 String marka;
	 String renk;
	 String ses;
	
	public BeyazEsya(String enerjiSinifi, int watt, int voltaj, String marka, String renk, String ses) {
		super(enerjiSinifi, watt, voltaj);
		this.marka = marka;
		this.renk = renk;
		this.ses = ses;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public String getSes() {
		return ses;
	}
	public void setSes(String ses) {
		this.ses = ses;
	}
	@Override
	public String toString() {
		return "BeyazEsya [marka=" + marka + ", renk=" + renk + ", ses=" + ses + "]";
	}
	
	
	
	
	
}
