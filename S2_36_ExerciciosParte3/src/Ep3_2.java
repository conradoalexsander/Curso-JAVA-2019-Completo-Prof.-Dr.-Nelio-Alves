import java.util.Scanner;

public class Ep3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira a coordenada: ");
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		
		while (X != 0 && Y != 0) {
			
			
			if (X > 0 && Y > 0) {
				
				System.out.println("Q1");
				
			} else if (X < 0 && Y > 0) {
				
				System.out.println("Q2");
				
			} else if (X < 0 && Y < 0) {
			
				System.out.println("Q3");
			
			} else if (X > 0 && Y < 0) {
			
				System.out.println("Q4");
			
			} 
			
			 X = sc.nextInt();
			 Y = sc.nextInt();
			}
		
		sc.close();
		}
	}


