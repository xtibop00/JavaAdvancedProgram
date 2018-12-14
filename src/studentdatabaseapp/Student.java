package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	public Student(){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("Enter student class level: ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		
	}
	
	private void setStudentID(){
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	public void enroll(){
		do {
			System.out.print("Enter courses to enroll (Q to Quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")){
				courses = courses + "\n   " + course;
				tuitionBalance = tuitionBalance + costOfCourse;
		}
		else{
			break ;
			}
		} while (1 != 0);
	}
	
	public void viewBalance(){
		System.out.println("Your balance is $: " + tuitionBalance);
	}
	
	public void payTuition(){
		System.out.print("Please enter your amount $: ");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $: " + payment);
		viewBalance();
	}
	
	public String toString(){
		return "Name: " + firstName.toUpperCase() + " " + lastName.toUpperCase() +
				"\nGrade Year: " + gradeYear +
				"\nStudent ID: " + studentID +
				"\nCourses Enrolled: " + courses.toUpperCase() + 
				"\nRemaining Balance $: " + tuitionBalance;
	}
}
