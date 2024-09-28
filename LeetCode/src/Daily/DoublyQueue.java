package Daily;

public class DoublyQueue {

	int front;
	int rear;
	int size;
	int[] arr;
	int capacity;

	public DoublyQueue(int k) {
		capacity = k;
		arr = new int[capacity];
		rear = -1;
		front = -1;
		size = 0;

	}

	public boolean isFull() {
		return size == capacity;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	private boolean insertLast(int i) {
		if (isFull()) {
			return false;
		}
		if (rear == front) {
			arr[++rear] = i;
			size++;
			return true;
		}
		rear = (rear + 1) % capacity;
		arr[rear] = i;
		size++;
		return true;
	}

	private boolean deleteLast() {
		if (isEmpty()) {
			return false;
		}
		if (rear == front) {
			front = -1;
			return true;
		}
		front = (rear + 1) % capacity;
		size++;
		return true;
	}

	private int getRear() {
		if (isEmpty()) {
			return -1;
		}
		return arr[rear];
	}

	private int getFront() {
		if (isEmpty()) {
			return -1;
		}
		return arr[front];
	}

	private boolean deleteFront() {
		if (isEmpty()) {
			return false;
		}
		front = (rear + 1) % capacity;
		size++;
		return true;
	}

	private boolean insertFront(int value) {
		if (isFull()) {
			return false;
		}
		if (rear == -1) {
			arr[++rear] = value;
			size++;
			return true;

		}
		rear = (rear + 1) % capacity;
		arr[rear] = value;
		size++;
		return true;
	}

	public static void main(String[] args) {
		int k = 2;
		int value = 10;
		// Your MyCircularDeque object will be instantiated and called as such:
		DoublyQueue obj = new DoublyQueue(k);
		boolean param_1 = obj.insertFront(value); 
		boolean param_11= obj.insertFront(11);
		boolean param_01 = obj.insertFront(12);

		boolean param_2 = obj.insertLast(11);
		boolean param_3 = obj.deleteFront();
		boolean param_4 = obj.deleteLast();
		int param_5 = obj.getFront();
		int param_6 = obj.getRear();
		boolean param_7 = obj.isEmpty();
		boolean param_8 = obj.isFull();
		
		System.out.println(param_1+" "+param_11+" "+param_01);
		System.out.println(param_3+" "+param_4);
		System.out.println(param_5);
		System.out.println(param_6);
		

	}

}
