package exercises;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program5 {
	
	public static void main(String[] args) {

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	Account account;
	
	System.out.print("Enter account numer: ");
	int number = sc.nextInt();
	System.out.print("Enter account holder: ");
	sc.nextLine();
	String holder = sc.nextLine();
	System.out.print("Is there an initial deposit (y/n)?");
	char response = sc.next().charAt(0) ;

	if (response == 'y') {
		System.out.println("Enter initial deposit: ");
		double initialDeposit = sc.nextDouble();
		account = new Account (number, holder, initialDeposit);
	} 
	else {
		account = new Account (number, holder);
	}
	
	System.out.println();
	System.out.println("Account data:");
	System.out.println(account);
	
	System.out.println();
	System.out.print("Enter a deposit value: ");
	double depositValue=sc.nextDouble();
	account.deposit(depositValue);
	System.out.println("Updated accout data: ");
	System.out.println(account);
	
	System.out.println();
	System.out.print("Enter a withdraw value: ");
	double withdrawValue=sc.nextDouble();
	account.deposit(withdrawValue);
	System.out.println("Updated accout data: ");
	System.out.println(account);
	
	sc.close();
	}	
}