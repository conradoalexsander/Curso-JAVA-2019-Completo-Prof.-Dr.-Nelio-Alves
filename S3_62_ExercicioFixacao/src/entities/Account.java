package entities;

public class Account{
	
	private int accNumber;
	private String accName;
	private double balance;
	
	public Account(int accNumber, String accName, double indept) {
		this.accNumber = accNumber;
		this.accName = accName;
		dept(indept);
	}
	
	public Account(int accNumber, String accName) {
		this.accNumber = accNumber;
		this.accName = accName; 
	}

	public int getAccNumber() {
		return accNumber;
	}


	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public double getBalance() {
		return balance;
	}

	public void dept(double dept) {
		this.balance += dept;
	}
	
	public void withdrawal(double withdrawal) {
		
		this.balance -= withdrawal + 5.00;
	}
	
	public String toString(){
		return "Account: " 
				+ this.accNumber
				+", Holder: " 
				+ this.accName
				+ ", Balance: $ "
				+ String.format("%.2f", this.balance);
	}
	
	

}
