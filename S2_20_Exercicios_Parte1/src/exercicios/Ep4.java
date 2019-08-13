package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ep4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o numero do funcionário: ");
		int number = sc.nextInt();
		
		System.out.println("Informe o número de horas trabalhadas: ");
		double hours = sc.nextDouble();
		
		System.out.println("Informe o o valor recebido por hora do funcionário ($): ");
		double valueHour = sc.nextDouble();

		double salary = hours*valueHour;

		System.out.println("NUMBER= " + number);
		System.out.printf("SALARY = U$ %.2f%n", salary);
		sc.close();
	}

}
