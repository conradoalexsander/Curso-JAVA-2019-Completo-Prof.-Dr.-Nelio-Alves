import java.util.Scanner;

public class Ep3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o tipo de combustivel preferido.");
		int tipoCombustivel = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		while (tipoCombustivel != 4) {

			switch (tipoCombustivel) {
			case 1:
				alcool = alcool + 1;
			case 2:
				gasolina = gasolina + 1;
			case 3:
				diesel = diesel+1;
				
			default:
				System.out.println("Insira um n�mero no valor de 1 a 4");
	
			}
			
			tipoCombustivel = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}

}