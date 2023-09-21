package entities;

public class Account {
	
	public static int accountNumber;
	public String clientName;
	public double balance;
	public String initialDeposit;
	
	public Account(String clientName, double balance, String initialDeposit) {
		this.clientName = clientName;
		this.balance = balance;
	
	if (initialDeposit.equalsIgnoreCase("y")) {
		this.initialDeposit = "y";
		
	} else if (initialDeposit.equalsIgnoreCase("n")) {
		this.initialDeposit = "n";
		
	} else {
		
		System.out.println("Please,use 'y' or 'n' to anwser correctly.");
		this.initialDeposit = "n";
		}
	}
	
	public String accountInfo() {
		System.out.printf("Account data: \nAccount %d, Houlder: %s, Balance: $%f\n",accountNumber, clientName, balance);
		return accountInfo();
	}

	public static int getAccountNumber() {
		return accountNumber;
	}

	public static void setAccountNumber(int accountNumber) {
		Account.accountNumber = accountNumber;
	}
}