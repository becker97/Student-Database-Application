package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// Ask how many new students is to be added
		System.out.print("Enter the number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		
		// Store each object (student) into an array
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		// Create n number of new students
		for(int n = 0; n < numOfStudents; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
		}
		
		for(int n = 0; n < numOfStudents; n++) {
			System.out.println(students[n].toString());
		}
	}

}
