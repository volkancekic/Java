import java.util.ArrayList;
import java.util.List;

public class GenericsApp2 {

public static void main(String[] args) {
		
		//java type safe bir dildir.
		
		int deger=10;
		List<Integer> liste=new ArrayList<>();
		liste.add(new Integer(10));
		//liste.add("omer");		 eklenemez type uyumsuz
		liste.add(8);
		
		int sum=0;
		for (Integer sayi : liste) {
			sum+=sayi;
		}
		System.out.println("toplam: "+sum);

	}

}
