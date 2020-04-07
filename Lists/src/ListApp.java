import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ListApp {

	public static void main(String[] args) {
		
	//****************************************************************//	
	/*	List<String> abc=new LinkedList<String>();
		abc.add("e");		
		 							//List interface kullandýðý için atama yapýlabilir.
		List<String> def=new ArrayList<String>();
		def.add("abc");		
		*/
	//***************************************************************//
		ArrayList<String> myList=new ArrayList<String>();
		myList.add("omer");
		myList.add("ali");
		myList.add("sevda");
		myList.add("ayse");
		myList.add("Selim");
		
		System.out.println("myList ilk hali ==> "+myList);
		
		Stack<String> stck=new Stack<String>();
		int size=myList.size();
		for(int i=0;i<size;i++) {
			stck.push(myList.get(0));			
			myList.remove(0);			
		}		
		size=stck.size();
		for(int i=0;i<size;i++) {
			myList.add(stck.pop());
			
		}
		System.out.println("myList son hali ==> "+myList);
	
	}

}
