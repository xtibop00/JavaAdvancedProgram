package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
	
		System.out.print("Enter number of students to enroll: ");
		Scanner in = new Scanner(System.in);
		int noOfStudents = in.nextInt();
		Student[] person = new Student[noOfStudents];
		
		for (int i = 0; i < noOfStudents; i++){
			person[i] = new Student();
			person[i].enroll();
			person[i].payTuition();
			System.out.println(person[i].toString());
					
		}

	}

}
