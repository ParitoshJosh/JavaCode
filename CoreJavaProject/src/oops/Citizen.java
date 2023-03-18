package oops;

public class Citizen extends Person {
	public int SSN;

	public Citizen() {
		super();
		System.out.println("Default Constructor of Citizen");
	}

	public Citizen(String Name, String CountryName, int age, int SSN) {
		super();
		System.out.println("Parameterised Cons of Citizen");
		this.Name = Name;
		this.CountryName = CountryName;
		this.age = age;
		this.SSN = SSN;
		System.out.println("Name is :"+Name);
	}

	public void Print() {
		System.out.println("SSN is " + SSN);
		System.out.println("Name :" + Name);
	}
}
