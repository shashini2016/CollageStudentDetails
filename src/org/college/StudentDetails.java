package org.college;

public class StudentDetails {
	private void information() {
		
		short Id = 9876;
		System.out.println("Student id is "+ Id);
		
		String name = "Ram";
		System.out.println("Student name is "+ name);
		
		String email = "aram@gamil.com";
		System.out.println("Student email id is "+ email);
		
		long phonenum = 7685332291l;
		System.out.println("Student phone number is "+ phonenum);
		
		String dept = "Computer Science";
		System.out.println("Department name is "+ dept);
		
		char gender = 'm';
		System.out.println("Student gender is "+ gender);
		
		String city = "Chennai";
		System.out.println("Student city is "+ city);
		
	}
	public static void main(String[] args) {
		StudentDetails det =new StudentDetails();
		det.information();
	}

}
