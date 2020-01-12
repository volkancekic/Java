import java.util.Scanner;

public class ObebOkek {

	public static void main(String[] args) {
		
		int sayi1,sayi2,obeb=1,okek=1,i=2;
		Scanner oku=new Scanner(System.in);
		System.out.print("OBEB-OKEK'i hesaplanacak 2 sayý giriniz: ");
		sayi1=oku.nextInt();
		sayi2=oku.nextInt();
				
		while(i!=0) {
			if(sayi1%i==0 && sayi2%i==0) {
				System.out.println(sayi1+" - "+sayi2+" | "+i+" * " );
				sayi1=sayi1/i;
				sayi2=sayi2/i;				
				obeb*=i;
				okek*=i;
				continue;
			}
			else if(sayi1%i==0 && sayi2%i!=0) {
				System.out.println(sayi1+" - "+sayi2+" | "+i );
				sayi1=sayi1/i;				
				okek*=i;				
				continue;
			}
			else if(sayi1%i!=0 && sayi2%i==0) {
				System.out.println(sayi1+" - "+sayi2+" | "+i );
				sayi2=sayi2/i;				
				okek*=i;				
				continue;
			}
			else if(sayi1==1 && sayi2==1) {
				System.out.println(sayi1+" - "+sayi2+" | " );
				System.out.println("Obeb: "+obeb+"  Okek: "+okek);				
				break;
			}
			i++;
		}
		
		

	}

}
