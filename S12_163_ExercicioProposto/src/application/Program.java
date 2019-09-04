package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter file path: ");
		String path = sc.nextLine();
		boolean newDirectory = new File(path + "\\out").mkdir();

		List<Product> list = new ArrayList<>();

		File sourceFile = new File(path);

		String sourceFolderStr = sourceFile.getParent();
		String targetFileStr = sourceFolderStr + "\\out\\summary.csv";
		

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {

				String[] vect = line.split(",");
				String name = vect[0];
				double price = Double.parseDouble(vect[1]);
				int quantity = Integer.parseInt(vect[2]);
				list.add(new Product(name, price, quantity));
				line = br.readLine();
			}

			

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
				for (Product product : list) {
					bw.write(product.getName() + "," + String.format("%.2f", product.totalValue()));
					bw.newLine();
				}

				System.out.println(targetFileStr + " CREATED!");
			}

			catch (IOException e) {
				System.out.println("Error writing reading file: " + e.getMessage());
			}

		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
		
		sc.close();
	}

}
