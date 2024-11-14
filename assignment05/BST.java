package day06;

class BinarySearchTree {
	Node root;
	int size;

	static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
		}
	}

	public BinarySearchTree() {
		root = null;
		size = 0;
	}

	public void inOrder() {
		System.out.println("In Order Traversal: ");
		inOrderRec(root);
	}

	private void inOrderRec(Node trav) {
		if (trav == null) {
			return;
		}
		inOrderRec(trav.left);
		System.out.print(trav.data + " - ");
		inOrderRec(trav.right);
	}

	public void count() {
		System.out.print("Count: ");
		count(root);
	}

	private int count(Node trav) {
		int count = 0;
		while (true) {
			if (trav == null) {
				count = count + 1;
			}
			trav=trav.left;
			
		}
	}

	public void addNode(int data) {
		Node newnode = new Node(data);
		if (root == null) {
			root = newnode;
			return;
		}
		addNode(root, data);
	}

	private void addNode(Node trav, int data) {
		if (trav.data > data) {
			if (trav.left == null) {
				trav.left = new Node(data);
				return;
			}
			addNode(trav.left, data);
		} else {
			if (trav.right == null) {
				trav.right = new Node(data);
				return;
			}
			addNode(trav.right, data);
		}
	}

	public boolean search(int data) {
		return search(root, data);
	}

	private boolean search(Node trav, int data) {
		if (trav != null) {
			if (trav.data == data) {
				return true;
			} else if (data > trav.data) {
				return search(trav.right, data);
			} else if (data < trav.data) {
				return search(trav.left, data);
			}
		}
		return false;
	}

	public int deapth(int data) {
		return deapth(root, data, 0);
	}

	private int deapth(Node trav, int data, int length) {
		if (trav != null) {
			if (trav.data == data)
				return length;
			if (data > trav.data)
				return deapth(trav.right, data, length + 1);
			return deapth(trav.left, data, length + 1);
		}
		return 0;
	}
}

public class BST {

	public static void main(String[] args) {
//		Write recursive function to add node into bst
//		Write recursive function to perfrom search operation in bst.
		BinarySearchTree b = new BinarySearchTree();
		b.addNode(8);
		b.addNode(3);
		b.addNode(10);
		b.addNode(2);
		b.addNode(15);
		b.addNode(6);
		b.addNode(14);
		b.addNode(4);
		b.addNode(7);
		b.addNode(9);

		System.out.println("8: " + b.search(8));
		System.out.println("6: " + b.search(6));
		System.out.println("4: " + b.search(4));
		System.out.println("7: " + b.search(7));
		System.out.println("14: " + b.search(14));
		System.out.println("5: " + b.search(5));
		System.out.println("13: " + b.search(13));

		System.out.println("8: " + b.deapth(8));
		System.out.println("6: " + b.deapth(6));
		System.out.println("4: " + b.deapth(4));
		System.out.println("7: " + b.deapth(7));
		System.out.println("14: " + b.deapth(14));
		System.out.println("5: " + b.deapth(5));
		System.out.println("13: " + b.deapth(13));
		b.inOrder();
		b.count();
	}
}
