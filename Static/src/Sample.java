
public class Sample {

	//public static int a=5;
	public static int a;
	public int b=5;
	
	
	static {
		System.out.println("s�n�f ba�l�yor.");
		a=5;
	}
	Sample(){
		System.out.println("obje ba�l�yor");
		//a++;
		//b++;
	}
	
}
