package com.DigerYontem;

public class SomeThreadApp {

	public static void main(String[] args) {
		
		System.out.println("runnable oluþturuyorum.");
		SomeThread somethread=new SomeThread();
		System.out.println("runnable ile thread oluþturuyorum.");
		Thread myThread=new Thread(somethread);
		
		//Thread myThread=new Thread(new SomeThread); þeklindede tek satýr yazýlabilir.
		
		System.out.println("thread baþlatýyorum.");
		myThread.start();
		System.out.println("bitiþ..");

	}

}
