
public class ComplexNumber implements ComplexNumberOlmakZordur{
	private double real;
	private double imaginary;
	
	public ComplexNumber(double real, double imaginary) {
		super();
		this.real = real;
		this.imaginary = imaginary;
	}	
	public double getReal() {
		return real;
	}
	public void setReal(double real) {
		this.real = real;
	}
	public double getImaginary() {
		return imaginary;
	}
	public void setImaginary(double imaginary) {
		this.imaginary = imaginary;
	}
	@Override
	public String add(ComplexNumber cn) {		
		return (real+cn.real)+" + "+(imaginary+cn.imaginary);
	}
	@Override
	public String add(double real, double imaginary) {
		return (this.real+real)+" + "+(this.imaginary+imaginary);
	}
	@Override
	public String substract(ComplexNumber cn) {
		return (real-cn.real)+" - "+(imaginary-cn.imaginary);
	}
	@Override
	public String substract(double real, double imaginary) {
		return (this.real-real)+" - "+(this.imaginary-imaginary);
	}
	
	
}
