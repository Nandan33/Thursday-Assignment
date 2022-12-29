package thursdaylab11;

import java.util.Scanner;
import java.util.HashSet;

public class PrintDuplicateCharacters {
  public static void main(String[] args) {
    // Create a Scanner object to read input from the user
    Scanner scanner = new Scanner(System.in);
    
    //  user to enter a string
    System.out.print("Enter a string: ");
    
    // Read the string from the user
    String str = scanner.nextLine();
    
    // Create a HashSet to store the characters that have been encountered
    HashSet<Character> set = new HashSet<>();
    
    // Initialize an empty string to store the duplicate characters
    String duplicates = "";
    
    // Iterate through the string and add each character to the HashSet
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (set.contains(c)) {
        // If the character is already in the HashSet, it is a duplicate
        duplicates += c;
      } else {
        set.add(c);
      }
    }
    
    // Print the duplicate characters
    System.out.println("Duplicate characters: " + duplicates);
  }
}

