package oops;

public class Insurance extends Citizen {

	public int InsuranceId;

	public Insurance() {

		super();// calls parent class default constructor
		System.out.println("Deafault Construcor of Insurance Class");
	}

	public void Print() {

		super.Print();// super accesses the parent class
		System.out.println("InsuranceId is " + InsuranceId);
	}

	public void Print(String message) {

		System.out.println("Typing some message " + "***"+ message +"***");

	}

}
