package cap2;

import java.util.Locale;
import java.util.Scanner;

public class Ex2_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double weightkg, heightm;
		double imc;
		
		System.out.print("Inform your height in meters: ");
		heightm = sc.nextDouble();
		System.out.println();
		System.out.print("Inform your weight in kg: ");
		weightkg = sc.nextDouble();
		System.out.println();
		
		imc = (weightkg/(heightm*heightm));
		System.out.printf("Your IMC is: %.2f", imc);
		System.out.println();
		
		if (imc<18.5) {
			System.out.println("You are underweight");
		} else if (imc >= 18.5 && imc <= 24.9){
			System.out.println("You are normal :)");
			
		} else if (imc >= 25  && imc <= 29.9){
			System.out.println("You are overweight, be carefull");
		} else if (imc >= 30) {
			System.out.println("You are obese. Please, contact you doctor!");
			
		} else {
			System.out.println("Incorrect values, try again");
		}
		System.out.println();
		System.out.printf("BMI VALUES\r\n" + 
				"Underweight: less than 18.5\r\n" + 
				"Normal: between 18.5 and 24.9\r\n" + 
				"Overweight: between 25 and 29.9\r\n" + 
				"Obese: 30 or greater");
		sc.close();
		

	}

}
