package bankaccountapp;

public class Checking extends Account{
	
	int debitCardNumber;
	int debitCardPIN;
	
	public Checking(String name, String sSN, double initDeposit){
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
		
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() * .15;
	}
	
	private void setDebitCard(){
		debitCardNumber = (int) (Math.random() * Math.pow(16, 12));
		debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
	}
	
	public void showInfo(){
		System.out.println("Account Type: Checking");
		super.showInfo();
		System.out.println(
					"Safety Debit Card Details" + 
					"\n	Your Debit Card Number: " + debitCardNumber +
					"\n	Your Debit Card PIN: " + debitCardPIN);

	}


}
