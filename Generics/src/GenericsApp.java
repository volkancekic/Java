import java.util.ArrayList;
import java.util.List;

public class GenericsApp {

	public static void main(String[] args) {
		
		//java type safe bir dildir.
		
		int deger=10;
		List liste=new ArrayList();
		liste.add(new Integer(10));
		//liste.add("omer");
		liste.add(8);
		
		int sum=0;
		for (Object object : liste) {
			sum+=Integer.valueOf(object.toString());
		}
		System.out.println("toplam: "+sum);

	}

}
