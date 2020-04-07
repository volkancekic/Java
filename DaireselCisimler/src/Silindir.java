
public class Silindir extends Daire implements AlanHacim{
 private double yukseklik;

 public Silindir(double yaricap,double yukseklik) {
	super(yaricap);
	this.yukseklik=yukseklik;	
 }

public double getYukseklik() {
	return yukseklik;
}

public void setYukseklik(double yukseklik) {
	this.yukseklik = yukseklik;
}

@Override
public double alan(double yaricap, double yukseklik) {
	return 2*(Math.PI)*yaricap*(yaricap+yukseklik);
}
@Override
public double hacim(double yaricap, double yukseklik) {
	return (Math.PI)*yaricap*yaricap*yukseklik;
}


 

 
}
