import java.util.Scanner;

public class SingleDigitDivisors{

	public static void main(String[] args) {
		
		int sayi,sayac=0; 
		Scanner oku=new Scanner(System.in);
		System.out.print("Bir Sayı Giriniz (1-100) : ");
		sayi=oku.nextInt(); 		//klavyeden sayı alındı.
		if((sayi>1) && (sayi<100)) {
			System.out.print(sayi+" Sayısının tek haneli bölenleri: ");
				if((sayi%2)==0) { 
					System.out.print("2");
					sayac++; //sayac, bölenleri listelerken araya virgül koyulacak mı belirlemek için kullanılmıştır.
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
				if(sayac==0) { //sayac 0'sa sayının 2-9 arasında tam böleni yoktur.
					System.out.print(" * Sayının 2-9 arasında tam böleni yoktur. * ");
				}
		}					
		else {
			System.out.println("Hatalı Giriş Yapıldı.");
		}
	}
}