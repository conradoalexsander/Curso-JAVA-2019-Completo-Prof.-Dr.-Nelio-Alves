package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installments;
import model.services.PayPalPaymentService;
import model.services.PaymentService;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter contract data: ");
		System.out.print("Number:");
		int number = sc.nextInt();
		sc.nextLine();

		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.nextLine());

		System.out.print("Contract value: ");
		double totalValue = sc.nextDouble();

		Contract contract = new Contract(number, date, totalValue);

		System.out.print("Enter number of installments: ");
		int numberInstallment = sc.nextInt();

		PaymentService paymentService = new PaymentService(new PayPalPaymentService());
			
		paymentService.installmentProccess(contract, numberInstallment);
		
		System.out.println("Installments: ");

		for (Installments n : contract.getInstallment()) {
			
			System.out.println(n);

		}

		sc.close();
	}

}