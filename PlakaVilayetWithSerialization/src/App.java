import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner oku=new Scanner(System.in);
		HashMap<Integer,String> ilPlaka=new HashMap();
		
	
			
			try {
		         FileInputStream fileIn = new FileInputStream("Belgeler/belge2.ser");
		         ObjectInputStream in = new ObjectInputStream(fileIn);
		         ilPlaka = (HashMap) in.readObject();
		         in.close();
		         fileIn.close();
		      } catch (IOException i) {
		        System.out.println("Io excp �al��t�");
		         return;
		      } catch (ClassNotFoundException c) {
		         System.out.println(" class not found");		        
		         return;
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
				
			
					
					try {
				         FileOutputStream fileOut =new FileOutputStream("Belgeler/belge2.ser");
				         ObjectOutputStream out = new ObjectOutputStream(fileOut);
				         out.writeObject(ilPlaka);
				         out.close();
				         fileOut.close();
				         System.out.printf("Serialized data is saved in ( Belgeler/belge2.ser )");
				      } catch (IOException i) {
				        System.out.println("serialize edilemedi");
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
