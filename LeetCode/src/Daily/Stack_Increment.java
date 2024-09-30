package Daily;

public class Stack_Increment {

	int top;
	int[] arr;
	int size;

	public Stack_Increment(int maxSize) {
		arr = new int[maxSize];
		top = -1;
		size = maxSize;
	}

	public void push(int x) {
		if (top < size - 1) {

			arr[++top] = x;
		}
	}

	public int pop() {
		if (top == -1) {
			return -1;
		}

		return arr[top--];
	}

	public void increment(int k, int val) {
		int limit = Math.min(k, top + 1);
		for (int i = 0; i < limit; i++) {
			arr[i] += val;
		}
	}

	public static void main(String[] args) {

		// Your CustomStack object will be instantiated and called as such:
		int maxSize = 10;
		Stack_Increment obj = new Stack_Increment(maxSize);
		int x = 12;
		obj.push(x);
		int param_2 = obj.pop();
		int k = 2, val = 100;
		obj.increment(k, val);

		 
	}

}
