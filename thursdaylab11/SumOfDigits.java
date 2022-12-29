package thursdaylab11;

import java.util.Scanner;

public class SumOfDigits {
  public static void main(String[] args) {
    // Create a Scanner object to read input from the user
    Scanner scanner = new Scanner(System.in);
    
    // Prompt the user to enter an integer
    System.out.print("Enter an integer: ");
    
    // Read the integer from the user
    int n = scanner.nextInt();
    
    // Initialize a variable to store the sum of the digits
    int sum = 0;
    
    // Extract the last digit of the integer and add it to the sum until the integer becomes 0
    while (n > 0) {
      int digit = n % 10;
      sum += digit;
      n /= 10;
    }
    
    // Print the sum of the digits
    System.out.println("Sum of digits: " + sum);
  }
}

