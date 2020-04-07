package com.v;

public class BagliListe {
	
	private int size;
	private Node firstNode;
	
	public BagliListe() {
		this.size=0;
	}	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public Node getFirstNode() {
		return firstNode;
	}
	public void setFirstNode(Node firsNode) {
		this.firstNode = firsNode;
	}
	public void add(Kisi k) {
		Node n1=new Node(null,k);
		if(getSize()==0) {			
			setFirstNode(n1);			
			setSize(getSize()+1);
		}else {
			Node first=getFirstNode();			
			n1.setNextNode(first);			
			setFirstNode(n1);
			setSize(getSize()+1);
		}
		
	}	
	public void removeLastNode() {
		Node imlec=getFirstNode();		
		
			for(int i=0;i<(getSize()-1);i++) {
				imlec=imlec.getNextNode();
			}
			imlec.setNextNode(null);
			setSize(getSize()-1);			
				
		
	}
	public void contains(Kisi k) {
		
		Node imlec=getFirstNode();
		for(int i=0;i<=getSize()-1;i++) {
			if(imlec.getKisi().toString().equals(k.toString())) {
				imlec=getFirstNode();
				for(int j=0;j<i-1;j++) {					
					imlec=imlec.getNextNode();					
				}
				if(i==getSize()-1) { //tekrar eden eleman en sondaki ise next->nexti yok 
					imlec.setNextNode(null);
					setSize(getSize()-1);
				}
				else if(i==0){//üst üste ayný eleman eklenirse
					setFirstNode(imlec.getNextNode());
					setSize(getSize()-1);
				}else {
				imlec.setNextNode(imlec.getNextNode().getNextNode());
				setSize(getSize()-1);
				}
				break;
			}
			imlec=imlec.getNextNode();
		}
	}
	public void printNodes() {
		
		Node imlec=getFirstNode();
		System.out.println("----------------------");
		if(imlec!=null) {
		for(int i=0;i<=getSize()-1;i++) {
			System.out.println("node"+(i+1)+" --> "+imlec.getKisi());
			imlec=imlec.getNextNode();
		}
		}else {
			System.out.println("Baðlý Listede Node yok.");
		}
	}
	
	
}
