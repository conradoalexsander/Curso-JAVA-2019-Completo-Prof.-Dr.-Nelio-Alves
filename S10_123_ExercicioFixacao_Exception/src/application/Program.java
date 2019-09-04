package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.entities.exceptions.valueException;



public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.next();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		
		Account account = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println();
		System.out.print("Enter the amount for withdraw: ");
		
		try {
		account.withdraw(sc.nextDouble());
		System.out.println("New balance: " + account.getBalance());
		
		}
		
		catch (valueException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		sc.close();

	}

}
