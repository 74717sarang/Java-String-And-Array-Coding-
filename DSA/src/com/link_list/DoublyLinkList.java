package com.link_list;

import javax.xml.crypto.Data;

public class DoublyLinkList {

	Node head;

	public DoublyLinkList() {
		head = null;
	}

	public void insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		}
		Node temp = head;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(newNode);
		newNode.setPrev(temp);
		newNode.setNext(null);
		System.out.println("Add Done..." + data);

	}

	public void display() {
		Node temp = head;
//		System.out.println("Display LinkList"); 
		while (temp != null) {
			System.out.print(temp.getData() + "->");
			temp = temp.getNext();
		}
		System.out.println("NULL");
		System.out.println();
	}

	public void insertPosition(int data, int pos) {
		Node newNode = new Node(data);
		if (pos == 1) {
			if (head != null) {
				newNode.setPrev(head);
				head.setPrev(newNode);
			}
			head = newNode;
		}
		Node prevNode = head;
		for (int i = 1; i < pos - 1; i++) {
			prevNode = prevNode.getNext();
		}
		Node nextNode = prevNode.getNext();

		// sequence does not matter in java
		newNode.setPrev(prevNode);
		prevNode.setNext(newNode);
		newNode.setNext(nextNode);
		nextNode.setPrev(newNode);
	}

	public void deleteByPos(int pos) {
		if (pos == 1) {
			head = head.getNext();
		}
		Node currNode = head;
		for (int i = 1; i < pos - 1; i++) {
			currNode = currNode.getNext();
		}
		Node nextNode = currNode.getNext().getNext();

		currNode.setNext(nextNode);
		nextNode.setPrev(currNode);
		System.out.println("done");

	}
 
	public boolean deleteByValue(int val) {
		if(head==null) {
			return false;
		}
		if(val==head.getData()) {
			head=head.getNext();
			return true;
		}
		
		Node currentNode=head;
		while(val!=currentNode.getData()) {
			currentNode=currentNode.getNext();
					
		}
		Node nextNode=currentNode.getNext();
		Node prevNode=currentNode.getPrev();
		currentNode.setNext(currentNode.getNext());
		prevNode.setNext(nextNode);
		nextNode.setPrev(nextNode);
		return true; 
		
	}
	
	
	
	public static void main(String[] args) {
		DoublyLinkList doublyLinkList = new DoublyLinkList();
		doublyLinkList.insert(5);
		doublyLinkList.insert(4);
		doublyLinkList.insert(3);
		doublyLinkList.insert(2);
		doublyLinkList.insert(1);
		doublyLinkList.display();

		System.out.println("Afet Add 10 Pos 2...");
		doublyLinkList.insertPosition(10, 2);
		doublyLinkList.display();

//		doublyLinkList.deleteByPos(1);
//        System.out.println("Afet delete  Pos 1...");
//		doublyLinkList.display();

//		doublyLinkList.deleteByPos(3);
//		System.out.println("Afet delete  Pos 2...");
//		doublyLinkList.display();
		
		
		System.out.println(doublyLinkList.deleteByValue(3)); 
		System.out.println("Afet delete  Value 3...");
		
		
		doublyLinkList.display();
	}

}
