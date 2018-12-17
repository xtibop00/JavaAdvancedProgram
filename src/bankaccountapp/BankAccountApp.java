package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<Account>();
		
		
		String file = "C:\\Users\\Admin\\Downloads\\NewBankAccount.csv";
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for(String[] accountHolder : newAccountHolders){
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initBalance = Double.parseDouble(accountHolder[3]);
			if(accountType.equals("Savings")){
				accounts.add(new Savings(name, sSN, initBalance));
			}else if(accountType.equals("Checking")){
				accounts.add(new Checking(name, sSN, initBalance));
			}
			else{
				System.out.println("ERROR READING ACCOUNT TYPE");
			}
		}
		
		for (Account acc : accounts){
			acc.showInfo();
		}
		
	}

}
