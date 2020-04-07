import java.util.InputMismatchException;
import java.util.Scanner;

public class xceptionApp {

	public static void main(String[] args) {
		Scanner oku=new Scanner(System.in);
		int x=10;
		System.out.println("x = "+x);
		
		System.out.print("Tell me x: ");
		
		
		try {
			x=oku.nextInt();
			System.out.println("input= "+x);			
			
			String isim=null;
			System.out.println(isim.charAt(1));
		} catch (InputMismatchException e) {
			
			System.out.println("not a valid int value.");
			System.out.println(e);
		}catch (NullPointerException e) {
			
			System.out.println("String is empty.");
			System.out.println(e);
		}catch (Exception e) {
			
			System.out.println("her türlü hata olmuþ olabilir...");
			System.out.println(e);
		}
		
	}

}
