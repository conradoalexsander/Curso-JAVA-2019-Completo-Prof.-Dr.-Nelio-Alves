import java.util.Scanner;

public class Ep4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um n�mero de 1 at� 1000 e descubra os n�meros �mapares nesse intervalo");
		int X = sc.nextInt();
		
		if (X>=1 && X<=1000) {
			for (int i = 1; i <= X; i++) {
				if (i%2 != 0){
					System.out.println(i);
				}
			}
		} else {
			System.out.println("Valor fora do intervalo.");
		}
		
		sc.close();
		
	}

}
