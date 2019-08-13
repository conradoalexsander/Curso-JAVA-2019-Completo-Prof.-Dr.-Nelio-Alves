package entities;

public abstract class Person {
	
	protected String name;
	protected Double anualIncome;
	
	public Person() {
		
	}

	public Person(String name, Double anualIncome) {
		super();
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	public abstract Double taxCalculator();
	public String taxesPaid() {
		return name + ": $ ";
	}
}

	
