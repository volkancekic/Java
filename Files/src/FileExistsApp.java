import java.io.File;

public class FileExistsApp {

	public static void main(String[] args) {
		
		File myFile=new File("Belgeler\\belge.txt"); //   / veya \\ ikiside aynýdýr dosya için
		System.out.println(myFile.exists());
		System.out.println(myFile.getAbsolutePath());
		

	}

}
