package com.queue;

import java.util.Iterator;

// memory not reused in  linear Queue  
 //using Array
public class LinearQueue {
	int rear;
	int front;
	int[] arr;
	int size;

	public LinearQueue(int size) {
		rear = -1;
		front = -1;
		this.size = size;
		arr = new int[size];
	}

	public void add(int num) {
		if (isfull()) {
			System.out.println("Queue is full ");
		}
		arr[++rear] = num;
		if(front==-1) {
			front=0; 
		}
		System.out.println("added in queue...");
	}

	public int delete() {
		if (isEmpty() && front > rear) {
			return -1;
		}

		if (front < size - 1) {
			return arr[++front];
		}
		return -1;
	}

	public boolean isEmpty() {
		return (front == -1 || rear < front);
	}

	public boolean isfull() {
		return size - 1 == rear;
	}

	public static void main(String[] args) {

		LinearQueue queue = new LinearQueue(3);

		queue.add(10);
		queue.add(20);
		queue.add(30);

		System.out.println(queue.isfull());

		System.out.println(queue.delete());
		System.out.println(queue.delete());
		System.out.println(queue.delete());

		// memory not reused in  linear Queue  
		System.out.println(queue.isEmpty());    // o/p: false

		// System.out.println(queue.delete() );

	}

}
