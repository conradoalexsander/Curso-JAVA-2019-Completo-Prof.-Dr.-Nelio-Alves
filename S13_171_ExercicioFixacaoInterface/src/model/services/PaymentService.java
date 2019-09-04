package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installments;

public class PaymentService {

	

	private OnlinePaymentService onlinePaymentService;


	public PaymentService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}


	public void installmentProccess(Contract contract, Integer numberInstallment) {

		Calendar cal = Calendar.getInstance();
		cal.setTime(contract.getDate());

		for (int i = 1; i <= numberInstallment; i++) {
			
			cal.add(Calendar.MONTH, 1);
			Date dueDate = cal.getTime();
			double amount = onlinePaymentService.amount(contract.getTotalValue() / numberInstallment, i);
			contract.addInstallment(new Installments(dueDate, amount));
			
		}
	}

}
