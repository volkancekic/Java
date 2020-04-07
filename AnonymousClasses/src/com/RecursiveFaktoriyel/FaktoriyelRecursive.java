package com.RecursiveFaktoriyel;

import java.util.Scanner;

public class FaktoriyelRecursive {

	public static void main(String[] args) {
		
		Scanner oku=new Scanner(System.in);
		System.out.print("sayi giriniz: ");
		int sayi=oku.nextInt();
		System.out.println("sonuc: "+faktoriyel(sayi));

	}
	public static int faktoriyel(int sayi) {
		
		if(sayi==1 || sayi==0) {
			return 1;
		}
		else {
			return sayi*faktoriyel(sayi-1);
			
		}
	}
}
