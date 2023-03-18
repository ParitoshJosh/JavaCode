package oops;

public class Employee {

	public String Name;
	public int EmpId;
	private static int Salary=5000;

	public Employee() {
		System.out.println("Inside default constructor of Employee");
	}

	public Employee(String Name, int EmpId) {
		System.out.println("Inside parameterised constructor of Employee");
		this.Name = Name;
		this.EmpId = EmpId;

	}

	public void DisplayName() {
		System.out.println("Name of the employee is " + Name);
	}

	public static void DisplaySalary() {
		System.out.println("Salary of all employees is " + Salary);
	}
}
