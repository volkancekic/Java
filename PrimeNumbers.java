import java.util.Scanner;

public class PrimeNumbers{

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int sayi,i,j,sayac=0;
		Scanner oku=new Scanner(System.in);
		System.out.print("Limit giriniz: "); 	
		sayi=oku.nextInt();													//Limit al�nd�.
		if((sayi>=2)) {System.out.println("Asal Say�lar:\n2"); sayac++; }	//2 say�s� asald�r.
		for(i=2;i<=sayi;i++) {						
			for(j=2;j<i;j++) {
				if(i%j==0) {			//say� kendisinden ve 1 den ba�kas�na tam b�l�n�rse
					break;				//asal de�ildir.Bu durumda break ger�ekle�ir sonraki say�ya ge�er.
				}else if(i-j==1) {	//e�er i�erideki for son kez �al���yorsa ve break �al��mad�ysa o say�
					sayac++;		//asald�r ve sayac 1 artar.Sonra say� ekrana bas�l�r.
					System.out.println(+i);
				}					
			}			
		}		
		System.out.println("Toplam "+sayac+" adet asal say� bulundu.\n");
	}
}