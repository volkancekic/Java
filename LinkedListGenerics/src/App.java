
public class App {
	
	public static void main(String[] args) {
		
		BagliListe<String> b1=new BagliListe(0, null);
		
	
		System.out.println("String tipi baðlý liste");
		b1.add(	new String("ilk node."));
		b1.add(	new String("ikinci node"));		
		b1.printNodes();
		System.out.println("\nInteger tipi baðlý liste");
		
		BagliListe<Integer> b2=new BagliListe(0, null);
		
		b2.add(	new Integer(3));
		b2.add(	new Integer(4));		
		b2.printNodes();
		
		System.out.println("\nDouble tipi baðlý liste");
		
		BagliListe<Double> b3=new BagliListe(0, null);
		
		b3.add(	new Double(3.14));
		b3.add(	new Double(4.99));		
		b3.printNodes();
		
		System.out.println("\nDouble tipi baðlý listede arama");
		
		b3.contains(3.14);
		
		
	}
	

}
