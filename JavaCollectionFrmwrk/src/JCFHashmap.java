import java.util.HashMap;

public class JCFHashmap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> list=new HashMap();  //06-->Ankara yap�s�...
		list.put(6, "Ankara");
		list.put(34, "�stanbul");
		list.put(1, "Adana");
		
		System.out.println(list);
		System.out.println("6 n�n kar��l���: "+list.get(6));
		
		System.out.println("Adana value da var m�?: "+list.containsValue("Adana"));
		System.out.println("34 key de var m�?: "+list.containsKey(34));
		
		System.out.println("value listesi "+list.values());
		System.out.println("key listesi "+list.keySet());
		
		
	}

}
