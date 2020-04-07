import java.util.ArrayList;

public class ArrayListApp2 {

	public static void main(String[] args) {
		
		ArrayList<String> mylist=new ArrayList<>();
		
		mylist.add("bir");
		mylist.add("iki");
		mylist.add("uc");
		mylist.add("dort");
		mylist.add("bes");
		mylist.add("alti");
		
		
		System.out.println(mylist);
		mylist.remove("iki");
		System.out.println(mylist);
		
		mylist.set(1, "onbir");
		System.out.println(mylist);
		
		System.out.println(mylist.get(3));
	}

}
