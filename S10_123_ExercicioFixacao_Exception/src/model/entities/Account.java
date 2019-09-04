package model.entities;

import model.entities.exceptions.valueException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account() {

	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public void deposit(Double amount) {
		this.balance += amount;
	}

	public void withdraw(Double amount) throws valueException {

		if (balance == 0) {
			if (amount > this.withdrawLimit) {
				throw new valueException("Not enough balance");
			}

		}

		if (amount > withdrawLimit) {
			throw new valueException("The amount exceeds withdraw limit");
		}

		if (amount > this.balance) {
			throw new valueException("Not enough balance");
		}
		this.balance -= amount;
	}

}
