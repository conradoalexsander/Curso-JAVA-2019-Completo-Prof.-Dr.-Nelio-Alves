/*
 * Exerc�cio 02
Corre��o: https://github.com/acenelio/nivelamento-java/blob/master/src/cond02.java
Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.
Exemplos:
Entrada: Sa�da:
12 	     PAR
Entrada: Sa�da:
-27      IMPAR
Entrada: Sa�da:
0        PAR
 */

package exerciciosParte2;

import java.util.Scanner;

public class Ep2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Please, inform the number: ");
		int n1 = sc.nextInt();

		if (n1%2 == 0) {
			System.out.println("PAR");
			
		} else {
			System.out.println("�MPAR");
			
		}
		
		sc.close();
	}

}
