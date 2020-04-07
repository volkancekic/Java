import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class FileWriteApp {

	public static void main(String[] args) {
	File myFile=new File("Belgeler/belge2.txt");
	
	try {
		Formatter fmtr=new Formatter(myFile);
		String s1="1";
		String s2="A";
		int x=12;
		double y=1.5;
		fmtr.format("%s\n", "omer");
		fmtr.format("%s\n", "karakas");
		fmtr.format("%s-%s\n", s1,s2);
		fmtr.format("%d\n", x);
		fmtr.format("%f\n", y);
		fmtr.close();
		
	} catch (FileNotFoundException e) {
		System.out.println("hata oluþtu.");
	}

	}

}
