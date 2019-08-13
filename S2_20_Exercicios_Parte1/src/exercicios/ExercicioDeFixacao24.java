/*Exercío 2 do curso de JAVA completo 2019 - Prof. Dr. Nelio Alves
 * Aula 24 - exercício de fixação da estrutura if e else
 */


package exercicios;

import java.util.Scanner;

public class ExercicioDeFixacao24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Please, inform the first number: ");
		int n1= sc.nextInt();
		System.out.println("Please, inform the second number: ");
		int n2= sc.nextInt();
		System.out.println("Please, inform the third number: ");
		int n3= sc.nextInt();
		
		if (n1>=n2 && n1>=n3) {
			
			System.out.println("HIGHER = " + n1);
			
		} else if (n2>=n1 && n2>=n3){
			System.out.println("HIGHER = " + n2);
		}else {
			System.out.println("HIGHER = " + n3);
		}
		
		sc.close();
	}

}
