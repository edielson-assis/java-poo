package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        Product product = new Product(name, price, quantity);

        System.out.println("\nProduct data: " + product);
        System.out.print("\nEnter the number of products to be added in stock: ");
        int addProducts = sc.nextInt();
        product.addProducts(addProducts);

        System.out.println("\nUpdated data: " + product);
        System.out.print("\nEnter the number of products to be removed from stock: ");
        int removeProducts = sc.nextInt();
        product.removeProducts(removeProducts);
        
        System.out.println("\nUpdated data: " + product + "\n");

        sc.close();
    }
}