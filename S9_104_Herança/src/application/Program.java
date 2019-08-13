package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account acc = new Account(1001, "Alexs", 1000.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);
		
		//UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1002, "bob", 0.0, 0.0);
		Account acc3 = new SavingsAccount(1003, "Maria", 1000.00, 0.01);
		
		//DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		//INSTANCEOF  (checa se a herança realmente existe)
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		acc.withdraw(200);
		System.out.println(acc.getBalance());
		
		acc3.withdraw(200);
		System.out.println(acc3.getBalance());
	}

}
