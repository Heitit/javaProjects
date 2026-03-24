package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Product;

public class Project {

	public static void main(String[] arg) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Coloque as informações do produto: ");

		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Price: ");
		double price = sc.nextDouble();

		System.out.print("Quantity: ");
		int quantity = sc.nextInt();

		Product product = new Product(name, price, quantity);

		System.out.println();
		System.out.println("Product data: " + product);

		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProduct(quantity);

		System.out.println();
		System.out.println("Update data: " + product);

		System.out.println();
		System.out.println("Enter the number of products to be remove in stock: ");
		quantity = sc.nextInt();
		product.removeProduct(quantity);

		System.out.println();
		System.out.println("Update data: " + product);
		sc.close();
	}
}
