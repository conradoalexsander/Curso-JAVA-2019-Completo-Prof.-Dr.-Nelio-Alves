package application;

import java.util.Scanner;

import entities.Rent;

public class RentProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner sc = new Scanner(System.in);
		Rent[] rent = new Rent[10];

		System.out.print("How many rooms wil be rented: ");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			sc.nextLine();
		System.out.println("Rent #" + (i+1) + ":");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Room: ");
		int room = sc.nextInt();
		rent[i] = new Rent(name, email, room);
		System.out.println();
		

	}
		System.out.println("Busy rooms: ");
		for (int i = 0; i < n; i++) {
			if (rent[i] != null) {
		    System.out.println(rent[i].getRoom() + ":"+" "+rent[i].getName()+", "+rent[i].getEmail());
			}
		}
		
sc.close();
}
}
