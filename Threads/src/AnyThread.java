
public class AnyThread extends Thread{
	public void printMessages() {
		System.out.println("helle, this is AnyThread...");
		try {
			Thread.sleep(3000); //3 saniye uyuyacak
		} catch (InterruptedException e) {
			System.out.println("Hata Oluþtu Sleep'te.");
		}
		System.out.println("uyandým.");
	}

	@Override
	public void run() {
		System.out.println("this is me");
		printMessages();
	}
	
}
