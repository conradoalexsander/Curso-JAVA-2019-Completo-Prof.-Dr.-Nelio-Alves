package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		/*System.out.print("Number of items to be stored: ");
		int n = sc.nextInt();*/
		Product[] vect = new Product[3];
		
		for(int i=0; i<vect.length; i++) {
			
			System.out.printf("Name of item (%d): ", i+1);
			String name = sc.nextLine();
			System.out.printf("Price of item (%d): ", i+1);
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
			sc.nextLine();
		}
		
		double sum = 0.0;		
		for (int i=0;i<vect.length;i++) {
			sum += vect[i].getPrice();
		}
		
		double avg =sum/vect.length;
		
		System.out.printf("AVERAGE PRICE: $ %.2f", avg);
		sc.close();
	}

}
