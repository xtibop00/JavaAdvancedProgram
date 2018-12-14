package emailapp;

public class EmailApp {

	public static void main(String[] args) {

		Email emp = new Email("Patrick", "Tibor");
		
		emp.changePassword("HelloPassword123");
		emp.setAlternateEmail("altemail@email.com");
		emp.setMailboxCapacity(1000);
		
//		System.out.println(emp.getAlternateEmail());
//		System.out.println(emp.getMailboxCapacity());
//		System.out.println(emp.getPassword());
		
		System.out.println(emp.showInfo());
	}

}
