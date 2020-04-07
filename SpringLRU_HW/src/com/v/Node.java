package com.v;

public class Node {
	
	private Node nextNode;	
	private Kisi kisi;
	
	public Node(Node nextNode, Kisi kisi) {		
		this.nextNode = nextNode;		
		this.kisi = kisi;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	public Kisi getKisi() {
		return kisi;
	}

	public void setKisi(Kisi kisi) {
		this.kisi = kisi;
	}
	
	
	
	
}
