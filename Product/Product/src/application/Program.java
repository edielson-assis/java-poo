package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List <Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Product #" + (i+1) +" data:");
            System.out.print("Common, used, imported (c/u/i)? ");
            char resp = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if (resp == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            }
            else if (resp == 'c') {
                list.add(new Product(name, price));
            }
            else {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(sc.next());
                list.add(new UsedProduct(name, price, manufactureDate));
            }            
        }

        System.out.println("\nPRICE TAGS:");
        for (Product product : list) {
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}