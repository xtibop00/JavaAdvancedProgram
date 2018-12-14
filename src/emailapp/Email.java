package emailapp;

import java.util.Scanner;

public class Email {
	
	private String lastName;
	private String firstName;
	private String password;
	private String department;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private int defaultPasswordLength = 10;
	private String companySuffix = "trobi.com";
	private String empEmail;

	
	//Contructor
	public Email(String firstName, String lastName){
		this.lastName = lastName;
		this.firstName = firstName;
//		System.out.println("Email created for :" + this.firstName + " " + this.lastName);
		
		this.department = setDepartment();
		System.out.println("Department :" + this.department);
		
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is :" + this.password);
		
		empEmail = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix;
//		System.out.println("The generate email :" + empEmail);
		
	}
	
	//Method to set values	
	private String setDepartment(){
		System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code : ");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int depSelected = in.nextInt();
		if (depSelected == 1){
			return "Sales";
		}else if(depSelected == 2){
			return "Dev";
			
		}else if (depSelected == 3){
			return "Acct";
		}else{
			return "None";
		}
	}
	
	private String randomPassword(int length){
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890!@#$%^&*()";
		char[] password = new char[length];
		for(int i=0; i<length; i++){
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//Set
	public void setMailboxCapacity(int mailCapacity){
		this.mailboxCapacity = mailCapacity;
	}
	
	public void setAlternateEmail(String altEmail){
		this.alternateEmail = altEmail;
	}
	
	public void changePassword(String newPassword){
		this.password = newPassword;
	}
	
	
	//Get
	public int getMailboxCapacity(){
		return mailboxCapacity;
	}
	
	public String getAlternateEmail(){
		return alternateEmail;
	}
	
	public String getPassword(){
		return password;
	}
	
	
	//Method to display information
	public String showInfo(){
		return "<------------------------------------------------>" +
				"\nDISPLAY NAME :" + firstName + " " + lastName +
				"\nEmail Address :" + empEmail +
				"\nMailbox Capacity :" + mailboxCapacity + " mb" +
				"\n<------------------------------------------------>";  
	}
	
}
