package day01;

import java.util.Scanner;

public class Question_7 {

	public static void main(String[] args) {
//		Find rank of an element in an array of integers. rank: rank of a given integer "x" in the array, is "total no.
//		of ele's less than or equal to x (including x). Input: { 10, 20, 15, 3, 4, 4, 1 } Ouput: Rank of 4 is: 4

		Scanner s = new Scanner(System.in);
		int[] arr = { 10, 20, 15, 3, 4, 4, 1 };

		System.out.print("Enter element to find rank: ");
		int ele = s.nextInt();
		int rank = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= ele)
				rank++;
		}
		System.out.println("Element's rank: " + rank);

	}

}
