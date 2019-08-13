package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		List<Account> list = new ArrayList<>();

		list.add(new SavingsAccount(1001, "Alex", 1570.0, 0.02));
		list.add(new SavingsAccount(1002, "Maria", 2000.0, 0.01));
		list.add(new BusinessAccount(1003, "Bob", 1200.0, 500.0));
		list.add(new BusinessAccount(1004, "Bob", 1030.0, 500.0));
		
		double sum = 0.0;
		
		for(Account acc : list) {
			sum+=acc.getBalance();
		}
		
		for(Account acc : list) {
			sum+=acc.deposit(10);
		}
		System.out.printf("TOTAL ACCOUNTS BALANCE: $ %.2f%n", sum);
		System.out.println();
		for(Account acc : list) {
			System.out.printf(" Updated account %d balance: $ %.2f%n ", acc.getNumber(), acc.getBalance());
		}

	}
}

