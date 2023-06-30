package queue;

public class oneDQueue {
	
	Node head;
	Node last;
	
	public Node create(int d) {
		return new Node(d);
	}
	
	public void add(int d) {
		Node ob = create(d);
		
		if(head == null) {
			head = ob;
			last = ob;
			
			return;
		}
		
		last.next = ob;
		last = ob;
		
	}
	
	public Node remove() {
		if(head == null) {
			System.out.println("The queue is empty");
			return null;
		}
		
		Node temp = head;
		head = head.next;
		
		return temp;
		
	}
	public void traverse() {
		if(head == null) {
			System.out.println("The queue is empty.");
			return;
		}
		
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ,");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String args[])  {
		oneDQueue ob = new oneDQueue();
		
		ob.add(1);
		ob.add(2);
		ob.add(3);
		ob.traverse();
		ob.remove();
		ob.traverse();
		ob.remove();
		ob.traverse();
		ob.add(5);
		ob.traverse();
		
		
		
    }

	
}
class Node{
	int data;
	Node next;
	Node(int d){
		data = d;
	}
}
