package tutorial.two;

public class ClassTwo {
	
	Node head;
	int size;
	Node create(int x) {
		size++;
		return new Node(x);
	}
	public void add(int x) {
		if(head == null) {
			head = create(x);
			return;
		}
		Node temp = head;
		
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = create(x);
		
	}
	public void traverse() {
		if(head ==null) {
			System.out.println("The list is empty.");
			return ;
		}
		Node temp = head;
		while(temp!=null) {	
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println("The size of list is :" + size);

	}
	public static void main(String args[]) {
		ClassTwo ob = new ClassTwo();
		ob.add(1);
		ob.add(2);
		ob.add(3);
		ob.add(4);;
		
//		ob.addAtIdx(8, 0);
//		
		ob.traverse();
		
		ob.reverse();
		ob.traverse();
	}
	public void addAtFront(int x) {
		if(head == null) {
			head = create(x);
			return;
		}
		else {
			Node ob = create(x);
			ob.next = head;
			
			head = ob;
		}
	}
	public void addAtIdx(int data, int idx) {
		
		int pos = 0;
		Node temp = head;

		while(temp!=null && pos!=idx) {
			pos++;
			temp = temp.next;
		}
		
		Node ob = create(data);
		Node chika = temp.next;
		temp.next = ob;
		ob.next = chika;
		
		
	}
	
	public void reverse() {
		if(head == null || head.next == null) {
			return;
		}
		
		Node temp = head;
		Node prev = null;
		
		while(temp!=null) {
			Node next = temp.next;
			
			temp.next = prev;
			prev = temp;
			
			temp = next;
		}
		
		head = prev;
		
	}
	
}
class Node{
	int data ;
	Node next;
	Node(int data){
		this.data = data;
	}
}

