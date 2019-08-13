/*Exercise 1 from Curso de JAVA completo 2019 - Prof. Dr. Nelio Alves
 * Class 20 

Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.
Exemplos:
Entrada: Saída:
10       SOMA = 40
30

Entrada: Saída:
-30      SOMA = -20
10

Entrada: Saída:
0        SOMA = 0
0

 */

package exercicios;

import java.util.Scanner;

public class ExercicioProposto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número (n1)");
		double n1 = sc.nextDouble();
		System.out.println("Informe o segundo número (n2)");
		double n2 = sc.nextDouble();
		double soma = n1 + n2;
		
		System.out.printf("SOMA: %.0f%n", soma);
		sc.close();

	}

}
