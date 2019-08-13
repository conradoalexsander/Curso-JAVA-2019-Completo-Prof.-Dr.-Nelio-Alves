package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please, inform the number of people: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Inform the height of person (%d)", (i+1));
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0;
		for (int i=0; i<n; i++) {
			sum += vect[i];
		}
		
		double avg = sum/n;
		System.out.printf("AVERAGE HEIGHT: %.2f", avg);
		
		sc.close();

	}

}
