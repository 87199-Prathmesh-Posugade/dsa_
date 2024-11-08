package day01;

import java.util.Arrays;
import java.util.Scanner;

public class Question_1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		Write a linear search algorithm to return index of last occurance of key.
		
		int[] arr = { 34, 7, 21, 9, 2, 9, 9 };
		System.out.println(Arrays.toString(arr));
		System.out.print("Enter Element last occurance: ");
		int key = linear_search(arr, sc.nextInt());
		if(key ==-1) 
			System.out.println("Element not found...!");
		else
			System.out.println("Element found at index: " + key);	


	}

	private static int linear_search(int[] arr, int element) {
		int lastOcuur = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element)
				lastOcuur = i;

		}
		return lastOcuur;
	}


}
