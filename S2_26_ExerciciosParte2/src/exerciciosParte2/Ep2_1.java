package exerciciosParte2;

import java.util.Scanner;

public class Ep2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Please, inform the number: ");
		int n1 = sc.nextInt();

		if (n1 < 0) {
			System.out.println("NEGATIVO");
			
		} else {
			System.out.println("NÃO NEGATIVO");
			
		}
		
		sc.close();
	}

}
