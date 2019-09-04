package model.services;

public class PayPalPaymentService implements OnlinePaymentService{
	
	public double amount(double value, int numberInstallment) {
		double totalValue = value+(value*0.01*numberInstallment);
		return totalValue + totalValue*0.02;
			
	}

}
