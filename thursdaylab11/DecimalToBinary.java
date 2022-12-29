package thursdaylab11;

import java.util.Scanner;

public class DecimalToBinary {
  public static void main(String[] args) {
    // Create a Scanner object to read input from the user
    Scanner scanner = new Scanner(System.in);
    
    // Prompt the user to enter a decimal number
    System.out.print("Enter a decimal number: ");
    
    // Read the decimal number from the user
    int decimal = scanner.nextInt();
    
    // Initialize a variable to store the binary equivalent of the decimal number
    String binary = "";
    
    // Divide the decimal number by 2 and store the remainder until the decimal number becomes 0
    while (decimal > 0) {
      int remainder = decimal % 2;
      binary = remainder + binary;
      decimal = decimal / 2;
    }
    
    // Print the binary  of the decimal number
    System.out.println("Binary : " + binary);
  }
}

