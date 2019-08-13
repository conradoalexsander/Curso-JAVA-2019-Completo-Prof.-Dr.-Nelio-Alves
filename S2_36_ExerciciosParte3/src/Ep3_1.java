/*
Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
Exemplo:
Entrada: Saída:
2200     Senha Invalida
1020     Senha Invalida
2022     Senha Invalida
2002     Acesso Permitido
 */
import java.util.Scanner;

public class Ep3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a senha");
	
		int password = sc.nextInt();
		
		while (password != 2002) {
			
			System.out.println("Senha invalida");
			password = sc.nextInt();
			
		}
		
		System.out.println("Acesso permitido");
		sc.close();
	}

}
