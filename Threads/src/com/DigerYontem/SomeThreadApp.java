package com.DigerYontem;

public class SomeThreadApp {

	public static void main(String[] args) {
		
		System.out.println("runnable olu�turuyorum.");
		SomeThread somethread=new SomeThread();
		System.out.println("runnable ile thread olu�turuyorum.");
		Thread myThread=new Thread(somethread);
		
		//Thread myThread=new Thread(new SomeThread); �eklindede tek sat�r yaz�labilir.
		
		System.out.println("thread ba�lat�yorum.");
		myThread.start();
		System.out.println("biti�..");

	}

}
