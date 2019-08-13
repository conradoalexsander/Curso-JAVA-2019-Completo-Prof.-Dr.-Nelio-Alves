package application;

import java.util.Scanner;

public class Program_Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		int cont_neg = 0;

		// mat.length retorna o número de linhas na matriz
		// mat[i~.length conta a quantidade de colunas
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();

			}

		}
		System.out.println("Main diagonal: ");
		for (int i = 0; i < n; i++) {
			System.out.println(mat[i][i] + " ");
		}
		System.out.println();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j] < 0) {
					cont_neg++;
				}
			}
		}
		System.out.println("Number of negative numbers= " + cont_neg);
		sc.close();
	}

}
