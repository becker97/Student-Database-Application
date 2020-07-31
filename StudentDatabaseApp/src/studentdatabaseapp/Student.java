package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int year;
	private String studentID;
	private String courses = null;
	private int tuitionBalance = 0;
	// Make these static since the values are true for every single object
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	// Constructor to prompt user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - 1st Year\n2 - 2nd Year\n3 - 3rd Year\n4 - 4th Year\nEnter student class level: ");
		this.year = in.nextInt();
		
		setStudentID();
	}
	
	// Generate Student ID
	private void setStudentID() {
		// Each time a student is created increment its ID by one
		id++;
		// Year + id
		this.studentID = year + "" + id;
	}
	
	// Enroll in courses
	public void enroll() {
		do {	
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q")) {
				courses = courses + "\n " + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else {break;}
		} while (1 != 0);
	}
	
	// View balance
	public void viewBalance() {
		System.out.println("Your balance is: "+ tuitionBalance);
	}
	
	// Pay Tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: €");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of €" + payment);
		viewBalance();
	}
	
	// Show info
	public String showInfo() {
		return "Name: " + firstName + " " + lastName +
				"\nStudent ID: " + studentID +
				"\nCourses Enrolled:" + courses +
				"\nBalance: €" + tuitionBalance;
	}
}
