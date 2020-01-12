import java.util.Scanner;

public class SymmetricalTriangle{

	public static void main(String[] args) {
		
		
		int boyut=1,i,j,k;
		Scanner oku=new Scanner(System.in);
		
		while(boyut!=0) {
		System.out.print("Boyut giriniz (Çýkmak için 0 giriniz.) : ");
		boyut=oku.nextInt();
		
		for(i=1;i<=boyut;i++) {
			for(j=i;j<=boyut;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		for(k=0;k<boyut;k++) {   			// ---- koyduk araya
			System.out.print("-");
		}
		for(i=1;i<=boyut;i++) {
			System.out.print("\n");
			for(k=i;k<boyut;k++) {           //alt kýsmýn boþluk ayarý
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
		}
		System.out.print("\n");
		
	}
		System.out.println("güle güle..");
		
	}

}
