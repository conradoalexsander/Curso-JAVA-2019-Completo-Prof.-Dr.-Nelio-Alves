package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// tenta executar a instrução para posteriormente ser tratado os erros

		Scanner sc = new Scanner(System.in);
		System.out.print("Insert the names in the vector: ");
		try {
			String[] vect = sc.nextLine().split(" ");

			System.out.print("Insert the position of the vector to be consulted: ");
			int position = sc.nextInt();
			System.out.println(vect[position]);

		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position: ");
			e.printStackTrace();
		}

		catch (InputMismatchException e) {
			System.out.println("Input error: ");
		}

		System.out.println("End of program!");
		sc.close();

	}
}
