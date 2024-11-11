package day04;

import java.util.Scanner;

class LinkedList {
	private Node start;

	static class Node {
		private int data;
		private Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public boolean insertAfterData(int data, int nData) {
		boolean isFound = false;
		Node trav = start;
		while (trav != null) {
			if (trav.data == data) {
				isFound = true;
				break;
			}
			trav = trav.next;
		}
		if (isFound) {
			Node newnode = new Node(nData);
			newnode.next = trav.next;
			trav.next = newnode;
			return true;
		}
		return false;
	}

	public boolean insertBeforeData(int data, int nData) {
		Node newNode = new Node(nData);
		if (start.next == null) {
			if (data == start.data) {
				newNode.next = start;
				start = newNode;
				return true;
			}
			return false;
		}
		if (start.data == data) {
			newNode.next = start;
			start = newNode;
			return true;
		}
		Node trav = start;
		boolean isFound = false;
		while (trav.next != null) {
			if (trav.next.data == data) {
				isFound = true;
				break;
			}
			trav = trav.next;
		}
		if (isFound) {
			newNode.next = trav.next;
			trav.next = newNode;
			return true;
		}
		return false;
	}

	public void insertStart(int data) {
		Node newNode = new Node(data);
		newNode.next = start;
		start = newNode;
	}

	public void traverse() {
		Node trav = this.start;
		System.out.print("start -> ");
		while (trav != null) {
			System.out.print(trav.data + " -> ");
			trav = trav.next;
		}
		System.out.print("null\n");
	}

	public boolean insertLocation(int data, int location) {
		Node newNode = new Node(data);
		if (location == 1) {
//		for inserting at start
			insertStart(data);
			return true;
		}
		if (location < 1 || start == null) {
			return false;
		}
		Node curr = start;
//		for inserting at last && curr.next != null at position greater than size.
		for (int i = 1; i < location - 1; i++) {
			curr = curr.next;
			if (curr == null) {
				return false;
			}
		}
		newNode.next = curr.next;
		curr.next = newNode;
		return true;
	}

	public void insertLast(int data) {
		Node curr = start;
		Node newNode = new Node(data);
		if (curr == null) {
			start = newNode;
			return;
		}
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = newNode;
		newNode.next = null;
	}

	public void deleteStart() {
		if (start == null) {
			return;
		}
		start = start.next;
	}

	public boolean deleteLocation(int loc) {
		if (loc < 1 || start == null) {
			return false;
		}
		if (loc == 1) {
			start = start.next;
			return true;
		}
		Node curr = start;
		for (int i = 1; i < loc - 1; i++) {
			curr = curr.next;
			if (curr.next == null) {
				return false;
			}
		}
		if (curr.next == null) {
			return false;
		}
		curr.next = curr.next.next;
		return true;
	}

	public boolean deleteLast() {
		if (start == null) {
			return false;
		}
		Node curr = start;
		if (curr.next == null) {
			start = null;
			return true;
		}
		while (curr.next.next != null) {
			curr = curr.next;
		}
		curr.next = null;
		return true;
	}
}

public class Question03 {

//		In singly linear list implement following operations.
//		insert a new data after a given data
//		insert a new data before a given data

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		while (true) {
			System.out.println("1. Travese.");
			System.out.println("2. Insert at start.");
			System.out.println("3. Insert at location.");
			System.out.println("4. Insert at last.");
			System.out.println("5. Delete at start.");
			System.out.println("6. Delete at location.");
			System.out.println("7. Delete at last.");
			System.out.println("8. Insert a new data after a given data.");
			System.out.println("9. Insert a new data before a given data.");
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
			case 8:
				System.out.print("Enter data after which you have to insert: ");
				int aData = sc.nextInt();
				System.out.print("Enter data: ");
				int data = sc.nextInt();
				if (l.insertAfterData(aData, data)) {
					l.traverse();
				} else {
					System.out.println("Data is not present in list...!");
				}
				break;
			case 9:
				System.out.print("Enter data before which you have to insert: ");
				aData = sc.nextInt();
				System.out.print("Enter data: ");
				data = sc.nextInt();
				if (l.insertBeforeData(aData, data)) {
					l.traverse();
				} else {
					System.out.println("Data is not present in list...!");
				}
				break;
			default:
				break;
			}
		}
	}
}
