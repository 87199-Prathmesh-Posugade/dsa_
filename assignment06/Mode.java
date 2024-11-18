package day08;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;

public class Mode {

	public static void main(String[] args) {
//		Calculate the mode of an array. The mode is the element occurred maximum time in the array.
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		Integer[] arr = { 1, 2, 3, 3, 3, 9, 9, 9, 9, 9, 9, 9};
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j] && i != j) {
					count++;
				}
			}
			h.put(arr[i], count);
		}

		int max = Integer.MIN_VALUE;
		for (int i : h.values()) {
			if (i > max) {
				max = i;
			}
		}
		
		Collection<Entry<Integer, Integer>> a = h.entrySet();
		for (Entry<Integer, Integer> i : a) {
			if (i.getValue() == max) {
				max = i.getKey();
			}
		}
		
		System.out.println(max);
	}
}
