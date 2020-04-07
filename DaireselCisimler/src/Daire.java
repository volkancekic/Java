
public class Daire {

	private double yaricap;
	
	public Daire(double yaricap) {
		super();
		this.yaricap = yaricap;
		
	}
	public double getYaricap() {
		return yaricap;
	}
	public void setYaricap(double yaricap) {
		this.yaricap = yaricap;
	}
	public double cevre(double yaricap) {
		return 2*(Math.PI)*yaricap;
	}
	public double alan(double yaricap) {
		return (Math.PI)*yaricap*yaricap;
	}
}
