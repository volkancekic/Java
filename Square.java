import java.util.Scanner;

public class Square{

	public static void main(String[] args) {
		
		
		int boyut;
		Scanner oku=new Scanner(System.in);
		
		System.out.print("boyut giriniz: ");
		boyut=oku.nextInt();
		
		int i,j;
		
		for(i=0;i<boyut;i++) {
			
			for(j=0;j<boyut;j++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}

	}

}
