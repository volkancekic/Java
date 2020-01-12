import java.util.Scanner;

public class Obeb {

	public static void main(String[] args) {
		
		int sayi1=1,sayi2,sonuc=1;
		Scanner oku=new Scanner(System.in);
		
		while(sayi1!=0) {
			System.out.print("Obeb hesaplamasý yapýlacak 2 sayý giriniz (çýkmak için 0 giriniz) : ");
			sayi1=oku.nextInt();
			if(sayi1==0) {   //0 girilirse döngü bitirilir ekrana güle güle yazýlýr
				break;
			}
			sayi2=oku.nextInt();
			if(sayi2<sayi1) {   //küçük olan sayý1'de  deðilse yer deðiþirler
				int temp=sayi1;
				sayi1=sayi2;
				sayi2=temp;
				
			}
			for(int i=2;i<=sayi1;i++) { //küçük sayýya kadar kontrol yapýlýr
				if((sayi1%i==0) && (sayi2%i==0)) {
					sonuc=i;
					
				}
			}
			
			System.out.print(sayi1+" ve "+sayi2+" sayýlarýnýn obeb'i : "+sonuc+"\n" );
		}
		System.out.print("\nGüle güle..");
		

	}

}
