package day01;

import java.util.Scanner;

public class Question_5 {

	public static void main(String[] args) {
//		 Implement linear search algorithm to find the nth occurence of the given element. If nth occurrence is
//		 not found, return -1.
		int[] arr = { 9, 8, 7, 6, 5, 4, 3, 9, 9 };
		System.out.println("Enter element to search and occurence: ");
		Scanner s = new Scanner(System.in);
		int ele = s.nextInt();
		int occ = s.nextInt();
		int index = nthLinear(arr, ele, occ);
		if (index == -1)
			System.out.println("Element not found...!");
		else
			System.out.println("Element found at index: " + index);
	}

	private static int nthLinear(int[] arr, int ele, int occ) {
		int occs = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) {
				occs++;
				if (occs == occ)
					return i;
			}
		}
		return -1;
	}

}
