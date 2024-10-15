package com.queue;

public class CircularQueue {
	//memory reuse is possible
	
	int size;
	int []arr;
	int rear;
	int front;
	
	public CircularQueue(int size) {
		this.size=size;
		arr=new int[size];
		rear=-1;
		front=-1;
	}
	
	public boolean isEmpty() {
		return front==rear;
	}
	
	public boolean isFull() {
		return ((rear+1)%size==front)|| (front==-1 &&rear==size-1);
	}
	
	
	public void insert(int data) {
		if(!isFull()) {
			rear=(rear+1)%size;
			arr[rear]=data;
			System.out.println("add Done..."+data);
			
		}
		else {
			System.out.println("Not space.....");
		}
	}
	
	public int delete() {
		if(!isEmpty()) {
			front=(front+1)%size;
			 return arr[front];
		}
		return -1;
		
	}
	
	
	
	public static void main(String[] args) {
		int size=5;
		CircularQueue circularQueue=new CircularQueue(size);
		System.out.println(circularQueue.isEmpty());
		System.out.println(circularQueue.isFull());
		circularQueue.insert(1) ;
		circularQueue.insert(2) ;
		circularQueue.insert(3) ;
		circularQueue.insert(4) ;
		circularQueue.insert(5) ;
		circularQueue.insert(6) ;
		System.out.println(circularQueue.delete());
		System.out.println(circularQueue.delete());
		System.out.println(circularQueue.delete());
		System.out.println(circularQueue.delete());
		System.out.println(circularQueue.delete());
		System.out.println(circularQueue.delete());
		
	}
}
