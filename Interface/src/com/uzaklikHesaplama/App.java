package com.uzaklikHesaplama;

public class App {

	public static void main(String[] args) {
		
		Point first=new Point(6,5);
		Point second=new Point(3,1);
		
		System.out.println("Distance(0,0)="+first.distance());
		System.out.println("Distanse(second)="+first.distance(second));
		System.out.println("Distance(2,2)="+first.distance(2,2));
		Point point=new Point();
		System.out.println("Distance()="+point.distance());
				
	}

}
