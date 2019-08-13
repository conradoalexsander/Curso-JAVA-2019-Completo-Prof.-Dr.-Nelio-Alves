package exerciciosParte2;

import java.util.Locale;
import java.util.Scanner;

public class Ep2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Por favor informe a coordenada X: ");
		double X = sc.nextDouble();
		
		System.out.println("Por favor informe a corrdenada Y: ");
		double Y = sc.nextDouble();
		
		if (X == 0 && Y == 0) {
			System.out.println("Origem");
			
		}else if (X >= 0 && Y >= 0) {
			
			System.out.println("Q1");
			
		} else if (X <= 0 && Y >= 0) {
			
			System.out.println("Q2");
			
		} else if (X <= 0 && Y <= 0) {
		
			System.out.println("Q3");
		
		} else if (X >= 0 && Y <= 0) {
		
			System.out.println("Q4");
		
		} 
		sc.close();
	}

}
