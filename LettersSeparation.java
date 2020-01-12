import java.util.Scanner;

public class LettersSeparation{

	public static String[] isimler=new String[50];
	public static String[] sesli= {"a","e","o","ö","ý","i","u","ü"};
	public static String[] sesliler=new String[50];
	public static String[] sessizler=new String[50];
	
	public static void main(String[] args) {
		Scanner oku=new Scanner(System.in);
		System.out.print("isimleri giriniz, bitirmek için boþluk giriniz: \n");
		int i=0;
		while(i!=51) {
			isimler[i]=oku.nextLine();
			if(isimler[i].isEmpty()) {
				break;
			}			
			i++;
		}
		int j,k,kntrl;
		
		 
		 for(j=0;j<i;j++) {
			 sesliler[j]="";
			 sessizler[j]="";
			String kelime=isimler[j];
			String harf;
			for(k=0;k<kelime.length();k++) {
				harf=kelime.substring(k,k+1);
				kntrl=0;
				for(int s=0;s<8;s++) {
					if(harf.equals(sesli[s])) {
						kntrl=1;
						String seslitemp=harf;						
						sesliler[j]=sesliler[j]+seslitemp;
						
						
					}
					if(s==7 && kntrl==0) {
						
							String sessiztemp=harf;							
							sessizler[j]=sessizler[j]+sessiztemp;
						
					}					
				}					
			}
			//System.out.println(isimler[j]);
			//System.out.println(sesliler[j]);
			//System.out.println(sessizler[j]);
		 }
		 int sayac=0;
		 System.out.println("Sesli Harfler: ");
		 while(sayac<i) {
			 System.out.println(sesliler[sayac]);
			 sayac++;
		 }
		 sayac=0;
		 System.out.println("Sessiz Harfler: ");
		 while(sayac<i) {
			 System.out.println(sessizler[sayac]);
			 sayac++;
		 }
		
		
		
		

	}

}
