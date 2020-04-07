import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OgrenciApp2 {
public static void main(String[] args) {
		
		List<Ogrenci2> ogrlist=new ArrayList<Ogrenci2>();
	
		ogrlist.add(new Ogrenci2("ali", "can", 21));
		ogrlist.add(new Ogrenci2("zeynep", "can", 28));
		ogrlist.add(new Ogrenci2("veli", "can", 28));
		ogrlist.add(new Ogrenci2("sevgi", "can", 24));
		ogrlist.add(new Ogrenci2("ahmet", "can", 20));
		
		
		System.out.println(ogrlist);
		Collections.sort(ogrlist);
		System.out.println("name e göre artan sýralý "+ogrlist);
		
}
}

	 class Ogrenci2 implements Comparable{
		private String name;
		private String surname;
		private int id;
		
		public Ogrenci2(String name, String surname, int id) {
			super();
			this.name = name;
			this.surname = surname;
			this.id = id;
		}

		@Override
		public String toString() {
			return "name=" + name ;
		}

		@Override
		public int compareTo(Object o) {
			
			return this.name.compareTo(((Ogrenci2)o).name); //name fieldýna göre karþýlaþtýrma yapýlýr.
		}
		
		
}
