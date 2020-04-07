
public class Kure extends Daire implements AlanHacim{

	public Kure(double yaricap) {
		super(yaricap);		
	}

	@Override
	public double alan(double yaricap) {
		return 4*(Math.PI)*(yaricap*yaricap);
	}

	@Override
	public double hacim(double yaricap) {
		return (1.3333)*(Math.PI)*(yaricap*yaricap*yaricap);
	}	
}
