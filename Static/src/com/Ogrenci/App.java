package com.Ogrenci;

public class App {

	public static void main(String[] args) {
		
		Ogrenci[] list=new Ogrenci[5];
		for(int i=0;i<5;i++) {
			list[i]=new Ogrenci("Ali"+i);
			System.out.println("-"+list[i].id+" nolu öğrenci "+list[i].name+" kaydedilmiştir.");
		}
	System.out.println("ilk elemanın id si: "+list[0].id);
	}
}
