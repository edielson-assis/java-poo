package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, Integer> vote = new TreeMap<>();

        System.out.print("Enter file path: ");
		String sourceFileStr = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {

			String line = br.readLine();
			while (line != null) {

				String[] fields = line.split(",");
				String name = fields[0];
				int quantity = Integer.parseInt(fields[1]);

				if (vote.containsKey(name)) {
					int count = vote.get(name);
					vote.put(name, quantity + count);
				}
				else {
					vote.put(name, quantity);
				}
				line = br.readLine();
			}

			for (String key : vote.keySet()) {
				System.out.println(key + ": " + vote.get(key));
			}
        } 
        catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } 

        sc.close();
    }
}