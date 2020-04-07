import java.util.Scanner;

public class ExceptionApp3{     // *Ba�l�k* exception bizim taraf�m�zdan tan�mland�

	public static void main(String[] args) {
		
		while(true) {
			try {
				writeMenu();
			} catch (MenuException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println(e.getMessage()); //mesaj�m�z� basar ekrana
			}
		}

	}
	public static void writeMenu() throws MenuException {
		System.out.print("1--Se�enek1\n2--Se�enek2\n3--Se�enek3");
		Scanner oku=new Scanner(System.in);
		int secim=oku.nextInt();
		if(secim==1) 
			System.out.println("1 se�tiniz.");
		else if(secim==2) 
			System.out.println("2 se�tiniz.");
		else if(secim==3) 
			System.out.println("2 se�tiniz."); 
		else 
			throw new MenuException("yanlis secim");
		
	}
}	


