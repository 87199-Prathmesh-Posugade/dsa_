import java.util.Arrays;

class MaxHeap {
	int size;

	public MaxHeap() {
		size = 0;
	}

	public void addHeap(int arr[]) {

		for (int i = 1; i < arr.length; i++) {
			size++;
			int ci = size;
			int pi = ci / 2;
			while (pi >= 1) {
				if (arr[pi] > arr[ci])
					break;
				int temp = arr[pi];
				arr[pi] = arr[ci];
				arr[ci] = temp;
				ci = pi;
				pi = ci / 2;
			}
		}
	}

	public void deleteHeap(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int min = arr[1];
			arr[1] = arr[size];
			arr[size] = min;
			size--;
			int pi = 1;
			int ci = pi * 2;
			while (ci <= size) {
				if ((ci + 1) >= size && arr[ci + 1] > arr[ci])
					ci = ci + 1;
				if (arr[pi] > arr[ci])
					break;
				int temp = arr[pi];
				arr[pi] = arr[ci];
				arr[ci] = temp;
				pi = ci;
				ci = pi * 2;
			}
		}
	}

	public void sort(int arr[]) {
		addHeap(arr);
		deleteHeap(arr);
	}
}

public class Tester {
	public static void main(String[] args) {
		int a[] = { 0, 2, 45, 2, 324, 34, 23, 78, 3 };
		System.out.println(Arrays.toString(a));
		MaxHeap m = new MaxHeap();
		m.sort(a);
		System.out.println(Arrays.toString(a));
	}
}
