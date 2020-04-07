package com.Stringpool;

public class StringPoolApp {

	public static void main(String[] args) {
	
		String s1="cat";
		String s2="cat";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));

		
		System.out.println("---------------------");
		
		String s3=new String("cat");
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println("---------------------");
		
		String s4=s1;
		System.out.println(s1==s4);
		System.out.println(s1.equals(s4));
		
System.out.println("---------------------");
		
		String s5=s3;
		System.out.println(s3==s5);
		System.out.println(s3.equals(s5));
		
System.out.println("---------------------");
		
		s5=new String("dog");
		System.out.println("s3:"+s3);
		
System.out.println("---------------------");
		
		String s6=new String("bird");
		System.out.println(s6);
		
		
	}

}
