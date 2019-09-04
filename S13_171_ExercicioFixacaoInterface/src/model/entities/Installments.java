package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installments {
	
	private Date dueDate;
	private Double amount;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");  
	
	public Installments() {
	}
	public Installments(Date dueDate, Double amount) {
		this.dueDate = dueDate;
		this.amount = amount;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		String date = sdf.format(dueDate);
		return date + " - " + String.format("%.2f", amount);
	}

}
