package course;

import java.util.Scanner;

public class Exemplo43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the measures of triangle x: ");

		double ax = sc.nextDouble();
		double bx = sc.nextDouble();
		double cx = sc.nextDouble();

		System.out.println("Enter the measures of triangle y: ");

		double ay = sc.nextDouble();
		double by = sc.nextDouble();
		double cy = sc.nextDouble();

		double areax = AreaTriangulo(ax, bx, cx);
		double areay = AreaTriangulo(ay, by, cy);

		System.out.println("Triangle X area: " + areax);
		System.out.println("Triangle Y area: " + areay);
		sc.close();
		if (ax > 0 && bx> 0 && cx > 0 && ay >0 && by >0 && cy> 0){
			if (areax > areay) {
				System.out.println("Triangle X has the bigger area");
			} else if (areax < areay) {
				System.out.println("Triangle Y has the bigger area");
			} else {
				System.out.println("The triangles have the same area");
			}
			}else{
				System.out.println("Incorrect value (negative or null values are not allowed), please, try again");
	}}

	public static double AreaTriangulo(double a, double b, double c) {

		double area;
		double p;

		p = (a + b + c) / 2;

		area = Math.sqrt((p * (p - a) * (p - b) * (p - c)));
		return area;
	}
	
}
