package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter client data");
		System.out.print("Name: ");
		String clientName = sc.nextLine();
		System.out.print("Email: ");
		String clientEmail = sc.nextLine();
		System.out.print("Birthdate (DD/MM/YYY): ");
		Date birthDate = sdf.parse(sc.next());
		sc.nextLine();
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		Client client = new Client(clientName, clientEmail, birthDate);
		Order order = new Order(new Date(), status, client);
		
		System.out.print("How many items to this order? ");
		int items = sc.nextInt();
	
		for (int i = 1; i <= items; i++) {
			sc.nextLine();
			System.out.print("Enter #" + i + " item data:\n");
			System.out.print("Name: ");
			String productName = sc.nextLine();
			System.out.print("Price: ");
			double productPrice = sc.nextDouble();
			Product product = new Product(productName, productPrice);
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			OrderItem orderItem = new OrderItem(quantity, productPrice, product);
			
			order.addItem(orderItem);
		}
		
		System.out.println("ORDER SUMMARY: ");
		System.out.print(order);
		sc.close();
	}

}
