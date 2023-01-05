package testcode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Contact {
	public static void main(String[] args) {
		// Create a hash table to store the data
		Map<String, String> data = new HashMap<>();

		// Read the data from the file
		try (BufferedReader reader = new BufferedReader(new FileReader("F:\\data\\data.txt"))) {
			// Read each line of the file
			String line;
			while ((line = reader.readLine()) != null) {
				// Split the line into name and phone number
				String[] fields = line.split("\t");
				String name = fields[0];
				String phoneNumber = fields[1];
				// Add the name and phone number to the hash table
				data.put(name, phoneNumber);
			}
		} catch (IOException e) {
			// Print an error message if there is a problem reading the file
			System.out.println(" error occurred while reading the file: " + e.getMessage());

		}

		// Read input from the user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a name or phone number: ");
		String input = scanner.nextLine();

		// Check if the input is a name or phone number and print the corresponding
		// value
		if (data.containsKey(input)) {
			// If the input is a name, print the corresponding phone number
			System.out.println("Phone number: " + data.get(input));
		} else {
			// If the input is not a name, check if it is a phone number

			// Set a flag to indicate that a match was not found
			boolean found = false;

			// Iterate through the entries in the hash table
			for (Map.Entry<String, String> entry : data.entrySet()) {
				// Check if the phone number in the current entry matches the input
				if (entry.getValue().equals(input)) {
					// If the input is a phone number, print the corresponding name
					System.out.println("Name: " + entry.getKey());

					// Set the flag to indicate that a match was found
					found = true;

					// Break out of the loop
					break;
				}
			}

			// If the flag is still false, it means that no match was found
			if (!found) {
				// If the input is not present in the hash table, print a message indicating
				// that no match was found
				System.out.println("No matching name or phone number was found.");
			}
		}
	}
}
