import java.util.Scanner;

public class InverseTriangle {

	public static void main(String[] args) {
		
		int boyut;
		Scanner oku=new Scanner(System.in);
		System.out.print("Boyut giriniz: ");
		boyut=oku.nextInt();
		
		int i,j;
		for(i=boyut;i>=1;i--) {
			for(j=i;j>=1;j--) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		
	}

}
