package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class ProgramIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int accNumber = sc.nextInt();
		System.out.printf("Enter account holder: ");
		sc.nextLine();
		String accName = sc.nextLine();
		
		System.out.println("Is there a initial depot (y/n): ");
		char validation = sc.next().charAt(0);
		
		if (validation == 'y') {
			System.out.println("Enter initial deposit value: ");
			double indept = sc.nextDouble();
			account = new Account(accNumber, accName, indept);
			
		} else if(validation == 'n') {
			account = new Account(accNumber, accName);
			System.out.println("Account data: ");
			System.out.print(account);
			System.out.println();
		
		} else {
			account = new Account(accNumber, accName);
			System.out.println("Opção inválida, tente novamente!");
			System.exit(0);
		}
		
		System.out.println("Account data: ");
		System.out.println(account);
		System.out.println();	
			
		System.out.println("Enter a depot value: ");
		double value = sc.nextDouble();
		account.dept(value);
		System.out.println("Updated account data: ");
		System.out.println(account);

		System.out.println("Enter a withdraw value: ");
		value = sc.nextDouble();
		account.withdrawal(value);
		System.out.println("Updated account data: ");
		System.out.println(account);

		sc.close();
	}

}
