import java.util.Scanner;

public class SingleDigitDivisors{

	public static void main(String[] args) {
		
		int sayi,sayac=0; 
		Scanner oku=new Scanner(System.in);
		System.out.print("Bir Say� Giriniz (1-100) : ");
		sayi=oku.nextInt(); 		//klavyeden say� al�nd�.
		if((sayi>1) && (sayi<100)) {
			System.out.print(sayi+" Say�s�n�n tek haneli b�lenleri: ");
				if((sayi%2)==0) { 
					System.out.print("2");
					sayac++; //sayac, b�lenleri listelerken araya virg�l koyulacak m� belirlemek i�in kullan�lm��t�r.
				}					
				if((sayi%3)==0) {
						if(sayac!=0) {
							System.out.print(",");
						}
					System.out.print("3");
					sayac++;
				}
				if((sayi%4)==0) {
						if(sayac!=0) {
							System.out.print(",");
						}
					System.out.print("4");
					sayac++;
				}
				if((sayi%5)==0) {
						if(sayac!=0) {
							System.out.print(",");
						}
					System.out.print("5");
					sayac++;
				}
				if((sayi%6)==0) {
						if(sayac!=0) {
							System.out.print(",");
						}
					System.out.print("6");
					sayac++;
				}
				if((sayi%7)==0) {
						if(sayac!=0) {
							System.out.print(",");
						}
					System.out.print("7");
					sayac++;
				}
				if((sayi%8)==0) {
						if(sayac!=0) {
							System.out.print(",");
						}
					System.out.print("8");
					sayac++;
				}
				if((sayi%9)==0) {
						if(sayac!=0) {
							System.out.print(",");
						}
					System.out.print("9");
					sayac++;
				}
				if(sayac==0) { //sayac 0'sa say�n�n 2-9 aras�nda tam b�leni yoktur.
					System.out.print(" * Say�n�n 2-9 aras�nda tam b�leni yoktur. * ");
				}
		}					
		else {
			System.out.println("Hatal� Giri� Yap�ld�.");
		}
	}
}