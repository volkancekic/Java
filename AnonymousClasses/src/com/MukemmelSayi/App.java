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
			System.out.print("Sayý Giriniz: ");
			sayi=oku.nextInt();
			if(sayi==mukemmelmi(sayi)) {
				System.out.println(sayi+" Sayýsý Mükemmel Sayýdýr.");
			}else {
				System.out.println(sayi+" Sayýsý Mükemmel Sayý Deðil.");
			}			
			break;
		case 2:
			System.out.print("Hangi Sayýya Kadar Listelenecek?: ");
			int limit=oku.nextInt();
			mukemmelsayilar(limit);			
			break;
		case 3:
			System.out.println("Güle güle.");
			break;	
		}
	  }
	}
	public static int menu() {
		System.out.print("\n-------------------------------------------------\nNe yapmak "
				+ "istiyorsun?\n1--> Sayý Mükemmel mi?\n2--> Bir Sayýya Kadar "
				+ "Olan Mükemmel Sayýlar\n3--> Çýkýþ\nSeçiminiz:  ");
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
		
		/* for(int i=2;i<limit;i++) { //1 mükemmel deðil 2 den baþladý
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
									 
		for(int i=2;i<limit;i++) {  //1 mükemmel deðil 2 den baþladý
			int sonuc=mukemmelmi(i);
			if(sonuc==i) {
				System.out.println(i);
			}
		}
	}
}
