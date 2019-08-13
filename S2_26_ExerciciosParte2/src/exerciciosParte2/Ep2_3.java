/*
 * Exerc�cio 03
Corre��o: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1044.java
Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em
ordem crescente ou decrescente.
Exemplos:
Entrada: Sa�da:
6 24     Sao Multiplos
Entrada: Sa�da:
6 25     Nao sao Multiplos
Entrada: Sa�da:
24 6     Sao Multiplos
 */

package exerciciosParte2;

import java.util.Scanner;

public class Ep2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Please, inform the number: ");
		int numero_A = sc.nextInt();
		int numero_B = sc.nextInt();
		
		if(numero_A % numero_B == 0 || numero_B % numero_A == 0) {
			System.out.println("S�o M�ltiplos");
		} else {
			System.out.println("N�o s�o m�ltiplos");
		}
		
		sc.close();
	}

}
