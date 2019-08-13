package entities;

import java.util.Locale;
import java.util.Scanner;

public class application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.printf("Name: ");
		employee.name = sc.nextLine();
		
		System.out.printf("Gross salary: ");
		employee.gross_salary = sc.nextDouble();

		System.out.printf("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println("Employee: " + employee);
		
		System.out.printf("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.IncreaseSalary(percentage);
		
		System.out.println("Updated data: " + employee);
		sc.close();	
	}

}
