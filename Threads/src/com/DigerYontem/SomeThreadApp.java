package com.DigerYontem;

public class SomeThreadApp {

	public static void main(String[] args) {
		
		System.out.println("runnable oluşturuyorum.");
		SomeThread somethread=new SomeThread();
		System.out.println("runnable ile thread oluşturuyorum.");
		Thread myThread=new Thread(somethread);
		
		//Thread myThread=new Thread(new SomeThread); şeklindede tek satır yazılabilir.
		
		System.out.println("thread başlatıyorum.");
		myThread.start();
		System.out.println("bitiş..");

	}

}
