package com.link_list;

public class Node {
    // Doubly Linear LinkList
	int data;
	Node next;
	Node prev;
	
	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node(int data) {
		this.data=data;
		this.next=null;
		this.prev=null;

	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
	
}
