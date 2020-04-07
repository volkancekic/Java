import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AlfabeTersSiralama {
	public static void main(String[] args) {
		
		ArrayList<String> myList=new ArrayList<String>();
		myList.add("omer");
		myList.add("ali");
		myList.add("sevda");
		myList.add("zeynep");
		myList.add("ayse");
		myList.add("selim");
			
			
			System.out.println("liste ilk: "+myList);
			
			Collections.sort(myList);			
			System.out.println(myList);
			//alfabetik sýralý isme göre(zaten tek deðer vardý burada)hangi field olacaðýný comparable ile belirtebiliriz.
			
			Collections.sort(myList,new myClass1());
			System.out.println(myList);
			
			//alfabetik tersten sýralý isme göre
			
	}
	}

		 class myClass1 implements Comparator<String>{

			@Override
			public int compare(String arg0, String arg1) {
				
				return arg1.compareTo(arg0); //getname eklendi ogrencide
			}
			
			
			

		
}
