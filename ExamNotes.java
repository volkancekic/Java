import java.util.Scanner;

public class ExamNotes{

	public static int i,j;
	
	
	public static void main(String[] args) {
		int boyut,toplam=0;
		Scanner oku=new Scanner(System.in);
		System.out.print("Toplam Öðrenci Sayýsý: ");
		boyut=oku.nextInt();		
		int[] notlar=new int[boyut];
		String[] ad=new String[boyut];
		String[] soyad=new String[boyut];
		
		for(i=0;i<boyut;i++) {
			
			System.out.print((i+1)+") "+"Ad Soyad Not ");
			ad[i]=oku.next();			
			soyad[i]=oku.next();
			notlar[i]=oku.nextInt();
			if(notlar[i]<0  || notlar[i]>100) {
				System.out.println("Hatalý giriþ.Tekrar giriniz.");
				i--;
				continue;
			}
			toplam+=notlar[i];				
		}	
		ortalama(toplam,boyut);
		minmax(ad,soyad,notlar);
		ortalamaaltust(ad,soyad,notlar,toplam);

	}
	public static void ortalama(int toplam,int boyut) {
		double sonuc=(double)toplam/boyut;
		System.out.println("\nOrtalama : "+(sonuc));				
	}
	public static void minmax(String[] ad,String[] soyad,int[] notlar) {
		int max=0,min=0,temp=notlar[0];
		for(i=0;i<notlar.length;i++) {
				if(notlar[i]>temp) {
					temp=notlar[i];
					max=i;
				}
		}
		temp=notlar[0];
		for(i=0;i<notlar.length;i++) {
			if(notlar[i]<temp) {
				temp=notlar[i];
				min=i;
			}		
			}			
		System.out.println("Maksimum: "+ad[max]+" "+soyad[max]+" "+notlar[max]+"\nMinimum: "+ad[min]+" "+soyad[min]+" "+notlar[min]);
	}
	public static void ortalamaaltust(String[] ad,String[] soyad,int[] notlar,int toplam) {
				double ort=(double)toplam/notlar.length;
				System.out.println("Ortalama üstündeki öðrenciler: ");
				for(i=0;i<notlar.length;i++) {
					if(notlar[i]>ort) {
						System.out.print("*"+ad[i]+" "+soyad[i]+" "+notlar[i]+"\n");
					}
				}
				System.out.println("Ortalama altýndaki öðrenciler: ");
				for(i=0;i<notlar.length;i++) {
					if(notlar[i]<ort) {
						System.out.print("*"+ad[i]+" "+soyad[i]+" "+notlar[i]+"\n");
					}
				}
	}
	

}
