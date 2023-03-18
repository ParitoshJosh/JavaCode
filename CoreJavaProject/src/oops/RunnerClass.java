package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Employee.java
		Employee emp1 = new Employee();
		emp1.Name = "Shweta";
		emp1.EmpId = 1000;
		emp1.DisplayName();

		Employee emp2 = new Employee();
		emp2.Name = "David";
		emp2.EmpId = 1001;
		emp2.DisplayName();

		Employee emp3 = new Employee("Rohan", 1002);
		emp3.DisplayName();

		Employee.DisplaySalary();

		// Inheritance Example : Person.java --> Citizen.java
		System.out.println("**** Creating ct1");
		Citizen ct1 = new Citizen();
		ct1.Name = "Mike";
		ct1.age = 50;
		ct1.SSN = 12345;
		ct1.CountryName = "India";
		ct1.Print();
		
		System.out.println("**** Creating ct2");
		Citizen ct2 = new Citizen("Rahul", "India", 30, 6789);
		//ct2.Print();
		
		// Inheritance Example : Person.java-->Citizen.java-->Insurance.java
		System.out.println("**** Creating obj1");
		Insurance obj1 = new Insurance();
		obj1.InsuranceId = 3000;
		obj1.SSN=9999;
		obj1.Name="Alexa";
		obj1.Print();
		obj1.Print("Hello Class");
		
		// BankExample obj= new BankExample; object of Abstract class cannot be made
		
		ICICIBank bank=new ICICIBank();
		bank.Print();
		
		// EncapsulationExample.java
		System.out.println("****Encapsulation****");
		EncapsulationExample emp =new EncapsulationExample();
		emp.setSalary(5000);
		System.out.println("The Salary Is "+ emp.getSalary());
	}

}
