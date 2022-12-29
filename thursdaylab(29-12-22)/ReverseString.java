package thursdaylab29_12_22;

import java.util.Scanner;

public class ReverseString {
  public static void main(String[] args) {
    // Create a Scanner object to read input from the user
    Scanner scanner = new Scanner(System.in);
    
    // Print user to enter a string
    System.out.print("Enter a string: ");
    
    // Read the string from the user
    String str = scanner.nextLine();
    
    // Initialize an empty string to store the reversed string
    String reversed = "";
    
    // Iterate through the string in reverse order and append each character to the reversed string
    for (int i = str.length() - 1; i >= 0; i--) {
      reversed += str.charAt(i);
    }
    
    // Print the reversed string
    System.out.println("Reversed string: " + reversed);
  }
}

