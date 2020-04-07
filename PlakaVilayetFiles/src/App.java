import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner oku=new Scanner(System.in);
		HashMap<Integer,String> ilPlaka=new HashMap();
		File myFile=new File("Belgeler/belge2.txt");
		if(myFile.exists()) {
			Scanner dosyaOku;
			try {
				dosyaOku = new Scanner(myFile);
				while(dosyaOku.hasNext()) {
					Integer kod=dosyaOku.nextInt();
					String ad=dosyaOku.next();
					ilPlaka.put(kod, ad);
					
				}
				System.out.println(" *HashMap dosyadan g�ncellendi\n");
			} catch (FileNotFoundException e) {
				System.out.println(" *Hata olu�tu\n");
			}
			
		}else {
			System.out.println(" *Dosya okunamad�\n");
		}		
		
		int secim=0;
		while(secim!=4) {
			secim=menu();
			switch(secim) {
			case 1:
				System.out.print("\nil kodu ve �ehir ismi: ");
				try {
					oku=new Scanner(System.in);
					Integer plaka=oku.nextInt();
					String il=oku.next();
					ilPlaka.put(plaka, il);
					System.out.println(" *Ekleme ba�ar�l�\n");
				} catch (Exception e1) {
					System.out.println(" *Hatal� giri� yap�ld�\n");
				}				
				break;
			case 2:
				System.out.println("----------- Liste -----------");
				ilPlaka.forEach((key,value)->System.out.println(key+" "+value));				
				System.out.print("\nSilinecek il kodu: ");
				try {
					oku=new Scanner(System.in);
					Integer ilkodu=oku.nextInt();
					if(ilPlaka.containsKey(ilkodu)) {
					ilPlaka.remove(ilkodu);
					System.out.println(" *Silme ba�ar�l�\n");
					}else {
						System.out.println(" *Girdi�iniz kod bulunamad�\n");
					}
				} catch (Exception e1) {
					System.out.println(" *Hatal� giri� yap�ld�\n");
				}
				break;
			case 3:
				System.out.println("----------- Liste -----------");
				ilPlaka.forEach((key,value)->System.out.println(key+" "+value));
				break;
			case 4:
				secim=4;
				
				if(myFile.exists()) {
					try {
						Formatter frmt=new Formatter(myFile);
						ilPlaka.forEach((key,value)->frmt.format("%d %s\n", key,value));
						
						frmt.close();
					} catch (FileNotFoundException e) {
						System.out.println(" *Kay�t ��leminde hata olu�tu.\n");
					}
				}else {
					System.out.println(" *Dosya Bulunamad�.\n");
				}
				
				System.out.println("\n G�le g�le");
				break;	
			default:
				System.out.println("\n *Hatal� giri� yap�ld�\n");
				break;
			}
		}

	}
	public static int menu() {
		int secim=0;
		Scanner oku=new Scanner(System.in);
		System.out.println("--------- ANA MEN� ---------\nEkle    --> 1\nSil     --> 2\nListele --> 3\n��k��   --> 4\n\nSe�iminiz: ");
		try {
			secim=oku.nextInt();
			return secim;
		} catch (Exception e) {
			return secim -1;
		}
		
	}
	
	

}
