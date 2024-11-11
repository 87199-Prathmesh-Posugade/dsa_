package day04;

import java.util.Arrays;

class Stack {
	private int[] arr;
	private int top;

	public Stack(int size) {
		this.arr = new int[size];
		top = -1;
	}

	public void push(int data) {
		top = top + 1;
		arr[top] = data;
	}

	public int pop() {
		int poped = arr[top--];
		return poped;
	}
}

public class Question01 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		Stack s = new Stack(arr.length);
		System.out.println(Arrays.toString(arr));
		for (int ele : arr) {
			s.push(ele);
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.pop();
		}
		System.out.println(Arrays.toString(arr));
	}
}
