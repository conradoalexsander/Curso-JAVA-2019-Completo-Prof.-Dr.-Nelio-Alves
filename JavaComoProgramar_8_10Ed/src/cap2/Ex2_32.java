package cap2;

import java.util.Scanner;

public class Ex2_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n;
		int cont_neg = 0;
		int cont_pos = 0;
		int cont_null = 0;

		for (int i = 0; i < 5; i++) {
			System.out.printf("Insira o %dº número: ", (i+1));
			n = sc.nextInt();
			if (n < 0) {
				cont_neg = cont_neg + 1;

			} else if (n > 0) {
				cont_pos = cont_pos + 1;

			} else {
				cont_null = cont_null + 1;
			}
			
		}
		System.out.println();
		System.out.println("Número de entradas positivas: " + cont_pos);
		System.out.println("Numero de entradas negativas: " + cont_neg);
		System.out.println("Número de zeros: " + cont_null);
		sc.close();
	}

}
