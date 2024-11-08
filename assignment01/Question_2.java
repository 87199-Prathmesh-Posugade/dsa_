package day01;

import java.util.Arrays;
import java.util.Scanner;

public class Question_2 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//	 Write a program to print no of comparisions done to search a key in

		int[] index = { 0, 1, 2, 3, 4, 5 };
		int[] arr = { 5, 6, 7, 8, 9, 10 };
		System.out.println(Arrays.toString(index));
		System.out.println(Arrays.toString(arr));
		System.out.print("Enter Element to search: ");
		int key[] = binary_search(arr, sc.nextInt());
		if (key[0] == -1)
			System.out.println("Element found not found with comparisions: " + key[1]);
		else
			System.out.println("Element found at index: " + key[0] + " with comparisions: " + key[1]);
	}

	private static int[] binary_search(int[] arr, int nextInt) {
		int low = 0;
		int high = arr.length - 1;
		int mid;
		int retArr[] = new int[2];
		int comp = 0;
		while (low <= high) {
			comp++;
			mid = (low + high) / 2;
			if (arr[mid] == nextInt) {
				retArr[0] = mid;
				retArr[1] = comp;
				return retArr;
			} else if (nextInt > arr[mid])
				low = mid + 1;
			else
				high = mid - 1;

		}
		retArr[0] = -1;
		retArr[1] = comp;
		return retArr;
	}
	
}
