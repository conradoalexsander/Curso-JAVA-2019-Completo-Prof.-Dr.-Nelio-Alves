package course;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		int x, y;
		
		x = sc.nextInt();
		y= sc.nextInt();
		
		
		String teste = (x<y) ? "Y � maior":"Y � menor";
		
		System.out.println("valor teste: " + teste);
		
		sc.close();
		
	}

}
