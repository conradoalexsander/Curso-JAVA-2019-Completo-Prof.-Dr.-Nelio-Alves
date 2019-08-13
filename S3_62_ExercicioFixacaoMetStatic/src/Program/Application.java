package Program;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("What is the dollar price: ");
		double price = sc.nextDouble();
		
		System.out.printf("How many dollars will be bought: ");
		double dollar = sc.nextDouble();
		
		double amount = CurrencyConverter.dollarPrice(price, dollar);
		
		System.out.printf("Amout to be paid in reais: %.2f", amount);
		
		sc.close();
		
	}

}
