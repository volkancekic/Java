
public class Therad1 {

	public static void main(String[] args) {
		System.out.println("Hello  from main");
		AnyThread any=new AnyThread();
		//any.printMessages();
		any.start();
		//any.run(); kullanýrsak thread yapýsý kullanýlmaz normal sýralý yapýlýr.Start kullanýlmalý mutlaka
		System.out.println("good by my friends");
	}

}
