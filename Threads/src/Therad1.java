
public class Therad1 {

	public static void main(String[] args) {
		System.out.println("Hello  from main");
		AnyThread any=new AnyThread();
		//any.printMessages();
		any.start();
		//any.run(); kullan�rsak thread yap�s� kullan�lmaz normal s�ral� yap�l�r.Start kullan�lmal� mutlaka
		System.out.println("good by my friends");
	}

}
