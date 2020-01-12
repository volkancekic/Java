import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		int en,boy;
		Scanner oku=new Scanner(System.in);
		System.out.print("Enini Giriniz: ");
		en=oku.nextInt();
		System.out.print("Boyunu Giriniz: ");
		boy=oku.nextInt();
		
		int i,j;
		
		for(i=0;i<en;i++) {
			for(j=0;j<boy;j++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}

	}

}
