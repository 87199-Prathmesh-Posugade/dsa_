package day01;

public class Employee {
	private int empId;
	public Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]\n";
	}	
}
