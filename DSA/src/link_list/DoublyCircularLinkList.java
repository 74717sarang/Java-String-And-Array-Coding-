package link_list;

public class DoublyCircularLinkList {

	Node head;

	public  DoublyCircularLinkList() {
		this.head = null;
	}

	public void insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			head.setNext(head);
		}
		Node temp = head;
		// last node not null point to head
		while (temp.getNext() != head) {
			temp = temp.getNext();
		}
		newNode.setPrev(temp);
		newNode.setNext(head);
		// head=newNode; for reverse print
		temp.setNext(newNode);
		System.out.println("Done..." + data);
	}

	void display() {
		Node temp = head;
		do {
			System.out.print(temp.getData() + "->");
			temp = temp.getNext();
		} while (temp != head);
		System.out.println(head.getData());
	}

	public int deleteByPosition(int pos) {
		if (head == null) {
			return -1;
		}
		if (pos == 1) {
			int d = head.getData();
			//head = null;
		 Node last=head;
		 while(last!=head) {
			 last=last.getNext();
		 }
		 head=head.getNext();
		 last.setNext(head);			
	
			return d;
		}
		Node currentNode = head;
		for (int i = 1; i < pos - 1; i++) {
			currentNode = currentNode.getNext();
		}
		int d = currentNode.getNext().getData();

		Node nextNode = currentNode.getNext().getNext();
		if (nextNode != head) {
			currentNode.setNext(nextNode);
			nextNode.setPrev(currentNode);
			return d;
		}
		return -1;
	}

	public void insertPosition(int data,int pos) {
		Node newNode=new Node(data);
		if(newNode==null || pos<=0 ) {
			System.out.println("is Null");
		}
		if(pos==1) {
			if(head==null) {
				head=newNode;
				head.setNext(head);
			}
		}	
		Node prev=head;

		
		 for(int i=1;i<pos-1;i++) {
			 prev=prev.getNext();
		 }
	    
		 Node nextNode = prev.getNext(); // Save the next node
		 prev.setNext(newNode);
	    newNode.setNext(nextNode);
//	    prev.getNext().setPrev(newNode);
		
		
		
	}
	
	
	public boolean deleteByValue(int val) {
		if(head==null) {
			return false;
		}
		if(head.getData()==val) {
			head=head.getNext();
		}
		
		Node temp=head;
		while(temp.getData()!=val) {
			temp=temp.getNext();
		}
		Node nextNode=temp.getNext();
		nextNode.setPrev(temp.getPrev());		
		temp.getPrev().setNext(nextNode);
		return true;
	}
	
	public static void main(String[] args) {
		
		DoublyCircularLinkList circularLinkList=new DoublyCircularLinkList();
		
		circularLinkList.insert(1);
		circularLinkList.insert(2);
		circularLinkList.insert(3);
		circularLinkList.insert(4);
		circularLinkList.insert(5);

		circularLinkList.display();

		
//		System.out.println(circularLinkList.deleteByPosition(1));
//		System.out.println("Delete After pos 1");
//		circularLinkList.display();
		
		
		System.out.println(circularLinkList.deleteByPosition(3));
		System.out.println("Delete After pos 3");
		circularLinkList.display();

		
		circularLinkList.insertPosition(10,2);
		System.out.println("Add After pos 2");
		circularLinkList.display();
		
		
		circularLinkList.deleteByValue(4);
		System.out.println("Delete After deleteby Value 4");
		circularLinkList.display();
	}
}
