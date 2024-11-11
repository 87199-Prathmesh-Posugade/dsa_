package day03;

import java.util.Scanner;

class QueueZero {
	private int arr[];
	private int size;
	private int rear;
	private int front;

	public QueueZero(int s) {
		size = s;
		arr = new int[size];
		rear = front = 0;
	}

	public void push(int data) {
		arr[rear++] = data;
	}

	public int pop() {
		front++;
		return arr[front - 1];
	}

	public int peek() {
		return arr[front];
	}
}

public class Question03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QueueZero q = new QueueZero(5);
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
				q.push(sc.nextInt());
				break;
			case 3:
				System.out.println("Popped data: " + q.pop());
				break;
			default:
				break;
			}
		}

	}
}
