package assignment04;

import java.util.Scanner;

class Queue {
	private Node rear;
	private Node front;

	static class Node {
		Node next;
		int data;
		Node prev;

		Node(int data) {
			this.data = data;
		}
	}

	public Queue() {
		rear = front = null;
	}

	public void push(int data) {
		Node newnode = new Node(data);
		if (rear == null) {
			newnode.next = newnode;
			newnode.prev = newnode;
			rear = front = newnode;
			return;
		}
		if (rear == front) {
			newnode.next = front;
			newnode.prev = front;
			front.next = newnode;
			front.prev = newnode;
			rear = newnode;
			return;
		}
		newnode.next = front;
		newnode.prev = rear;
		front.prev = newnode;
		rear.next = newnode;
		rear = newnode;
	}

	public int pop() {
		if (rear == null) {
			return -1;
		}
		int data;
		if (rear == front) {
			data = rear.data;
			rear = front = null;
			return data;
		}
		if (front.next == rear) {
			data = front.data;
			rear.next = rear;
			rear.prev = rear;
			front = rear;
			return data;
		}
		data = front.data;
		rear.next = front.next;
		front.next.prev = rear;
		front = front.next;
		return data;
	}

	public int peek() {
		return front.data;
	}
}

class Stack {
	static class Node {
		Node next;
		int data;

		Node(int data) {
			this.data = data;
		}
	}

	private Node start;

	public void push(int data) {
		Node newnode = new Node(data);
		newnode.next = start;
		start = newnode;
	}

	public int peek() {
		if (start == null) {
			return -1;
		}
		return start.data;
	}

	public int pop() {
		if (start == null)
			return -1;
		int data = start.data;
		start = start.next;
		return data;
	}
}

public class Question02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Queue q = new Queue();
		Stack q = new Stack();
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
