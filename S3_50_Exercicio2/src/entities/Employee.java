package entities;

public class Employee {

	String name;
	double gross_salary;
	double tax;
	

	public double NetSalary() {
		return gross_salary - tax;
	}

	public void IncreaseSalary(double percentage) {
		this.gross_salary = gross_salary + (gross_salary * (percentage/100));
	}

	public String toString(){
		return	name
				+", $ "
				+String.format("%.2f", NetSalary());
	}
}
