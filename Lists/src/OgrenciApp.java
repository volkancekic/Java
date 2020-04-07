import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OgrenciApp {

	public static void main(String[] args) {
		
		List<Ogrenci> ogrlist=new ArrayList<Ogrenci>();
	
		ogrlist.add(new Ogrenci("ali1", "can", 21));
		ogrlist.add(new Ogrenci("ali2", "can", 28));
		ogrlist.add(new Ogrenci("ali3", "can", 24));
		ogrlist.add(new Ogrenci("ali4", "can", 20));
		
		
		System.out.println(ogrlist);
		Collections.sort(ogrlist);
		System.out.println("id ye göre artan sýralý "+ogrlist);
		
}
}

	 class Ogrenci implements Comparable{
		private String name;
		private String surname;
		private int id;
		
		public Ogrenci(String name, String surname, int id) {
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
			
			return (this.id<((Ogrenci)o).id) ? -1 : 1; //id fieldýna göre karþýlaþtýrma yapýlýr.
		}
		
		
		
	}


