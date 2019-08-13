/*
 * Exerc�cio 04
Corre��o: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1046.java
Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo, sabendo que o mesmo pode
come�ar em um dia e terminar em outro, tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas.
Exemplos:
Entrada: Sa�da:
16 2     O JOGO DUROU 10 HORA(S)
Entrada: Sa�da:
0 0      O JOGO DUROU 24 HORA(S)
Entrada: Sa�da:
2 16     O JOGO DUROU 14 HORA(S)
 */

package exerciciosParte2;

import java.util.Scanner;

public class Ep_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Por favor informe o hor�rio inicial: ");
		int numero_A = sc.nextInt();
		System.out.println("Por favor informe o hor�rio final: ");
		int numero_B = sc.nextInt();
		int duracao = Math.abs(numero_A - numero_B);
		
		if (duracao == 0) {
			System.out.println("O JOGO DUROU: 24 HORA(S)");
		} else {
			System.out.println("O JOGO DUROU: " +duracao+" HORA(S)");
		}

		sc.close();
	}

}
