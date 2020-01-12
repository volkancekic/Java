import java.util.Scanner;

public class Triangle{

	public static void main(String[] args) {
		int boyut;
		Scanner oku=new Scanner(System.in);
		System.out.print("Boyut giriniz: ");
		boyut=oku.nextInt();
		
		int i,j;
		for(i=1;i<=boyut;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}

	}

}
