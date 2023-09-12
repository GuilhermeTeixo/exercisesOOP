package exercisesOOP;
import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Ex1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter rectangle width and height:");
		rectangle.width=sc.nextDouble();
		
		
		sc.close();
	}

}
