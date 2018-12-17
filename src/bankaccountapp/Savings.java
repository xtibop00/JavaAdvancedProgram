package bankaccountapp;

public class Savings extends Account{
	
	int safetyDepositBoxID;
	int safetyDepositBoxKey;
	
	public Savings(String name, String sSN, double initDeposit){
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
		
	}
	
	
	@Override
	public void setRate() {
		rate = getBaseRate() - .25;		
	}
	
	private void setSafetyDepositBox(){
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}
	
	public void showInfo(){
		System.out.println("Account Type: Savings");
		super.showInfo();
		System.out.println(
					"Safety Deposit Features" + 
					"\n	Your Deposit Box ID: " + safetyDepositBoxID +
					"\n	Your Deposit Box Key: " + safetyDepositBoxKey);

	}


}
