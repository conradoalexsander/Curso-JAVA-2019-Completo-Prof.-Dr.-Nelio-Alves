package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class CalculadoraAreaTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);

		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the measures of triangle x: ");

		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Enter the measures of triangle y: ");

		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areax = x.AreaTriangulo();
		double areay = y.AreaTriangulo();

		System.out.printf("Triangle X area: %.4f%n", areax);
		System.out.printf("Triangle Y area: %.4f%n", areay);
		sc.close();
		
		if (x.a > 0 && x.b > 0 && x.c > 0 && y.a > 0 && y.b > 0 && y.c > 0) {
			if (areax > areay) {
				System.out.println("Triangle X has the bigger area");
			} else if (areax < areay) {
				System.out.println("Triangle Y has the bigger area");
			} else {
				System.out.println("The triangles have the same area");
			}
		} else {
			System.out.println("Incorrect value (negative or null values are not allowed), please, try again");
		}

	}

}
