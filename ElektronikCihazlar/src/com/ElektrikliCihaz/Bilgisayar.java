package com.ElektrikliCihaz;

public class Bilgisayar extends Elektronik{

	 String ram;
	 String islemci;
	 String disk;
	
	public Bilgisayar(String enerjiSinifi, int watt, int voltaj, String marka, String ram, String islemci, String disk) {
		super(enerjiSinifi, watt, voltaj, marka);
		this.ram = ram;
		this.islemci = islemci;
		this.disk = disk;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getIslemci() {
		return islemci;
	}
	public void setIslemci(String islemci) {
		this.islemci = islemci;
	}
	public String getDisk() {
		return disk;
	}
	public void setDisk(String disk) {
		this.disk = disk;
	}
	@Override
	public String toString() {
		return "Bilgisayar ["+"watt=" + watt + ", voltaj=" + voltaj +", Marka=" + Marka + ", ram=" + ram + ", islemci=" + islemci + ", disk=" + disk + "]";
	}
	
	
	
}
