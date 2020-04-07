import java.util.ArrayList;
import java.util.Iterator;


public class IteratorApp {
	public static void main(String[] args) {
		
	
			ArrayList<String> myList=new ArrayList<String>();
			myList.add("omer");
			myList.add("ali");
			myList.add("sevda");
			myList.add("ayse");
			myList.add("Selim");
			
			System.out.println("myList ilk hali ==> "+myList);
			
			Iterator<String> itr=myList.iterator();
			
			while(itr.hasNext()) { 				//deger varmý kontrol eder
				System.out.println(itr.next()); //deger döndürür
			}
		
		}

}
