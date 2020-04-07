
public class AnyThread extends Thread{
	public void printMessages() {
		System.out.println("helle, this is AnyThread...");
		try {
			Thread.sleep(3000); //3 saniye uyuyacak
		} catch (InterruptedException e) {
			System.out.println("Hata Olu�tu Sleep'te.");
		}
		System.out.println("uyand�m.");
	}

	@Override
	public void run() {
		System.out.println("this is me");
		printMessages();
	}
	
}
