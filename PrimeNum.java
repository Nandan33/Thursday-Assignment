package ta3;

import java.util.Scanner;

public class PrimeNum {

	//main method 
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);//importing a scanner class to take input from the user
		
		System.out.println("Enter the number");// this is the first line to excecute in and print in console
		 long num = scan.nextLong(); // creating a local variable to store the input value using long datatype to store large numbers
		 scan.close(); // closing the scanner class object
		 int count=0; //creating empty variable 
		 
		 //using for loop and conditinal statement if and when condition are true incrementing the count  
		 for (int i = 1; i <=num ; i++) {
			if(num%i==0) {
				count++;
			}
		}
		 //when count is incremented to 2 then it will be prime number else it is not a prime number
		 if(count==2) {
			 System.out.println(num + " is Prime Number....");
		 }else {
			 System.out.println(num + " is Not Prime Number...!!!!");
		 }
	}
}
