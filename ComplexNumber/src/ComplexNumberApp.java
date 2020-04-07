
public class ComplexNumberApp {

	public static void main(String[] args) {
		
		ComplexNumber cn1=new ComplexNumber(1, 1);
		ComplexNumber cn2=new ComplexNumber(2, 3);
		
		System.out.println("cn1= "+cn1.getReal()+"+"+cn1.getImaginary()+"i");
		System.out.println("cn2= "+cn2.getReal()+"+"+cn2.getImaginary()+"i");
		System.out.println("-------");
		System.out.println("Sonuç: "+cn1.add(1, 1)+"i");
		System.out.println("Sonuç: "+cn1.add(cn2)+"i");
		System.out.println("-------");
		System.out.println("Sonuç: "+cn1.substract(1, 1)+"i");
		System.out.println("Sonuç: "+cn1.substract(cn2)+"i");
		
		
		

	}

}
