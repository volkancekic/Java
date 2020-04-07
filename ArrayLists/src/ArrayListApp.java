import java.util.ArrayList;

public class ArrayListApp {

	public static void main(String[] args) {
		
		ArrayList mylist=new ArrayList(); //ne atýlýrsa kabul edip tutar tipi yok
		
		mylist.add(new Integer(3));
		mylist.add("ali");
		mylist.add(1.5);
		
		System.out.println(mylist);
		
		for (Object object : mylist) {
			System.out.println(object+" "+object.getClass());
		}
		
		mylist.add("veli");
		mylist.remove(1.5);
		System.out.println(mylist);
		
		for(int i=0;i<mylist.size();i++) {
			System.out.println(mylist.get(i));
			
		}
	}

}
