package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.printf("Inform number M: ");
		int m = sc.nextInt();

		System.out.printf("Inform number N: ");
		int n = sc.nextInt();
		int cont = 0;

		int[][] matrix = new int[m][n];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.println("Inform number X to start your search: ");
		int x = sc.nextInt();

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[m][n] == x) {
					cont++;

				}
			}
		}
		
		System.out.println(cont);
		sc.close();
	}
}