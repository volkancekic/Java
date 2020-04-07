
public class BagliListe<T> {
	
	private int size;
	private Node<T> firstNode;	
	
	public BagliListe(int size, Node<T> firstNode) {
		super();
		this.size = size;
		this.firstNode = firstNode;
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public Node<T> getFirstNode() {
		return firstNode;
	}
	public void setFirstNode(Node<T> firstNode) {
		this.firstNode = firstNode;
	}
	public void add(Object object) {
		Node<T> n1=new Node<T>(null, null, object);
		if(getSize()==0) {			
			setFirstNode(n1);			
			setSize(getSize()+1);
		}else {
			Node<T> imlec=getFirstNode();
			for(int i=0;i<(getSize()-1);i++) {
				imlec=imlec.getNextNode();
			}
			imlec.setNextNode(n1);
			setSize(getSize()+1);
		}
		
	}
	public void addToLocation(int location,Object object) {
		
		Node<T> imlec=getFirstNode();
		if(location==1) {
			Node<T> n1=new Node<T>(imlec, null, object);
			setFirstNode(n1);
			setSize(getSize()+1);
		}else {
		for(int i=0;i<location-2;i++) {
			imlec=imlec.getNextNode();
		}
		Node<T> n1=new Node<T>(imlec.getNextNode(), null, object);
		imlec.setNextNode(n1);
		setSize(getSize()+1);
		}
	}
	public void remove(Object object) {
		Node<T> imlec=getFirstNode();
		if(getSize()==1 && (imlec.getObject()).equals(object)) {
			setFirstNode(null);
			setSize(getSize()-1);
			System.out.println("Elimizdeki son node silindi.");
		}else if(getSize()>1 && (imlec.getObject()).equals(object)) {
			setFirstNode(imlec.getNextNode());
			setSize(getSize()-1);
			System.out.println("First node silindi.");
		}
		for(int i=0;i<getSize()-1;i++) {
			if((imlec.getNextNode().getObject()).equals(object) && ((i+1)==(getSize()-1))) {
					imlec.setNextNode(null);
					setSize(getSize()-1);
					System.out.println("Sondaki node silindi.");					
			}else if((imlec.getNextNode().getObject()).equals(object)) {
				imlec.setNextNode((imlec.getNextNode()).getNextNode());
				setSize(getSize()-1);
				System.out.println("Silme iþlemi baþarýlý.");
			}
			imlec=imlec.getNextNode();
			
		}
		
		
	}
	public void contains(Object object) {
		Node<T> imlec=getFirstNode();
		for(int i=0;i<=getSize()-1;i++) {
			if(imlec.getObject().equals(object)) {
				System.out.println("aranan obje( "+object+" ) "+(i+1)+". node'da bulundu");
			}
			imlec=imlec.getNextNode();
		}
	}
	public void printNodes() {
		Node<T> imlec=getFirstNode();
		for(int i=0;i<=getSize()-1;i++) {
			System.out.println("node"+(i+1)+" --> "+imlec.getObject());
			imlec=imlec.getNextNode();
		}
	}
	
}
