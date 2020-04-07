package com.InnerClass;

public class Inner { //inner=robot
	int id;
	
	
	public Inner(int id) {
		super();
		this.id = id;
		Brain b=new Brain();
		b.think();
	}
	

	private class Brain{
		public void think() {
			System.out.println(id+" thinking..");
		}
	}
	
	public static void main(String[] args) {
		Inner robot=new Inner(12);
		
		
	}
	
	
}
