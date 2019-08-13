package entities;

public class Company extends Person {
	
	private Integer numberEmployees;
	
	public Company() {
		
	}

	
	public Company(String name, Double anualIncome, Integer numberEmployees) {
		super(name, anualIncome);
		this.numberEmployees = numberEmployees;
	}



	public Integer getNumberEmployees() {
		return this.numberEmployees;
	}
	
	public void setNumberEployees(int numberEmployees) {
		this.numberEmployees = numberEmployees;
	}
	
	@Override
	public Double taxCalculator() {
		double tax = 0;
		if (numberEmployees < 10) {
			tax = super.getAnualIncome() * 0.16;
		} else {
			tax = super.getAnualIncome() * 0.14;
		}
		return tax;
	}
	
	@Override
	public String taxesPaid() {
		return name + ": $ " + String.format("%.2f", taxCalculator());
	}
	
	

}
