package day3;

import java.util.Scanner;

public class LogicalOPeratore {
	public static void main(String[] args) {
		
		int val;
		Scanner s = new Scanner(System.in);
		System.out.println("enter a value");
		val=s.nextInt();
		s.close();
		
		// using AND Operator
		
		if((val>=10)&&(val%2==0))
			System.out.println("Greater and even");
		else
			System.out.println("Conditions not met.....");
		
		// using logical OR Operator
		
		if((val>=10)||(val%2==0))
			System.out.println("Either of the condition is true or both is true");
		else
			System.out.println("Conditions not met.....");
		
		
		
	}

}
