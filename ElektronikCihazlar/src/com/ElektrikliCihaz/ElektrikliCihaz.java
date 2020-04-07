package com.ElektrikliCihaz;

public class ElektrikliCihaz {

	String enerjiSinifi;
	int watt;
	int voltaj;

	public ElektrikliCihaz(String enerjiSinifi, int watt, int voltaj) {
		super();
		this.enerjiSinifi = enerjiSinifi;
		this.watt = watt;
		this.voltaj = voltaj;
	}

	public String getEnerjiSinifi() {
		return enerjiSinifi;
	}

	public void setEnerjiSinifi(String enerjiSinifi) {
		this.enerjiSinifi = enerjiSinifi;
	}

	public int getWatt() {
		return watt;
	}

	public void setWatt(int watt) {
		this.watt = watt;
	}

	public int getVoltaj() {
		return voltaj;
	}

	public void setVoltaj(int voltaj) {
		this.voltaj = voltaj;
	}

	public void ac() {

	}

	public void kapat() {

	}

	public void reset() {

	}

	@Override
	public String toString() {
		return "ElektrikliCihaz [enerjiSinifi=" + enerjiSinifi + ", watt=" + watt + ", voltaj=" + voltaj + "]";
	}

}
