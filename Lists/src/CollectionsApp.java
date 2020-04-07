import java.util.ArrayList;
import java.util.Collections;

public class CollectionsApp {

	public static void main(String[] args) {
	

		ArrayList<String> myList=new ArrayList<String>();
		myList.add("omer");
		myList.add("ali");
		myList.add("sevda");
		myList.add("ayse");
		myList.add("selim");
		
		System.out.println("myList ilk hali ==> "+myList);
		
		Collections.reverse(myList);
		System.out.println(myList);
		
		
		
		
		System.out.println(Collections.min(myList));
		System.out.println(Collections.max(myList));

		ArrayList<Integer> ints=new ArrayList<Integer>();
		ints.add(5);
		ints.add(6);
		ints.add(3);
		ints.add(11);
		System.out.println(ints);
		Collections.sort(ints);
		System.out.println(ints);
		System.out.println(Collections.min(ints));
		System.out.println(Collections.max(ints));
		
	}

}
