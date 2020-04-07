package com.v;

public class Dikdortgen implements GeometrikSekil,Boyanabilir{

	private double en;
	private double boy;
	public Dikdortgen(double en, double boy) {
		super();
		this.en = en;
		this.boy = boy;
	}	
	public double getEn() {
		return en;
	}
	public void setEn(double en) {
		this.en = en;
	}
	public double getBoy() {
		return boy;
	}
	public void setBoy(double boy) {
		this.boy = boy;
	}
	/*public double cevre() {
		return 2*(en+boy);
	}
	public double alan() {
		return (en*boy);
	}*/
	@Override
	public double alan() {
		return (en*boy);
	}
	@Override
	public double cevre() {
		return 2*(en+boy);
	}
	@Override
	public void boya(String renk) {
		System.out.println(renk+" boyandý");
		
	}
	@Override
	public void boyaSil() {
		System.out.println("boya silindi");
		
	}
}
