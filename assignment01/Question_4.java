package day01;

import java.util.Scanner;

public class Question_4 {
	@SuppressWarnings("resource")
	public static void main(String[] java) {
//		Implement binary search algorithm if array is sorted in descending order.
		int[] arr = { 9, 8, 7, 6, 5, 4, 3 };
		System.out.println("Enter element: ");
		int index = rev_bin(arr, new Scanner(System.in).nextInt());
		if (index == -1)
			System.out.println("Element not found...!");
		else
			System.out.println("Element found at index: " + index);
	}

	private static int rev_bin(int[] arr, int i) {
		int low = 0;
		int high = arr.length - 1;
		int mid;
		while (low <= high) {
			mid = (low + high) / 2;
			if (arr[mid] == i)
				return mid;
			else if (arr[mid] > i)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return -1;
	}
}
