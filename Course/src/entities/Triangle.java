package entities;

public class Triangle {
	
	public double a;
	public double b;
	public double c;
	
	public double AreaTriangulo(){

		double area;
		double p;

		p = (a + b + c) / 2.0;

		area = Math.sqrt((p * (p - a) * (p - b) * (p - c)));
		return area;
	}
}
