import java.util.Scanner;

public class ExceptionApp3{     // *Baþlýk* exception bizim tarafýmýzdan tanýmlandý

	public static void main(String[] args) {
		
		while(true) {
			try {
				writeMenu();
			} catch (MenuException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println(e.getMessage()); //mesajýmýzý basar ekrana
			}
		}

	}
	public static void writeMenu() throws MenuException {
		System.out.print("1--Seçenek1\n2--Seçenek2\n3--Seçenek3");
		Scanner oku=new Scanner(System.in);
		int secim=oku.nextInt();
		if(secim==1) 
			System.out.println("1 seçtiniz.");
		else if(secim==2) 
			System.out.println("2 seçtiniz.");
		else if(secim==3) 
			System.out.println("2 seçtiniz."); 
		else 
			throw new MenuException("yanlis secim");
		
	}
}	


