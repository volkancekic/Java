package com.student;

import java.util.Scanner;

public class StudentApp {
	public static Student [] stuList;	

	public static void main(String[] args) {
		String name,surname;
		int id,ogrSayisi;
		Scanner oku=new Scanner(System.in);
		System.out.print("Öðrenci Sayýsýný Giriniz: ");
		ogrSayisi=oku.nextInt();
		stuList=new Student[ogrSayisi];
		for(int i=0;i<ogrSayisi;i++) {
			System.out.print("Ad Soyad Id :");
			name=oku.next();
			surname=oku.next();
			id=oku.nextInt();
			stuList[i]=new Student(name,surname,id);
		}
		for(int i=0;i<ogrSayisi;i++) {
			System.out.println("Öðrenci "+i+" "+stuList[i]);
		}		
	}
}
