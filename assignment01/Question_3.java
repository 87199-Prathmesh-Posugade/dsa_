package day01;

import java.util.Arrays;
import java.util.Scanner;

public class Question_3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		Create array of employees and search 

		Employee[] emp = new Employee[5];
		emp[0] = new Employee(1, "Bhushan");
		emp[1] = new Employee(3, "mayur");
		emp[2] = new Employee(4, "Prathmesh");
		emp[3] = new Employee(5, "ritesh");
		emp[4] = new Employee(7, "Vishal");
		System.out.println(Arrays.toString(emp));

		System.out.print("Enter employee  name: ");
		int index = findEmployee(emp, sc.next());
		if (index == -1)
			System.out.println("Employee not found...!");
		else
			System.out.println("Employee found at index: " + index);

		System.out.print("Enter employee  id: ");
		index = findEmployeeId(emp, sc.nextInt());
		if (index == -1)
			System.out.println("Employee not found...!");
		else
			System.out.println("Employee found at index: " + index);
	}

	private static int findEmployee(Employee[] emp, String empName) {
		int low = 0;
		int high = emp.length - 1;
		int mid;
		while (low <= high) {
			mid = (low + high) / 2;
			if (emp[mid].getName().equals(empName))
				return mid;
			else if (emp[mid].getName().compareToIgnoreCase(empName) > 0)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}

	private static int findEmployeeId(Employee[] emp, int empId) {
		int low = 0;
		int high = emp.length - 1;
		int mid;
		while (low <= high) {
			mid = (low + high) / 2;
			if (emp[mid].getEmpId() == empId)
				return mid;
			else if (emp[mid].getEmpId() < empId)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return -1;
	}

}
