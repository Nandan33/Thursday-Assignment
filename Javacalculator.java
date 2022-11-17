package ta5;

import java.util.Scanner;

public class Javacalculator {
	
	//creating a static function to check inputs are greater than 0 and throw exception if cobditions met
	public static void check(double a,double b) throws Exception {
		if(a<1||b<1) {
			throw new Exception(" Input is Less than zero ");
		}
		
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			//asking user to enter inputs
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input 1");
		double a=sc.nextDouble();
		System.out.println("Enter the input 2");
		double b=sc.nextDouble();
		
		//it will call check method and varify the inputs
		check(a,b);
		
		//print the statement
		System.out.println("Select operation To be performed + , - , * , or / ");
		
		//asking user to enter operator
		char operator=sc.next().charAt(0);
		sc.close();
		
		System.out.println("Result : ");
		
		//switch will perform operations based upon the keys presented inside a cases 
		switch (operator) {
		case ('+'): {
			
			System.out.println(a+" + "+b +" = "+ (a+b));
			break;
		}
		case ('-'):{
			System.out.println(a+" - "+b+" = "+(a-b));
			break;
		}
		case ('*'):{
			System.out.println(a+"*"+b+" = "+ (a*b));
			break;
		}
		case ('/'):{
			System.out.println(a+"/"+b+" = "+ (a/b));
			break;
		}
		default: // if user enters other than mentioned case this method excecutes 
			System.out.println("invalid input operator ");

		}
		}
		//if inputs are 0 then catch block will excecute 
		catch(Exception e) {
			System.out.println("Invalid input Change input greater than 0 ");
		}
		
		
		
	}

}
