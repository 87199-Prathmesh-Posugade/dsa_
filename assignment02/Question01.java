

import java.util.Arrays;

public class Question01 {
//	Modify the insertion sort algorithm to sort the array in descending order
	public static void main(String[] args) {
		int arr[] = { 55, 44, 22, 66, 11, 33 };
		for (int i = 1; i < arr.length; i++) {
			int t = arr[i], j;
			for (j = i - 1; j > -1 && t > arr[j]; j--) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = t;
		}
		System.out.println(Arrays.toString(arr));
	}
}
