package entities;

public class CurrencyConverter {
	
	public double price;
	public double amount;
		
	public static double IOF = 0.06;
		
	public double convert () {
		double currency = price*amount;
		double tax = currency*IOF;
		return currency + tax;
		}
	}
