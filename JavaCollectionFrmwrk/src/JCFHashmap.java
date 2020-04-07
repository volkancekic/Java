import java.util.HashMap;

public class JCFHashmap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> list=new HashMap();  //06-->Ankara yapısı...
		list.put(6, "Ankara");
		list.put(34, "İstanbul");
		list.put(1, "Adana");
		
		System.out.println(list);
		System.out.println("6 nın karşılığı: "+list.get(6));
		
		System.out.println("Adana value da var mı?: "+list.containsValue("Adana"));
		System.out.println("34 key de var mı?: "+list.containsKey(34));
		
		System.out.println("value listesi "+list.values());
		System.out.println("key listesi "+list.keySet());
		
		
	}

}
