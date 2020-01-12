import java.util.Scanner;

public class FourOperations{

	public static void main(String[] args) {
		
		int sayi1,sayi2,sonuc=0;
		String islem="";
		
		
		Scanner oku=new Scanner(System.in);
		System.out.print("Ýþlem (Aralarda 1 bosluk olmalý) : "); 
		sayi1=oku.nextInt();		
		islem=oku.next();
		sayi2=oku.nextInt();	
		
		if(islem.equals("+")) {
			sonuc=sayi1+sayi2;		
		}
		else if(islem.equals("-")) {
			sonuc=sayi1-sayi2;			
		}
       		else if(islem.equals("/")) {
    	  		 sonuc=sayi1/sayi2;    	  
		}
       		else if(islem.equals("*")) {	
    	  		 sonuc=sayi1*sayi2;    	 
       		 }	
			
		System.out.println("iþlem sonucu: "+sayi1+" "+islem+" "+sayi2+" = "+sonuc);	

	}

}
