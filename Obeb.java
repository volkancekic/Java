import java.util.Scanner;

public class Obeb {

	public static void main(String[] args) {
		
		int sayi1=1,sayi2,sonuc=1;
		Scanner oku=new Scanner(System.in);
		
		while(sayi1!=0) {
			System.out.print("Obeb hesaplamas� yap�lacak 2 say� giriniz (��kmak i�in 0 giriniz) : ");
			sayi1=oku.nextInt();
			if(sayi1==0) {   //0 girilirse d�ng� bitirilir ekrana g�le g�le yaz�l�r
				break;
			}
			sayi2=oku.nextInt();
			if(sayi2<sayi1) {   //k���k olan say�1'de  de�ilse yer de�i�irler
				int temp=sayi1;
				sayi1=sayi2;
				sayi2=temp;
				
			}
			for(int i=2;i<=sayi1;i++) { //k���k say�ya kadar kontrol yap�l�r
				if((sayi1%i==0) && (sayi2%i==0)) {
					sonuc=i;
					
				}
			}
			
			System.out.print(sayi1+" ve "+sayi2+" say�lar�n�n obeb'i : "+sonuc+"\n" );
		}
		System.out.print("\nG�le g�le..");
		

	}

}
