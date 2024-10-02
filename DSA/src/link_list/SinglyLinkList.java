package link_list;

public class SinglyLinkList {

	private Node head;

	public SinglyLinkList() {
		head = null;
	}

	public void add(int data) {
		if (head == null) {
			head = new Node(data);
		}
		Node temp = head;
		Node newNode = new Node(data);

		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(newNode);
	}

	public void addLast(int data) {

		Node newNode = new Node(data);
		Node temp = head;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(newNode);
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.getNext();
		}
		System.out.print("null");
		System.out.println();
	}

	public void addFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		}
		Node temp = head.getNext();
		newNode.setNext(temp);
		head = newNode;
	}

	public void deleteFirst() {
		head = head.getNext();
	}

	public void deleteLast() {

		if (head == null) {
			System.out.println("Head is empty..");
		}

		Node temp = head;
		while (temp.getNext().getNext() != null) {
			temp = temp.getNext();
		}

		temp.setNext(null);
	}

	public void addPos(int pos,int data) {
		Node newnode=new Node(data);
		if(head ==null) {
			head=newnode;
		}
		Node temp=head;
		if(pos==1) {
			newnode.setNext(temp.getNext());
			head=newnode; 
		}
	    for(int i=1;i<pos-1;i++) {
	    	temp=temp.getNext();
	    }
	    newnode.setNext(temp.getNext());
	     temp.setNext(newnode);
	}
	
	
	public void deletePos(int pos) {

		if (head == null) {
			System.out.println("Head is empty..");
		}
		
		if(pos==1) {
			head=head.getNext();
		}
		Node curr=head;
		for(int i=1;i<pos-1;i++) {
			curr=curr.getNext();
		}
	    curr.setNext(curr.getNext().getNext()); 	
	}
	
	
	
	
	public static void main(String[] args) {

		SinglyLinkList s = new SinglyLinkList();
		s.add(1);
		s.add(10);
		s.add(100);
		s.add(1000);
		s.addLast(101);
		s.addLast(102);
		s.addLast(103);
		s.addLast(104);
		System.out.println("Normal LinkList...");
		s.display();
		s.addFirst(11);
		System.out.println("After add first Node...");
		s.display();
		
		System.out.println("After Delete first Node...");
		s.deleteFirst();
		s.display();
		
		System.out.println("After Delete Last Node...");
		s.deleteLast();
		s.display();
		
		System.out.println("After Add between Pos Node...");
		s.addPos(3,50);
		s.display();
		
		System.out.println("After delete between Pos Node...");
		s.deletePos(3);
		s.display();
		
	}

}
