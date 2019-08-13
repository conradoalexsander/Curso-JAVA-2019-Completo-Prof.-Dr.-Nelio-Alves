/*
 * Exercício 05
Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1038.java
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
 */

package exerciciosParte2;

import java.util.Locale;
import java.util.Scanner;

public class Ep2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Por favor informe o código do pedido: ");
		double codPedido = sc.nextDouble();
		
		System.out.println("Por favor informe a quantidade: ");
		double quantidade = sc.nextDouble();
		
		
		if(codPedido == 1) {
			double total =  4*quantidade;
			System.out.printf("Total: R$ %.2f", total);
			
		} else if(codPedido == 2) {
			double total =  4.5*quantidade;
			System.out.printf("Total: R$ %.2f", total);
			
		} else if(codPedido == 2) {
		double total =  5*quantidade;
		System.out.printf("Total: R$ %.2f", total);
		
		} else if(codPedido == 3) {
		double total =  5*quantidade;
		System.out.printf("Total: R$ %.2f", total);
		
		}	else if(codPedido == 4) {
		double total =  2*quantidade;
		System.out.printf("Total: R$ %.2f", total);
		
		} else if(codPedido == 5) {
		double total =  1.5*quantidade;
		System.out.printf("Total: R$ %.2f", total);
		
		} else {
		System.out.println("Código não encontrado. Por favor, confira o código no cardápio e tente novamente.");
	}
		sc.close();
}
}
