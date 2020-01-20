package com.uzaklikHesaplama;

public class Point {

	private int x,y;
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point() {
		super();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	double distance() { //0'a olan uzaklık hesabı		
		return Math.sqrt((x)*(x)+(y)*(y));
	}
	double distance(int x1,int y1) { 		
		return Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y));
	}
	double distance(Point p) { 		
		return Math.sqrt((p.x-x)*(p.x-x)+(p.y-y)*(p.y-y));
	}	
}
