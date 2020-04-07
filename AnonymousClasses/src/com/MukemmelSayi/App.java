package com.MukemmelSayi;

import java.util.Scanner;

public class App {
	public static Scanner oku=new Scanner(System.in); 
	public static void main(String[] args) {
		
		int secim=0;
		while(secim!=3) {
		secim=menu();
		int sayi;
		switch(secim){
		case 1:
			System.out.print("Say� Giriniz: ");
			sayi=oku.nextInt();
			if(sayi==mukemmelmi(sayi)) {
				System.out.println(sayi+" Say�s� M�kemmel Say�d�r.");
			}else {
				System.out.println(sayi+" Say�s� M�kemmel Say� De�il.");
			}			
			break;
		case 2:
			System.out.print("Hangi Say�ya Kadar Listelenecek?: ");
			int limit=oku.nextInt();
			mukemmelsayilar(limit);			
			break;
		case 3:
			System.out.println("G�le g�le.");
			break;	
		}
	  }
	}
	public static int menu() {
		System.out.print("\n-------------------------------------------------\nNe yapmak "
				+ "istiyorsun?\n1--> Say� M�kemmel mi?\n2--> Bir Say�ya Kadar "
				+ "Olan M�kemmel Say�lar\n3--> ��k��\nSe�iminiz:  ");
		int secenek=oku.nextInt();
		return secenek;
	}
	public static int mukemmelmi(int sayi) {
		int sonuc=0;
		for(int i=1;i<sayi;i++) {
			if(sayi%i==0) {
				sonuc+=i;
			}
		}
		return sonuc;
	}
	public static void mukemmelsayilar(int limit) {
		
		/* for(int i=2;i<limit;i++) { //1 m�kemmel de�il 2 den ba�lad�
			int sonuc=0;
			for(int j=1;j<i;j++) {
				if(i%j==0) {
					sonuc+=j;
				}				
			}
			if(i==sonuc) {
				System.out.println(i);
			}			
		} */
									 
		for(int i=2;i<limit;i++) {  //1 m�kemmel de�il 2 den ba�lad�
			int sonuc=mukemmelmi(i);
			if(sonuc==i) {
				System.out.println(i);
			}
		}
	}
}
