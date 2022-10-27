package ta2;

import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {
		// using scanner class to take input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Input : ");
		
		// creating local variable num  
		long num = sc.nextLong();
		
		sc.close(); //closing scanner class object
		
		// using conditional statement to write  logic and display result
		if(num%2==0) {
			System.out.println(num+" is even Number");
		}else {
			System.out.println(num+" is odd Number");
		}

	}

}
