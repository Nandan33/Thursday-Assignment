package ta3;

import java.util.Scanner;

public class Swapnum {
	
	//main method
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);// using scanner class to take input from user
	System.out.println("Enter First variable");
	int a=scan.nextInt();//creating variable "a" and storing first input in a
	System.out.println("Enter Second variable");
	int b=scan.nextInt();//creating variable "b" and storing second input in b
	System.out.println(); // to print next line 
	System.out.println("Before Swapping "+ '\n' + "First variable is  : "+a+'\n'+"Second variable is : "+b);//printing "a" and "b"  before swaping and using  \n to print in next line 
	int c; // creating empty variable 
	scan.close(); // closing scanner class object
	System.out.println(); // printing next line 
	c=a; //swapping value of a to c respectively value of b to a and value of b to c i.e let a=1,b=2 then c=a==>1,a=b==>2,b=c==>1 
	a=b;
	b=c;
	System.out.println("After Swapping with Third variable"+'\n'+"First variable is  : "+a+'\n'+"Second variable is : "+b);
}
}
