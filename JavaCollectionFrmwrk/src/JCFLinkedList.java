import java.util.LinkedList;

public class JCFLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<>();
		
		list.add("omer");
		list.add("ozge");
		list.add("behiye");
		list.remove("omer");
		
		System.out.println(list);
		list.addFirst("salih");
		System.out.println(list);
		list.addLast("ayse");
		System.out.println(list);
		System.out.println("sonuncu eleman? : "+list.peekLast());
		list.add(1, "fethi");
		System.out.println(list);

	}

}
