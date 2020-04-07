import java.util.ArrayList;
import java.util.List;

public class GenericsApp4 {
	public static void main(String[] args) {
		
		Sayi<Integer> myInt=new Sayi<Integer>(new Integer(5));
		Sayi<Double> mySayi1=new Sayi<Double>(2.5);
		
		int x=myInt.getValue();
		double y=mySayi1.getValue();
	
		
		
	
		
		
		
	}
}
									//gelen tipte
	class Sayi<T extends Number> { 	//number dan türetilen þeyleri kabul et demek String kabul edilmeyecek yani
		
		T value;	 //T tipinde value isimli degisken
		public Sayi(T value) {
			super();			
			this.value = value;
		}
		public T getValue() {
			return value;
		}
		public void setValue(T value) {
			this.value = value;
		}
		
		
		
	
}
