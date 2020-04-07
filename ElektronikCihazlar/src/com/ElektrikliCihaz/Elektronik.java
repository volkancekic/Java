package com.ElektrikliCihaz;

public class Elektronik extends ElektrikliCihaz{

	 String Marka;

	public Elektronik(String enerjiSinifi, int watt, int voltaj, String marka) {
		super(enerjiSinifi, watt, voltaj);
		Marka = marka;
	}

	public String getMarka() {
		return Marka;
	}

	public void setMarka(String marka) {
		Marka = marka;
	}

	@Override
	public String toString() {
		return "Elektronik [Marka=" + Marka + "]";
	}
	
	
}
