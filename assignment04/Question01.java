package assignment04;

import java.util.Scanner;

class LinkedList {
	private Node tail;
	private int size = 0;

	static class Node {
		private int data;
		private Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public void insertStart(int data) { // O(1)
		size++;
		Node newNode = new Node(data);
		if (tail == null) {
			tail = newNode;
			tail.next = tail;
			return;
		}
		newNode.next = tail.next;
		tail.next = newNode;
	}

	public void traverse() { // O(n)
		System.out.println("size: " + size + " ");
		if (tail == null) {
			System.out.print("null <- tail\n");
			return;
		}
		Node trav = this.tail;
		do {
			trav = trav.next;
			System.out.print(" -> " + trav.data);
		} while (trav != tail);
		System.out.print(" <- tail -> \n");
	}

	public boolean insertLocation(int data, int location) { // O(n)
		if (location < 1 || location > size + 1)
			return false;
		if (location == 1) {
			insertStart(data);
			return true;
		}
		if (location == size + 1) {
			insertLast(data);
			return true;
		}
		size++;
		Node newNode = new Node(data);
		Node curr = tail;
		for (int i = 1; i < location; i++) {
			curr = curr.next;
		}
		newNode.next = curr.next;
		curr.next = newNode;
		return true;
	}

	public void insertLast(int data) { // O(1)
		size++;
		Node newNode = new Node(data);
		if (tail == null) {
			tail = newNode;
			tail.next = tail;
			return;
		}
		newNode.next = tail.next;
		tail.next = newNode;
		tail = newNode;
	}

	public void deleteStart() { //O(1)
		if (tail == null) {
			return;
		}
		if (tail.next == tail) {
			size--;
			tail = null;
			return;
		}
		tail.next = tail.next.next;
		size--;
	}

	public boolean deleteLocation(int loc) { //O(n)
		if (loc < 1 || loc > size) {
			return false;
		}
		if (loc == 1) {
			deleteStart();
			return true;
		}
		if (loc == size) {
			deleteLast();
			return true;
		}
		Node curr = tail;
		for (int i = 1; i < loc; i++) {
			curr = curr.next;
		}
		curr.next = curr.next.next;
		size--;
		return true;
	}

	public boolean deleteLast() { //O(n)
		if (tail == null) {
			return true;
		}
		if (tail.next == tail) {
			size--;
			tail = null;
			return true;
		}
		Node curr = tail;
		while (curr.next != tail) {
			curr = curr.next;
		}
		curr.next = curr.next.next;
		tail = curr;
		size--;
		return true;
	}
}

public class Question01 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		Implement singly circular linked list using tail pointer (no head pointer). Compare time complexities of
//		all operations.
		LinkedList l = new LinkedList();
		while (true) {
			System.out.println("1. Travese.");
			System.out.println("2. Insert at start.");
			System.out.println("3. Insert at location.");
			System.out.println("4. Insert at last.");
			System.out.println("5. Delete at start.");
			System.out.println("6. Delete at location.");
			System.out.println("7. Delete at last.");
			System.out.print(" . Enter Choice: ");
			switch (sc.nextInt()) {
			case 2:
				System.out.print("Enter element: ");
				l.insertStart(sc.nextInt());
				l.traverse();
				break;
			case 1:
				l.traverse();
				break;
			case 3:
				System.out.print("Enter element and location: ");
				if (!l.insertLocation(sc.nextInt(), sc.nextInt())) {
					System.out.println("Enter valid location...!");
				}
				l.traverse();
				break;
			case 4:
				System.out.print("Enter element: ");
				l.insertLast(sc.nextInt());
				l.traverse();
				break;
			case 5:
				l.deleteStart();
				l.traverse();
				break;
			case 6:
				System.out.print("Enter location: ");
				if (!l.deleteLocation(sc.nextInt())) {
					System.out.println("Invalid position cannot delete...!");
				}
				l.traverse();
				break;
			case 7:
				if (l.deleteLast()) {
					l.traverse();
				} else {
					System.out.println("List is empty...!");
				}
				break;
			default:
				break;
			}
		}
	}
}
