package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int numberEmployees = sc.nextInt();

		
		for (int i = 1; i <= numberEmployees; i++) {
			System.out.print("Employee #" + i + " data: \n");
			System.out.print("Outsourced (y/n)? ");
			char contractType = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();

			switch (contractType) {
			case 'y':
				System.out.println("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				list.add(new OutsourceEmployee(name, hours, valuePerHour, additionalCharge));
				break;
			case 'n':
				list.add(new Employee(name, hours, valuePerHour)); // adicionando a lista sem criar variável
				break;																			

			default:
				break;

			}
		}
		System.out.println();
		System.out.println("PAYMENTS: ");
		for (Employee emp : list) {
			System.out.print(emp.getName() + " - $ " + String.format("%.2f", emp.payment())+"\n");
		}
		sc.close();
	}
}
