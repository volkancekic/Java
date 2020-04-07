
public class Sample {

	//public static int a=5;
	public static int a;
	public int b=5;
	
	
	static {
		System.out.println("sýnýf baþlýyor.");
		a=5;
	}
	Sample(){
		System.out.println("obje baþlýyor");
		//a++;
		//b++;
	}
	
}
