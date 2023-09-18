package exercises;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program4 {
public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CurrencyConverter CC = new CurrencyConverter();
		
		System.out.println("What is the dollar price?");
		CC.price = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		CC.amount = sc.nextDouble();
		
		double result = CC.convert();
		
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
		
		sc.close();
	}
}
