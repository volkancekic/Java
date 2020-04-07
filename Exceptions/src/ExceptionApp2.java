
public class ExceptionApp2 {

	public static void main(String[] args) {
		
		int x=10,y=0;
		int z=div(x,y);
		System.out.println("sonuc: "+z);

	}
	public static int div(int s1,int s2) {
		int sonuc=-1;
		try {
			sonuc=s1/s2;
		}catch(ArithmeticException e) {
			System.out.println("bolen sýfýr..");
			//throw new Exception("Hata .");
		}
		return sonuc;
	}
}