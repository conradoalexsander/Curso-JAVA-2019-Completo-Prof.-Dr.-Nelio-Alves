/*
 * Exercício 03
Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1044.java
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.
Exemplos:
Entrada: Saída:
6 24     Sao Multiplos
Entrada: Saída:
6 25     Nao sao Multiplos
Entrada: Saída:
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
			System.out.println("São Múltiplos");
		} else {
			System.out.println("Não são múltiplos");
		}
		
		sc.close();
	}

}
