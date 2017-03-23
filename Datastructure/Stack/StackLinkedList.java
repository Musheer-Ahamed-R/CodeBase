public class StackLinkedList {

	Node root;

	public StackLinkedList() {

	}

	public void push(int item) {
		
		Node node = new Node(item);
		node.next = this.root;
		this.root = node;
	}

	public Node pop() {
		if(this.root == null) {
			System.out.println("The Stack is Empty. Stack UnderFlow");
			return null;
		}
		Node temp = this.root;
		this.root = this.root.next;
		return temp;
	}

	public Node peek() {
		if(this.root == null) {
			System.out.println("We are Sorry., The Stack is Empty");
			return null;
		}
		return this.root;
	} 

	public void print() {
		
		Node temp = this.root;
		while(temp != null) {
			System.out.print(temp+"  ");
			temp = temp.next;
		}
		System.out.println();
	}

}

class Node {

	public int data;
	public Node next;

	public Node(int data) {
		this.data = data;
	}

	public String toString() {
		return this.data+"";
	}

}



