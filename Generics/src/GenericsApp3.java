import java.util.ArrayList;
import java.util.List;

public class GenericsApp3 {
	public static void main(String[] args) {
		
		Sarma<Integer> myInt=new Sarma<Integer>(1, new Integer(5));
		Sarma<String> myStr=new Sarma<String>(2, new String("omer"));
	
		
		
		
		
		
	}
}
	
	class Sarma<T>{ 	
		int id;
		T name;	 //T tipinde name
		public Sarma(int id, T name) {
			super();
			this.id = id;
			this.name = name;
		}
	
		
		
		
	}

