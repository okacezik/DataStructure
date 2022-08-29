package core;

//dersler-konular
public class Stack {

	private Node top;
	private int size;
	
	public Stack() {
		this.top = null;
		this.size = 0;
	}
	
	public void add(String data) {
		Node node = new Node(data);
		if(this.isEmpty()) {
			this.top = node; 
		}else {
			node.next = this.top;
			this.top = node;
		}
		this.size++;
	}
	
	public void showData() {
		if(this.isEmpty()) {
			System.out.println("list is empty...");
			return;
		}
		Node temp = this.top;
		System.out.println("LECTURES");
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public boolean isEmpty() {
		if(this.top == null) {
			return true;
		}
		return false;
	}
	
	public int size() {
		return this.size;
	}
	
}
