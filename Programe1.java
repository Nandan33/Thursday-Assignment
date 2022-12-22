package thursday_Assignment10;





//Q1.Wap to accept a number and check number is prime or not.
public class Programe1 {

		  public static void main(String[] args) {
		    int number = 37; // change this number to check for other values
		    boolean isPrime = true;

		    // check if number is divisible by 2
		    if (number % 2 == 0) {
		      isPrime = false;
		    } else {
		      // if not, check the odd numbers
		      for (int i = 3; i <= Math.sqrt(number); i += 2) {
		        if (number % i == 0) {
		          isPrime = false;
		          break;
		        }
		      }
		    }

		    // print the result
		    if (isPrime) {
		      System.out.println(number + " is a prime number");
		    } else {
		      System.out.println(number + " is not a prime number");
		    }
		  }
		}

