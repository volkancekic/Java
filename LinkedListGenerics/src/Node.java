
public class Node<T> {
	private Node<T> nextNode;
	private Node<T> prevNode;
	private Object object;
	public Node(Node<T> nextNode, Node<T> prevNode, Object object) {
		super();
		this.nextNode = nextNode;
		this.prevNode = prevNode;
		this.object = object;
	}
	public Node<T> getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}
	public Node<T> getPrevNode() {
		return prevNode;
	}
	public void setPrevNode(Node<T> prevNode) {
		this.prevNode = prevNode;
	}
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
}
