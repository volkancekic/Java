import java.util.Scanner;

public class PrimeNumbers{

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int sayi,i,j,sayac=0;
		Scanner oku=new Scanner(System.in);
		System.out.print("Limit giriniz: "); 	
		sayi=oku.nextInt();													//Limit alýndý.
		if((sayi>=2)) {System.out.println("Asal Sayýlar:\n2"); sayac++; }	//2 sayýsý asaldýr.
		for(i=2;i<=sayi;i++) {						
			for(j=2;j<i;j++) {
				if(i%j==0) {			//sayý kendisinden ve 1 den baþkasýna tam bölünürse
					break;				//asal deðildir.Bu durumda break gerçekleþir sonraki sayýya geçer.
				}else if(i-j==1) {	//eðer içerideki for son kez çalýþýyorsa ve break çalýþmadýysa o sayý
					sayac++;		//asaldýr ve sayac 1 artar.Sonra sayý ekrana basýlýr.
					System.out.println(+i);
				}					
			}			
		}		
		System.out.println("Toplam "+sayac+" adet asal sayý bulundu.\n");
	}
}