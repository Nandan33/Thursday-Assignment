package thursday_Assignment10;

//Q2.WAP to accept a number and check number is palindrome or not.

public class programe2 {

	public static void main(String[] args) {
	    int number = 121; // change this number to check for other values
	    int originalNumber = number;
	    int reverse = 0;

	    //This logic first saves the original number in a separate variable. 
	    //Then, it uses a loop to reverse the digits of the number and stores the result 
	    //in a separate variable called reverse. Finally, 
	    //it compares the original number to the reversed number and prints the result.
	    while (number > 0) {
	      int lastDigit = number % 10;
	      reverse = (reverse * 10) + lastDigit;
	      number /= 10;
	    }

	    if (originalNumber == reverse) {
	      System.out.println(originalNumber + " is a palindrome");
	    } else {
	      System.out.println(originalNumber + " is not a palindrome");
	    }
	  }
}
