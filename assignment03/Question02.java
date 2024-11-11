package day04;

import java.util.Scanner;

class CircularQueue {
	private int arr[];
	private int size;
	private int front;
	private int rear;
	public int filled;

	public CircularQueue(int s) {
		size = s;
		rear = front = -1;
		arr = new int[s];
		filled = 0;
	}

	public void enq(int data) {
		if (isFull()) {
			return;
		}
		rear = (rear + 1) % size;
		arr[rear] = data;
		filled++;
	}

	public int deq() {
		if (isEmpty()) {
			return -1;
		} else {
			int pop = arr[(front + 1) % size];
			front = (front + 1) % size;
			if (front == rear)
				front = rear = -1;
			filled--;
			return pop;
		}
	}

	public int peek() {
		if (isEmpty()) {
			return -1;
		}
		return arr[(front + 1) % size];
	}

	public boolean isEmpty() {
//		return front == rear && front == -1;
		return filled == 0;
	}

	public boolean isFull() {
//		return (front == -1 && rear == size - 1) || (front == rear && front != -1);
		return filled == size;
	}
}

public class Question02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CircularQueue q = new CircularQueue(5);
		while (true) {
			System.out.println("1. Peek.");
			System.out.println("2. Push.");
			System.out.println("3. Pop.");
			System.out.print(" . Enter Choice: ");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("Peek: " + q.peek());
				break;
			case 2:
				System.out.print("Enter data: ");
				q.enq(sc.nextInt());
				break;
			case 3:
				System.out.println("Popped data: " + q.deq());
				break;
			default:
				break;
			}
		}
	}

}
