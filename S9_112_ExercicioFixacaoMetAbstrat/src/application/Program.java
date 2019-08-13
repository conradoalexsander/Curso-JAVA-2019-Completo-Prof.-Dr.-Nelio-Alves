package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.Person;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double totalTaxes = 0;
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		System.out.println();
		List<Person> list = new ArrayList<>();
		sc.nextLine();
		
		for(int i=1; i <= n; i++) {
			System.out.print("Tax payer #"+ i +" data: \n");
			System.out.print("Individual or company (i/c)?");
			char typePerson = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			sc.nextLine();
			
			switch (typePerson) {
			case 'i':
				System.out.print("Health expenditures: ");
				double healthExpenditure = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditure));
				break;
			
			case 'c':
				System.out.print("Number of employees: ");
				int numberEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numberEmployees));
				break;
				
			default:
				break;
			
		}
		}
			
		System.out.println("TAXES PAID: ");
		
		for(Person e : list) {
			
			System.out.println(e.taxesPaid());
		    totalTaxes += e.taxCalculator();
		}
		
		
		System.out.println("TOTAL TAXES: $ " + totalTaxes);
		
		sc.close();

	}

}
