package com.ElektrikliCihaz;

public class CepTelefonu extends Elektronik{

	 String model;
	 int hatSayisi;
	
	public CepTelefonu(String enerjiSinifi, int watt, int voltaj, String marka, String model, int hatSayisi) {
		super(enerjiSinifi, watt, voltaj, marka);
		this.model = model;
		this.hatSayisi = hatSayisi;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getHatSayisi() {
		return hatSayisi;
	}
	public void setHatSayisi(int hatSayisi) {
		this.hatSayisi = hatSayisi;
	}
	@Override
	public String toString() {
		return "CepTelefonu [Marka=" + Marka + ", model=" + model + ", hatSayisi=" + hatSayisi + "]";
	}
	
}
