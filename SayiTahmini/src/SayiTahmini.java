import java.util.Random;
import java.util.Scanner;

public class SayiTahmini {

	private static int getRandomNumberInRange(int min,int max) {
		if(min>=max) {
			throw new IllegalArgumentException("max must be greater than min");
		}
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	public static void main(String[] args) {
		Scanner oku=new Scanner(System.in);
		System.out.print("Tuttu�um say�y� tahmin "
				+ "edebilecek misin?\nAral�k girin (100 999 gibi): ");
		int min=oku.nextInt();
		int max=oku.nextInt();
		int number=getRandomNumberInRange(min,max);
		int guess=0;		
		while(guess!=number) {
			System.out.print("tahmin: ");
			guess=oku.nextInt();
			if(guess<number) {
				System.out.println("Eksik S�yledin.");
				continue;
			}
			else if(guess>number) {
				System.out.println("Fazla S�yledin.");
				continue;
			}
			else if(guess==number) {
				System.out.println("Tebrikler, bildiniz.Tuttu�um say� "+number+"\nG�le g�le.");
			}
		}
		

	}

}
