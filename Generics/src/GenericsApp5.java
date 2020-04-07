
public class GenericsApp5 {

public static void main(String[] args) {
		
		
		
	Sayim<Integer> myInt=new Sayim<Integer>(new Integer(5));
	Sayim<Double> mySayi1=new Sayim<Double>(2.5);
	
	int x=myInt.getValue();
	double y=mySayi1.getValue();
	
		//super kullanýmý anlatýlacak burada
		
		
	}
}
									
	class Sayim<T extends Number> { 
		
		T value;	
		public Sayim(T value) {
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
