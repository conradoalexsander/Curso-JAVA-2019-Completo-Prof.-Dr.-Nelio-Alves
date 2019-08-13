package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int accNumber = sc.nextInt();
		System.out.printf("Enter account holder: ");
		sc.nextLine();
		String accName = sc.nextLine();
		
		Account account = new Account(accNumber, accName);
		System.out.println("Is there a initial depot (y/n): ");
		char validation = sc.next().charAt(0);
		
		switch(validation) {
		
		case 'y':
			System.out.println();
			System.out.println("Enter initial deposit value: ");
			double indept = sc.nextDouble();
			account.dept(indept);
			System.out.println("Account data: ");
			System.out.println(account);
			System.out.println();
			break;		
			
		case 'n':
			System.out.println();
			System.out.println("Account data: ");
			System.out.print(account);
			System.out.println();
			break;
		
		default:
			System.out.println("Opção inválida, tente novamente!");
		}
			
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
