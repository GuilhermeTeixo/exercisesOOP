package exercises;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program5 {
	
	public static void main(String[] args) {

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter account numer: ");
	Account.setAccountNumber(sc.nextInt());
	System.out.println("Enter account holder: ");
	String clientName=sc.next();
	System.out.println("Is there an initial deposit (y/n)?");
	String initialDeposit=sc.next();
	
	Account account = new Account(clientName, 0, initialDeposit);
	
	account.accountInfo();
	
	
	sc.close();
	}	
}