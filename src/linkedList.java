public class linkedList {
	public Node head;
	public linkedList() {
	}
	public void makeNode(int data) {
		if (head==null) {
			head=new Node(data);
			return;
		}
		Node current = head;
		while(current.next!=null) {
			current=current.next;
		}
		current.next=new Node(data);
	}
	public void showList() {
		Node current =head;
		while(current.next!=null) {
			System.out.println(current.data);
			current=current.next;
		}
		System.out.println(current.data);
	}
	}
