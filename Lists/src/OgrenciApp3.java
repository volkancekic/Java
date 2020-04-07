import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OgrenciApp3 {
public static void main(String[] args) {
		
	ArrayList<String> myList=new ArrayList<String>();
	myList.add("omerrrrrrr");
	myList.add("aliiii");
	myList.add("sevda");
	myList.add("ayse");
	myList.add("selimm");
		
		
		System.out.println(myList);
		Collections.sort(myList);
		
		System.out.println(myList);
		Collections.sort(myList,new myClass());
		System.out.println(myList);
		//liste elemanlarý uzunluða göre sýralandý
		
}
}

	 class myClass implements Comparator<String>{

		@Override
		public int compare(String arg0, String arg1) {
			
			return Integer.valueOf(arg0.length()).compareTo(arg1.length());
		}
		
		
		

		
		
}
