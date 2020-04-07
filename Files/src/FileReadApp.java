import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadApp {

	public static void main(String[] args) {
		
		File myFile=new File("Belgeler/belge.txt");
		System.out.println(myFile.exists());
		try {
			Scanner oku=new Scanner(myFile);
			while(oku.hasNext()) {
				System.out.println(oku.next());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Dosya okumada hata var.");
		}
		
	}

}
