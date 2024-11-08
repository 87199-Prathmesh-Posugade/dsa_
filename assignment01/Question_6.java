package day01;

public class Question_6 {

	public static void main(String[] args) {
//		Find the first non-repeating element: Input: { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 } Ouput: 3

		int[] arr = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		System.out.println("First non-repeating element: " + nonRepeating(arr));
	}

	private static int nonRepeating(int[] arr) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			for (j = 0; j < arr.length; j++) {
				if (arr[j] == arr[i] && i != j)
					break;
			}
			if (j == arr.length)
				return arr[i];
		}
		return -1;
	}
}
