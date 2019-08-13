package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o valor do raio do círculo: ");
		double raio = sc.nextDouble();

		double area = (Math.PI) * (Math.pow(raio, 2));

		System.out.printf("área do círculo é: %.4f%n", area);
		sc.close();
	}

}
