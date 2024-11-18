package day08;

public class Count {

	public static void main(String[] args) {
		String str = "c java java cpp cpp cpp";
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			String curr = arr[i];
			System.out.print(curr + ": ");
			for (int j = 0; j < arr.length; j++) {
				if (curr.equals(arr[j]) && i != j) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
