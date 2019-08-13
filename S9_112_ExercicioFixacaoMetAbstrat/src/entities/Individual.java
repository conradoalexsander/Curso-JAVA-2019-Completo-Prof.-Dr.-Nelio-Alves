package entities;

public class Individual extends Person {

	private Double healthExpenditure;

	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpenditure) {
		super(name, anualIncome);
		this.healthExpenditure = healthExpenditure;
	}

	public Double getHealthExpenditure() {
		return healthExpenditure;
	}

	public void setHealthExpenditure(Double healthExpenditure) {
		this.healthExpenditure = healthExpenditure;
	}

	@Override
	public Double taxCalculator() {
		double tax = 0;
		if (super.getAnualIncome() < 20000) {
			tax = super.getAnualIncome() * 0.15;
		} else{
			tax = super.getAnualIncome() * 0.25;
		}

		if (healthExpenditure > 0) {
			tax -= healthExpenditure*0.50;
		}

		return tax;
	}
	
	@Override
	public String taxesPaid() {
		return name + ": $ " + String.format("%.2f", taxCalculator());
	}

}
