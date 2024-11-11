package day03;

import java.util.Arrays;

public class Question02 {
//	Write a function to sort employees by their salary
	public static void main(String[] args) {
		Employee[] arr = { new Employee("A", 33523), new Employee("B", 23523), new Employee("C", 44523),
				new Employee("D", 54523), new Employee("E", 11523) };
		System.out.println(Arrays.toString(arr));

		for (int i = 1; i < arr.length; i++) {
			Employee t = arr[i];
			int j;
			for (j = i - 1; j > -1 && t.getSalary() < arr[j].getSalary(); j--) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = t;
		}

		System.out.println(Arrays.toString(arr));
	}

}
