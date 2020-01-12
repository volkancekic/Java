import java.util.Scanner;

public class StandardDeviation{

	public static void main(String[] args) {
		
		int i,toplam=0,karetoplam=0;
		int[] notlar=new int[5];
		Scanner oku=new Scanner(System.in);
		
		for(i=0;i<notlar.length;i++) {
			System.out.print((i+1)+". notu giriniz: ");
			notlar[i]=oku.nextInt();
			toplam+=notlar[i];
		}		
		
		double ortalama=(double)toplam/5;
		
		int[] farkkare=new int[5];
		for(i=0;i<farkkare.length;i++) {
			farkkare[i]=(int) Math.pow((notlar[i]-ortalama),2); //fark alýnýp kareleri bulundu
			karetoplam+=farkkare[i]; //bulunan kareler toplandý
			
		}
		double ssapma=karetoplam/4;
		ssapma=Math.sqrt(ssapma);
		System.out.println("Ortalama : "+ortalama+"\nStandart Sapma : "+ssapma);
		
		
		

	}

}
